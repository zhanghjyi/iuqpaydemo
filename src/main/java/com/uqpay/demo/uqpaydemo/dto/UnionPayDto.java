package com.uqpay.demo.uqpaydemo.dto;

import com.uqpay.demo.uqpaydemo.config.CurrencyEnum;
import com.uqpay.demo.uqpaydemo.config.TradeTypeEnum;
import com.uqpay.demo.uqpaydemo.util.PayConfigUtils;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author zhangyi
 * @date 2019/9/9
 */
public class UnionPayDto implements java.io.Serializable {
    private Logger logger = LoggerFactory.getLogger(getClass());

    /**
     * 业务类型（参考业务类型）
     */
    private TradeTypeEnum tradeType;

    /**
     * 支付方式（参考支付方式）
     */
    private String payWay = "UNIONPAY";

    /**
     * 支付类型（参考支付类型）
     */
    private String payType = "UNIONPAY_EXPRESSPAY";

    private String plateNo = PayConfigUtils.PLATE_NO;

    /**
     * 商户id（账单详情页显示商户信息）
     *
     * 入驻以后返回的商户ID
     */
    private String merchantId = "1005481";
    /**
     * 商户名称
     */
    private String merchantName = "光头湘菜";
    /**
     * 订单编号
     */
    private String orderNo;
    /**
     * 订单金额
     */
    private String amount;
    /**
     * 手续费
     */
    private String fee;
    /**
     * 订单币种
     */
    private CurrencyEnum currency = CurrencyEnum.USD;
    /**
     * 商户支付key
     */
    private String payKey = PayConfigUtils.PAY_KEY;

    /**
     * 持卡人名
     */
    private String firstName = "jemmy";
    /**
     * 持卡人姓
     */
    private String lastName = "zheng";
    /**
     * 身份证
     */
    private String idNo = "152224196103078489";
    /**
     * 手机号
     */
    private String mobile = "15805132325";
    /**
     * 卡号
     */
    private String cardNum = "6250947000000014";
    /**
     * cvv
     */
    private String cvv = "123";
    /**
     * 卡有效年
     */
    private String expireYear = "33";
    /**
     * 卡有效月
     */
    private String expireMonth = "12";
    /**
     * 所属国家或地区, 使用ISO 3166-1 标准的两位字母
     */
    private String addressContry = "CN";

    /**
     * 卡所属的邮箱
     */
    private String email = "1SG2q312@gmail.com";
    /**
     * 商品信息
     */
    private String transName;
    /**
     * 商品数量
     */
    private int quantity;
    /**
     * 门店ID
     */
    private int storeId;
    /**
     * 销售员ID
     */
    private int seller;

    /**
     * 页面返回地址
     */
    private String returnUrl;

    /**
     * 通知地址
     */
    private String callBackUrl;

    /**
     * 支付备注
     */
    private String remark;

    /**
     * 扩展字段1
     */
    private String field1;

    /**
     * 扩展字段2
     */
    private String field2;

    /**
     * 扩展字段3
     */
    private String field3;

    /**
     * 扩展字段4
     */
    private String field4;

    /**
     * 扩展字段5
     */
    private String field5;

    public Map<String, Object> createPayRequest() {
        Map<String, Object> paramMap = new HashMap<>(32);
        try {
            if (check()) {
                paramMap.put("tradeType", this.tradeType.name());
                paramMap.put("payWay", this.payWay);
                paramMap.put("payType", this.payType);
                paramMap.put("plateNo", this.plateNo);
                paramMap.put("merchantId", this.merchantId);
                paramMap.put("merchantName", this.merchantName);
                paramMap.put("orderNo", this.orderNo);
                paramMap.put("amount", this.amount);
                paramMap.put("fee", this.fee);
                paramMap.put("currency", this.currency.name());
                paramMap.put("payKey", this.payKey);
                paramMap.put("firstName", this.firstName);
                paramMap.put("lastName", this.lastName);
                paramMap.put("idNo", this.idNo);
                paramMap.put("mobile", this.mobile);
                paramMap.put("cardNum", this.cardNum);
                paramMap.put("cvv", this.cvv);
                paramMap.put("expireYear", this.expireYear);
                paramMap.put("expireMonth", this.expireMonth);
                paramMap.put("addressContry", this.addressContry);
                paramMap.put("email", this.email);
                paramMap.put("transName", this.transName);
                paramMap.put("quantity", this.quantity);
                paramMap.put("storeId", this.storeId);
                paramMap.put("seller", this.seller);
                paramMap.put("callBackUrl", this.callBackUrl);
                paramMap.put("returnUrl", this.returnUrl);
                paramMap.put("remark", this.remark);
                paramMap.put("orderNo", this.orderNo);

                //订单日期
                Date orderDate = new Date();
                String orderDateStr = new SimpleDateFormat("yyyyMMdd").format(orderDate);
                paramMap.put("orderDate", orderDateStr);

                //订单时间
                Date orderTime = new Date();
                String orderTimeStr = new SimpleDateFormat("yyyyMMddHHmmss").format(orderTime);
                paramMap.put("orderTime", orderTimeStr);

                // 订单有效期
                String orderPeriodStr = PayConfigUtils.ORDER_PERIOD;
                paramMap.put("orderPeriod", orderPeriodStr);

                ////////////扩展字段,选填,原值返回///////////
                // 扩展字段1
                paramMap.put("field1", this.field1);
                // 扩展字段2
                paramMap.put("field2", this.field2);
                // 扩展字段3
                paramMap.put("field3", this.field3);
                // 扩展字段4
                paramMap.put("field4", this.field4);
                // 扩展字段5
                paramMap.put("field5", this.field5);

                return paramMap;
            }
        } catch (Exception e) {
            logger.error("商户参数拼装失败:[" + this.orderNo + "]", e);
            return null;
        }
        return null;
    }

    private boolean check() throws Exception {
        if (StringUtils.isBlank(this.orderNo)) {
            throw new Exception(printLog("订单编号为空"));
        }
        if (this.tradeType == null) {
            throw new Exception(printLog("业务类型为空"));
        }
        if (StringUtils.isBlank(this.payWay)) {
            throw new Exception(printLog("支付方式为空"));
        }
        if (StringUtils.isBlank(this.payType)) {
            throw new Exception(printLog("支付类型为空"));
        }
        if (StringUtils.isBlank(this.merchantId)) {
            throw new Exception(printLog("商户id为空"));
        }
        if (StringUtils.isBlank(this.amount)) {
            throw new Exception(printLog("金额为空"));
        }
        if (StringUtils.isBlank(this.fee)) {
            throw new Exception(printLog("手续费为空"));
        }
        if (this.currency == null) {
            throw new Exception(printLog("币种为空"));
        }
        if (StringUtils.isBlank(this.payKey)) {
            throw new Exception(printLog("商户支付key为空"));
        }
        if (StringUtils.isBlank(this.firstName)) {
            throw new Exception(printLog("持卡人名为空"));
        }
        if (StringUtils.isBlank(this.lastName)) {
            throw new Exception(printLog("持卡人姓为空"));
        }
        if (StringUtils.isBlank(this.cardNum)) {
            throw new Exception(printLog("卡号为空"));
        }
        if (StringUtils.isBlank(this.cvv)) {
            throw new Exception(printLog("cvv为空"));
        }
        if (StringUtils.isBlank(this.expireYear)) {
            throw new Exception(printLog("卡有效年为空"));
        }
        if (StringUtils.isBlank(this.expireMonth)) {
            throw new Exception(printLog("卡有效月为空"));
        }
        if (StringUtils.isBlank(this.addressContry)) {
            //可空参数
        }
        if (StringUtils.isBlank(this.email)) {
            //可空参数
        }
        if (StringUtils.isBlank(this.transName)) {
            throw new Exception(printLog("商品信息为空"));
        }
        if (this.quantity == 0) {
            throw new Exception(printLog("商品数量为空"));
        }
        if (this.storeId == 0) {
            //可空参数
        }
        if (this.seller == 0) {
            //可空参数
        }
        if (StringUtils.isBlank(this.callBackUrl)) {
            throw new Exception(printLog("通知地址为空"));
        }
        if (StringUtils.isBlank(this.remark)) {
            //可空参数
        }
        return true;
    }

    private String printLog(String message) {
        String log = "订单号[" + this.orderNo + "],请求失败：" + message;
        logger.info(log);
        return log;
    }

    public UnionPayDto(TradeTypeEnum tradeType, String orderNo, String amount, String fee,
                       String transName, int quantity, int storeId, int seller, String callBackUrl,
                       String remark, String field1, String field2, String field3,
                       String field4, String field5) {
        this.tradeType = tradeType;
        this.orderNo = orderNo;
        this.amount = amount;
        this.fee = fee;
        this.currency = CurrencyEnum.USD;
        this.transName = transName;
        this.quantity = quantity;
        this.storeId = storeId;
        this.seller = seller;
        this.callBackUrl = callBackUrl;
        this.remark = remark;
        this.field1 = field1;
        this.field2 = field2;
        this.field3 = field3;
        this.field4 = field4;
        this.field5 = field5;
    }

    public UnionPayDto() {
    }

    public TradeTypeEnum getTradeType() {
        return tradeType;
    }

    public void setTradeType(TradeTypeEnum tradeType) {
        this.tradeType = tradeType;
    }

    public void setCurrency(CurrencyEnum currency) {
        this.currency = currency;
    }

    public String getPayWay() {
        return payWay;
    }

    public void setPayWay(String payWay) {
        this.payWay = payWay;
    }

    public String getPayType() {
        return payType;
    }

    public void setPayType(String payType) {
        this.payType = payType;
    }

    public String getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(String merchantId) {
        this.merchantId = merchantId;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getPayKey() {
        return payKey;
    }

    public void setPayKey(String payKey) {
        this.payKey = payKey;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCardNum() {
        return cardNum;
    }

    public void setCardNum(String cardNum) {
        this.cardNum = cardNum;
    }

    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }

    public String getExpireYear() {
        return expireYear;
    }

    public void setExpireYear(String expireYear) {
        this.expireYear = expireYear;
    }

    public String getExpireMonth() {
        return expireMonth;
    }

    public void setExpireMonth(String expireMonth) {
        this.expireMonth = expireMonth;
    }

    public String getAddressContry() {
        return addressContry;
    }

    public void setAddressContry(String addressContry) {
        this.addressContry = addressContry;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTransName() {
        return transName;
    }

    public void setTransName(String transName) {
        this.transName = transName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getStoreId() {
        return storeId;
    }

    public void setStoreId(int storeId) {
        this.storeId = storeId;
    }

    public int getSeller() {
        return seller;
    }

    public void setSeller(int seller) {
        this.seller = seller;
    }

    public String getCallBackUrl() {
        return callBackUrl;
    }

    public void setCallBackUrl(String callBackUrl) {
        this.callBackUrl = callBackUrl;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getField1() {
        return field1;
    }

    public void setField1(String field1) {
        this.field1 = field1;
    }

    public String getField2() {
        return field2;
    }

    public void setField2(String field2) {
        this.field2 = field2;
    }

    public String getField3() {
        return field3;
    }

    public void setField3(String field3) {
        this.field3 = field3;
    }

    public String getField4() {
        return field4;
    }

    public void setField4(String field4) {
        this.field4 = field4;
    }

    public String getField5() {
        return field5;
    }

    public void setField5(String field5) {
        this.field5 = field5;
    }

    public String getMerchantName() {
        return merchantName;
    }

    public void setMerchantName(String merchantName) {
        this.merchantName = merchantName;
    }

    public String getFee() {
        return fee;
    }

    public void setFee(String fee) {
        this.fee = fee;
    }

    public String getReturnUrl() {
        return returnUrl;
    }

    public void setReturnUrl(String returnUrl) {
        this.returnUrl = returnUrl;
    }

    public String getIdNo() {
        return idNo;
    }

    public void setIdNo(String idNo) {
        this.idNo = idNo;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getPlateNo() {
        return plateNo;
    }

    public CurrencyEnum getCurrency() {
        return currency;
    }
}
