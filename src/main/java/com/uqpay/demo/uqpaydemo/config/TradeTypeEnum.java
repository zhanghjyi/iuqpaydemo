package com.uqpay.demo.uqpaydemo.config;

/**
 * @author zhangyi
 * @date 2019/9/19
 */
public enum TradeTypeEnum {
    PAY("pay", "付款"),
    SUB_MERCHANT_IMP("sub_merchant_imp", "商户入驻"),
    WITHDRAW("withdraw", "提现");

    public static TradeTypeEnum getEnum(String name) {
        TradeTypeEnum[] arry = TradeTypeEnum.values();
        for (int i = 0; i < arry.length; i++) {
            if (arry[i].name().equalsIgnoreCase(name)) {
                return arry[i];
            }
        }
        return null;
    }

    /**
     * 所属交易类型
     */
    private String code;

    /**
     * 描述
     */
    private String message;

    TradeTypeEnum(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
