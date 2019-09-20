package com.uqpay.demo.uqpaydemo;

import com.alibaba.fastjson.JSON;
import com.uqpay.demo.uqpaydemo.config.TradeTypeEnum;
import com.uqpay.demo.uqpaydemo.dto.UnionPayDto;
import com.uqpay.demo.uqpaydemo.util.MerchantApiUtil;
import com.uqpay.demo.uqpaydemo.util.OkHttpUtil;
import com.uqpay.demo.uqpaydemo.util.PayConfigUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UqPayDemoApplicationTests {
    private Logger logger = LoggerFactory.getLogger(getClass());

    @Test
    public void testPay() {
        logger.info("***********支付请求**********");
        long startTime = System.currentTimeMillis();
        String reqStr = OkHttpUtil.postFormParams(PayConfigUtils.PAY_URL, createPay());
        long endTime = System.currentTimeMillis();
        logger.info("程序运行时间： " + (endTime - startTime) + "ms");
        logger.info("--->请求结果:" + reqStr);
        Map<String, Object> map = JSON.parseObject(reqStr, Map.class);
        String sign = (String) map.get("sign");
        map.remove("sign");
        logger.info("sign--->" + sign);
        boolean signFlag = MerchantApiUtil.isRightSign(map, PayConfigUtils.PAY_SECRET, sign);
        if (signFlag) {
            logger.info("验签成功");
        } else {
            logger.info("验签失败");
        }
        logger.info("***********支付请求**********");
    }

    private Map<String, Object> createPay() {
        String orderNo = String.valueOf(System.currentTimeMillis());
        logger.info("订单编号:" + orderNo);
        String amount = "32.5";
        String fee = "5.5";
        String transName = "黄焖鸡米饭";
        String remark = "今天中午午饭";
        UnionPayDto dto = new UnionPayDto(TradeTypeEnum.PAY, orderNo, amount, fee, transName, 1001, 1010, 1210,
                PayConfigUtils.PAY_NOTIFY_URL, remark, "", "F2", "F3", "", "");
        Map<String, Object> map = dto.createPayRequest();
        //签名及生成请求API的方法
        String sign = MerchantApiUtil.getSign(map, PayConfigUtils.PAY_SECRET);
        map.put("sign", sign);
        return map;
    }
}
