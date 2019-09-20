package com.uqpay.demo.uqpaydemo.config;

/**
 * @author zhangyi
 * @date 2019/9/19
 */
public enum CurrencyEnum {
    USD("美元"),
    CNY("人民币");

    public static CurrencyEnum getEnum(String name) {
        CurrencyEnum[] arry = CurrencyEnum.values();
        for (int i = 0; i < arry.length; i++) {
            if (arry[i].name().equalsIgnoreCase(name)) {
                return arry[i];
            }
        }
        return null;
    }

    private String code;

    CurrencyEnum(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
