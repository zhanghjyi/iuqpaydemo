package com.uqpay.demo.uqpaydemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Date: 4:44 下午 2019/10/16
 * @Author: fox
 */
@Controller
public class BaseController {

    @RequestMapping(value = "/")
    public String init() {
        return "index";
    }
}
