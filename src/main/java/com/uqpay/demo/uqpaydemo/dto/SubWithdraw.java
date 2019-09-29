package com.uqpay.demo.uqpaydemo.dto;

import com.uqpay.demo.uqpaydemo.config.TradeTypeEnum;
import com.uqpay.demo.uqpaydemo.util.PayConfigUtils;
import org.apache.commons.lang.StringUtils;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

/**
 * 提现参数
 *
 * @author zhangyi
 * @date 2019/9/18
 */
public class SubWithdraw extends BaseDto implements Serializable {

    /**
     * 提现子商户号
     */
    private String subUserNo;

    /**
     * 提现订单金额
     */
    private BigDecimal amount;

    /**
     * 持卡人名
     */
    private String firstName;

    /**
     * 持卡人姓
     */
    private String lastName;

    /**
     * 持卡人身份证
     */
    private String idNo;

    /**
     * 卡号
     */
    private String cardNum;

    /**
     * 通知地址
     */
    private String callBackUrl;

    /**
     * 提现备注
     */
    private String remark;

    public Map<String, Object> createWithdraw() {
        Map<String, Object> paramMap = super.createBase();
        try {
            if (check()) {
                paramMap.put("plateNo", PayConfigUtils.PLATE_NO);
                paramMap.put("remark", "test withdraw");
                paramMap.put("subUserNo", PayConfigUtils.SUB_USER_NO);
                paramMap.put("amount", this.amount.stripTrailingZeros().toPlainString());
                paramMap.put("firstName", this.firstName);
                paramMap.put("lastName", this.lastName);
                paramMap.put("idNo", this.idNo);
                paramMap.put("cardNum", this.cardNum);
                paramMap.put("callBackUrl", this.callBackUrl);
                return paramMap;
            }
        } catch (Exception e) {
            logger.error("订单["+this.orderNo+"]提现参数拼装失败：", e);
        }
        return null;
    }

    private boolean check() throws Exception {
        if (this.tradeTypeEnum == null) {
            throw new Exception(printLog("订单编号为空"));
        }
        if (StringUtils.isBlank(this.orderNo)) {
            throw new Exception(printLog("订单编号为空"));
        }
        if (StringUtils.isBlank(this.plateNo)) {
            throw new Exception(printLog("平台商户号为空"));
        }
        if (StringUtils.isBlank(this.subUserNo)) {
            throw new Exception(printLog("提现人商户号为空"));
        }
        if (this.amount == null) {
            throw new Exception(printLog("提现金额小于0"));
        }
        if (this.amount.compareTo(BigDecimal.ZERO) < 0) {
            throw new Exception(printLog("提现金额小于0"));
        }
        if (StringUtils.isBlank(this.firstName)) {
            throw new Exception(printLog("提现人名为空"));
        }
        if (StringUtils.isBlank(this.lastName)) {
            throw new Exception(printLog("提现人姓为空"));
        }
        if (StringUtils.isBlank(this.idNo)) {
            throw new Exception(printLog("提现人身份证为空"));
        }
        if (StringUtils.isBlank(this.cardNum)) {
            throw new Exception(printLog("提现人卡号为空"));
        }
        if (StringUtils.isBlank(this.callBackUrl)) {
            throw new Exception(printLog("提现结果通知地址为空"));
        }
        return true;
    }

    public SubWithdraw(String orderNo, String remark,String payKey,
                       String subUserNo, BigDecimal amount, String firstName, String lastName, String idNo,
                       String cardNum, String callBackUrl) {
        super(TradeTypeEnum.WITHDRAW, payKey, orderNo, remark);
        this.subUserNo = subUserNo;
        this.amount = amount;
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNo = idNo;
        this.cardNum = cardNum;
        this.callBackUrl = callBackUrl;
        this.remark = remark;
    }

}
