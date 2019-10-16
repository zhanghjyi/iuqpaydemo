package com.uqpay.demo.uqpaydemo.controller;

import com.alibaba.fastjson.JSON;
import com.uqpay.demo.uqpaydemo.config.TradeTypeEnum;
import com.uqpay.demo.uqpaydemo.dto.UnionPayDto;
import com.uqpay.demo.uqpaydemo.util.MerchantApiUtil;
import com.uqpay.demo.uqpaydemo.util.OkHttpUtil;
import com.uqpay.demo.uqpaydemo.util.PayConfigUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

/**
 * @Date: 4:58 下午 2019/10/16
 * @Author: fox
 */
@Controller
public class PayInitController {
    private Logger logger = LoggerFactory.getLogger(getClass());

    @RequestMapping(value = "/pay/init")
    public String init(Model model) {
        String orderNo = String.valueOf(System.currentTimeMillis());
        logger.info("订单编号:" + orderNo);
        String amount = "100";
        String fee = "5";
        String transName = "黄焖鸡米饭";
        String remark = "今天中午午饭";
        UnionPayDto dto = new UnionPayDto(TradeTypeEnum.PAY, orderNo, amount, fee, transName, 1001, 1010, 1210,
                PayConfigUtils.PAY_NOTIFY_URL, remark, "", "F2", "F3", "", "");
        model.addAttribute("pay", dto);
        return "init";
    }

    @RequestMapping(value = "/pay/do_pay")
    public String do_pay(UnionPayDto dto, Model model) {
        logger.info("***********支付请求**********");
        long startTime = System.currentTimeMillis();
        Map<String, Object> param = dto.createPayRequest();
        //签名及生成请求API的方法
        String paySign = MerchantApiUtil.getSign(param, PayConfigUtils.PAY_SECRET);
        param.put("sign", paySign);
        String reqStr = OkHttpUtil.postFormParams(PayConfigUtils.PAY_URL, param);
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
        model.addAttribute("result", reqStr);
        return "result";
    }
}
