package com.uqpay.demo.uqpaydemo;

import com.alibaba.fastjson.JSON;
import com.uqpay.demo.uqpaydemo.dto.SubWithdraw;
import com.uqpay.demo.uqpaydemo.util.MerchantApiUtil;
import com.uqpay.demo.uqpaydemo.util.OkHttpUtil;
import com.uqpay.demo.uqpaydemo.util.PayConfigUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.Map;

/**
 * @Date: 6:27 下午 2019/9/26
 * @Author: fox
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class WithdrawTest {
    private Logger logger = LoggerFactory.getLogger(getClass());

    @Test
    public void testWithdraw() {
        logger.info("***********提现请求**********");
        long startTime = System.currentTimeMillis();
        String reqStr = OkHttpUtil.postFormParams(PayConfigUtils.WITHDRAW_URL, createSubWithdraw());
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
        logger.info("***********提现请求**********");
    }

    private Map<String, Object> createSubWithdraw() {
        String orderNo = String.valueOf(System.currentTimeMillis());
        logger.info("订单号:" + orderNo);
        SubWithdraw dto = new SubWithdraw(orderNo, "", PayConfigUtils.PAY_KEY, PayConfigUtils.SUB_USER_NO,
                new BigDecimal("3"),
                "jemmy", "zheng", "152224196103078489", "6212261001053286800", PayConfigUtils.WITHDRAW_NOTIFY_URL);
        Map<String, Object> map = dto.createWithdraw();
        //签名及生成请求API的方法
        String sign = MerchantApiUtil.getSign(map, PayConfigUtils.PAY_SECRET);
        map.put("sign", sign);
        return map;
    }
}
