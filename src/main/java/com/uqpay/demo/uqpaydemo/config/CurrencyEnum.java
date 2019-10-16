package com.uqpay.demo.uqpaydemo.config;

/**
 * @author zhangyi
 * @date 2019/9/19
 */
public enum CurrencyEnum {
    USD("美元"),
    KRW("韩元"),
    THB("泰铢"),
    GBP("英镑"),
    CHF("瑞士法郎"),
    NZD("新西兰元"),
    PHP("菲律宾比索"),
    NOK("挪威克郎"),
    TWD("新台币"),
    SEK("瑞典克郎"),
    HKD("港币"),
    EUR("欧元"),
    MOP("澳门元"),
    JPY("日元"),
    AUD("澳大利亚元"),
    SGD("新加坡元"),
    CAD("加拿大元"),
    DKK("丹麦克郎"),
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
