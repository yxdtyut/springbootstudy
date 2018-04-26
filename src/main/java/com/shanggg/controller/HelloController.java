package com.shanggg.controller;

import com.shanggg.exception.UserNotFoundException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.Map;

/**
 * @Author : yangxudong
 * @Description :   第一个hello world
 * @Date : 下午8:48 2018/4/17
 */

@RestController
public class HelloController {

    @RequestMapping("hello")
    public String hello(@RequestParam("user") String user) {
        if ("aaa".equals(user)) {
            throw new UserNotFoundException();
        }
        return "hello world!!!";
    }

    @RequestMapping("/thymeleaf")
    public String thymeleafTest(Map<String, Object> map) {
        map.put("hello", "你好");
        map.put("user", Arrays.asList("李白", "杜甫", "白居易"));
        return "redirect:success";
    }
}
