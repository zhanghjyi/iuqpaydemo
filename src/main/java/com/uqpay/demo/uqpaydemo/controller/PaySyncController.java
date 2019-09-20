package com.uqpay.demo.uqpaydemo.controller;

import com.alibaba.fastjson.JSON;
import com.uqpay.demo.uqpaydemo.util.MerchantApiUtil;
import com.uqpay.demo.uqpaydemo.util.PayConfigUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

/**
 * 通知
 *
 * @author zy
 * @date 2019/9/20
 */
@RestController
public class PaySyncController {
    private Logger logger = LoggerFactory.getLogger(getClass());

    /**
     * 支付结果异步通知
     *
     * @param map
     * @param model
     * @param request
     * @return
     */
    @RequestMapping("/pay/notice")
    @ResponseBody
    public String paySync(@RequestParam Map<String, Object> map, Model model, HttpServletRequest request) {
        logger.info("支付结果回调--->");
        logger.info("支付结果--->" + JSON.toJSONString(map));
        String sign = (String) map.get("sign");
        map.remove("sign");
        logger.info("sign--->" + sign);
        boolean signFlag = MerchantApiUtil.isRightSign(map, PayConfigUtils.PAY_SECRET, sign);
        if (signFlag) {
            logger.info("验签成功");
            logger.info("订单[" + map.get("orderNo") + "]支付成功!");
            return "SUCCESS";
        } else {
            logger.info("验签失败");
            logger.info("订单[" + map.get("orderNo") + "]支付失败!");
            return "FAIL";
        }
    }

    /**
     * 提现结果通知
     *
     * @param map
     * @param model
     * @param request
     * @return
     */
    @RequestMapping("/withdraw/notice")
    @ResponseBody
    public String withdrawSync(@RequestParam Map<String, Object> map, Model model, HttpServletRequest request) {
        logger.info("提现结果通知--->");
        logger.info("提现结果--->" + JSON.toJSONString(map));
        String sign = (String) map.get("sign");
        map.remove("sign");
        logger.info("sign--->" + sign);
        boolean signFlag = MerchantApiUtil.isRightSign(map, PayConfigUtils.PAY_SECRET, sign);
        if (signFlag) {
            logger.info("验签成功");
            logger.info("提现订单[" + map.get("orderNo") + "]提现成功!");
            return "SUCCESS";
        } else {
            logger.info("验签失败");
            logger.info("提现订单[" + map.get("orderNo") + "]提现失败!");
            return "FAIL";
        }
    }
}
