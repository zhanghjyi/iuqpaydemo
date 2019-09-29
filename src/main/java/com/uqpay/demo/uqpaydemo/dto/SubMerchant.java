package com.uqpay.demo.uqpaydemo.dto;

import com.uqpay.demo.uqpaydemo.config.TradeTypeEnum;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zhangyi
 * @date 2019/9/23
 */
public class SubMerchant {
    private Logger logger = LoggerFactory.getLogger(getClass());

    private String payKey;

    private TradeTypeEnum tradeType = TradeTypeEnum.SUB_MERCHANT_IMP;

    /**
     * 入驻流水
     */
    private String requestNo;

    /**
     * 平台号码
     */
    private String plateNo;

    /**
     * 商户名称
     */
    private String name;

    /**
     * 商户名称缩写
     */
    private String abbr;

    /**
     * 商户邮箱
     */
    private String regEmail;

    /**
     * 商户注册名
     */
    private String companyName;

    /**
     * 商户注册号
     */
    private String regNo;

    /**
     * 商户注册地址
     */
    private String regAddress;

    /**
     * 商户的注册国家或地区
     */
    private String country;

    /**
     * 商户类型编码
     */
    private String mcc;

    /**
     * 商户网站
     */
    private String website;

    /**
     * 联系人
     */
    private String contact;

    /**
     * 联系人手机号
     */
    private String mobile;

    /**
     * 联系人邮箱
     */
    private String email;

    public Map<String, Object> createMerchantRequest() {
        Map<String, Object> paramMap = new HashMap<>(32);
        try {
            if (check()) {
                paramMap.put("payKey", this.payKey);
                paramMap.put("tradeType", this.tradeType.name());
                paramMap.put("requestNo", this.requestNo);
                paramMap.put("plateNo", this.plateNo);
                paramMap.put("name", this.name);
                paramMap.put("abbr", this.abbr);
                paramMap.put("regEmail", this.regEmail);
                paramMap.put("companyName", this.companyName);
                paramMap.put("regNo", this.regNo);
                paramMap.put("regAddress", this.regAddress);
                paramMap.put("country", this.country);
                paramMap.put("mcc", this.mcc);
                paramMap.put("website", this.website);
                paramMap.put("contact", this.contact);
                paramMap.put("mobile", this.mobile);
                paramMap.put("email", this.email);

                return paramMap;
            }
        } catch (Exception e) {
            logger.error("商户参数拼装失败:[" + this.requestNo + "]", e);
            return null;
        }
        return null;
    }

    private boolean check() throws Exception {
        if (StringUtils.isEmpty(this.requestNo)) {
            throw new Exception(printLog("请求流水"));
        }
        if (StringUtils.isEmpty(this.plateNo)) {
            throw new Exception(printLog("平台商户号"));
        }
        if (StringUtils.isEmpty(this.name)) {
            throw new Exception(printLog("商户名称"));
        }
        if (StringUtils.isEmpty(this.abbr)) {
            throw new Exception(printLog("商户名称缩写"));
        }
        if (StringUtils.isEmpty(this.regEmail)) {
            throw new Exception(printLog("商户邮箱"));
        }
        if (StringUtils.isEmpty(this.companyName)) {
            throw new Exception(printLog("商户注册名"));
        }
        if (StringUtils.isEmpty(this.regNo)) {
            throw new Exception(printLog("商户注册号"));
        }
        if (StringUtils.isEmpty(this.regAddress)) {
            throw new Exception(printLog("商户注册地址"));
        }
        if (StringUtils.isEmpty(this.country)) {
            throw new Exception(printLog("商户的注册国家或地区"));
        }
        if (StringUtils.isEmpty(this.mcc)) {
            throw new Exception(printLog("商户类型编码"));
        }
        if (StringUtils.isEmpty(this.website)) {
            throw new Exception(printLog("商户网站"));
        }
        return true;
    }

    private String printLog(String message) {
        String log = "订单号[" + this.requestNo + "],请求失败：" + message;
        logger.info(log);
        return log;
    }

    public SubMerchant(String payKey, String requestNo, String plateNo, String name, String abbr, String regEmail, String companyName,
                       String regNo, String regAddress, String country, String mcc, String website,
                       String contact, String mobile, String email) {
        this.payKey = payKey;
        this.requestNo = requestNo;
        this.plateNo = plateNo;
        this.name = name;
        this.abbr = abbr;
        this.regEmail = regEmail;
        this.companyName = companyName;
        this.regNo = regNo;
        this.regAddress = regAddress;
        this.country = country;
        this.mcc = mcc;
        this.website = website;
        this.contact = contact;
        this.mobile = mobile;
        this.email = email;
    }

    public SubMerchant() {
    }

    public String getRequestNo() {
        return requestNo;
    }

    public String getName() {
        return name;
    }

    public String getAbbr() {
        return abbr;
    }

    public String getRegEmail() {
        return regEmail;
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getRegNo() {
        return regNo;
    }

    public String getRegAddress() {
        return regAddress;
    }

    public String getCountry() {
        return country;
    }

    public String getMcc() {
        return mcc;
    }

    public String getWebsite() {
        return website;
    }

    public String getContact() {
        return contact;
    }

    public String getMobile() {
        return mobile;
    }

    public String getEmail() {
        return email;
    }

    public String getPayKey() {
        return payKey;
    }
}
