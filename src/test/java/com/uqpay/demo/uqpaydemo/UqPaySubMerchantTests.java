package com.uqpay.demo.uqpaydemo;

import com.alibaba.fastjson.JSON;
import com.google.common.collect.Maps;
import com.uqpay.demo.uqpaydemo.config.Enums;
import com.uqpay.demo.uqpaydemo.config.MccTypeEnum;
import com.uqpay.demo.uqpaydemo.dto.SubMerchant;
import com.uqpay.demo.uqpaydemo.util.MerchantApiUtil;
import com.uqpay.demo.uqpaydemo.util.OkHttpUtil;
import com.uqpay.demo.uqpaydemo.util.PayConfigUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UqPaySubMerchantTests {
    private Logger logger = LoggerFactory.getLogger(getClass());

    @Test
    public void testImport() {
        logger.info("***********入驻请求**********");
        long startTime = System.currentTimeMillis();
        String reqStr = OkHttpUtil.postFormParams(PayConfigUtils.MERCHANT_IMP_URL, createSubMerchant());
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
        logger.info("***********入驻请求**********");
    }

    @Test
    public void testQueryDetail() {
        logger.info("***********查询请求**********");
        long startTime = System.currentTimeMillis();
        Map<String, Object> requestMap = Maps.newHashMap();
        requestMap.put("merchantId", "1005504");
        requestMap.put("payKey", PayConfigUtils.PAY_KEY);
        requestMap.put("plateNo", "88882019090510001115");
        String reqSign = MerchantApiUtil.getSign(requestMap, PayConfigUtils.PAY_SECRET);
        requestMap.put("sign", reqSign);
        String reqStr = OkHttpUtil.postFormParams(PayConfigUtils.MERCHANT_QUERY_DETAIL_URL, requestMap);
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
        logger.info("***********查询请求**********");
    }

    public void testQueryList() {
        logger.info("***********查询请求**********");
        long startTime = System.currentTimeMillis();
        Map<String, Object> requestMap = Maps.newHashMap();
        requestMap.put("merchantId", "1005504");
        requestMap.put("payKey", PayConfigUtils.PAY_KEY);
        requestMap.put("plateNo", "88882019090510001115");
        String reqSign = MerchantApiUtil.getSign(requestMap, PayConfigUtils.PAY_SECRET);
        requestMap.put("sign", reqSign);
        String reqStr = OkHttpUtil.postFormParams(PayConfigUtils.MERCHANT_QUERY_DETAIL_URL, requestMap);
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
        logger.info("***********查询请求**********");
    }

    private Map<String, Object> createSubMerchant() {
        String requestNo = String.valueOf(System.currentTimeMillis());
        logger.info("请求流水:" + requestNo);
        //Enums.random(MccTypeEnum.class).getCode()
        SubMerchant dto = new SubMerchant(PayConfigUtils.PAY_KEY, requestNo, PayConfigUtils.PLATE_NO,
                "tomato foodnet co.,ltd", "tomato foodnet", "wyyyy@163.com", "tomato foodnet co.,ltd",
                "91310112757554814X", "北京中关村", "CN",
                "4816", "music.163.com",
                "zhangyi", "15652282111", "test@163.com");
        Map<String, Object> map = dto.createMerchantRequest();
        //签名及生成请求API的方法
        String sign = MerchantApiUtil.getSign(map, PayConfigUtils.PAY_SECRET);
        map.put("sign", sign);
        return map;
    }
}
