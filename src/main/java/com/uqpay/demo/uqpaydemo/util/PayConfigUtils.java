package com.uqpay.demo.uqpaydemo.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.Properties;

public class PayConfigUtils {
    private static Logger logger = LoggerFactory.getLogger(PayConfigUtils.class);

    private static Properties properties = new Properties();

    private PayConfigUtils() {

    }

    // 通过类装载器装载进来
    static {
        try {
            // 从类路径下读取属性文件
            properties.load(PayConfigUtils.class.getClassLoader()
                    .getResourceAsStream("config.properties"));
        } catch (IOException e) {
            logger.error("银联配置文件读取失败", e);
        }
    }

    private static String readConfig(String key) {
        return (String) properties.get(key);
    }

    public static String PLATE_NO = readConfig("PLATE_NO");
    public static String MERCHANT_ID = readConfig("MERCHANT_ID");
    public static String SUB_USER_NO = readConfig("SUB_USER_NO");
    public static String PAY_URL = readConfig("PAY_URL");
    public static String WITHDRAW_URL = readConfig("WITHDRAW_URL");
    public static String MERCHANT_IMP_URL = readConfig("MERCHANT_IMP_URL");
    public static String MERCHANT_QUERY_DETAIL_URL = readConfig("MERCHANT_QUERY_DETAIL_URL");
    public static String ORDER_PERIOD = readConfig("orderPeriod");
    public static String PAY_KEY = readConfig("payKey");
    public static String PAY_SECRET = readConfig("paySecret");
    public static String PAY_NOTIFY_URL = readConfig("notifyUrl");
    public static String WITHDRAW_NOTIFY_URL = readConfig("notifyWithdrawUrl");
    public static String PAY_VIEW_URL = readConfig("returnUrl");
}
