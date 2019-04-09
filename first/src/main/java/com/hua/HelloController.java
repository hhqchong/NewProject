package com.hua;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by hhq on 2019/4/5.
 */
@Controller
@EnableAutoConfiguration
public class HelloController {
    @RequestMapping("/")
    @ResponseBody
    public String getHello() {
        return "您好！猪";
    }

    public static void main(String[] args) {
        SpringApplication.run(HelloController.class, args);
    }
}
