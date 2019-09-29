package com.uqpay.demo.uqpaydemo.dto;

import com.google.common.collect.Maps;
import com.uqpay.demo.uqpaydemo.config.TradeTypeEnum;
import com.uqpay.demo.uqpaydemo.util.PayConfigUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;

/**
 * @Date: 9:57 上午 2019/9/27
 * @Author: fox
 */
public class BaseDto {
    protected Logger logger = LoggerFactory.getLogger(getClass());

    /**
     * 交易类型
     */
    protected TradeTypeEnum tradeTypeEnum;

    protected String payKey;

    /**
     * 订单号
     */
    protected String orderNo;

    /**
     * 平台商户号
     */
    protected String plateNo;

    /**
     * 子商户号
     */
    protected String merchantId;

    /**
     * 说明
     */
    protected String remark;

    protected Map<String, Object> createBase() {
        Map<String, Object> map = Maps.newHashMap();
        map.put("tradeType", tradeTypeEnum.name());
        map.put("payKey", this.payKey);
        map.put("orderNo", this.orderNo);
        map.put("plateNo", this.plateNo);
        return map;
    }

    public BaseDto(TradeTypeEnum tradeTypeEnum, String orderNo, String plateNo, String merchantId, String remark) {
        this.tradeTypeEnum = tradeTypeEnum;
        this.orderNo = orderNo;
        this.plateNo = plateNo;
        this.merchantId = merchantId;
        this.remark = remark;
    }

    /**
     * 提现
     *
     * @param tradeTypeEnum
     * @param orderNo
     * @param remark
     */
    public BaseDto(TradeTypeEnum tradeTypeEnum, String payKey, String orderNo, String remark) {
        this.tradeTypeEnum = tradeTypeEnum;
        this.payKey = payKey;
        this.orderNo = orderNo;
        this.plateNo = PayConfigUtils.PLATE_NO;
        this.remark = remark;
    }

    protected String printLog(String message) {
        String log = "订单号[" + this.orderNo + "],请求失败：" + message;
        logger.info(log);
        return log;
    }

}
