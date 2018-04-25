package com.shanggg.controller;

import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.Map;

/**
 * @Author : yangxudong
 * @Description :
 * @Date : 下午6:28 2018/4/24
 */
@Controller
@RequestMapping("user")
public class UserController {

    @PostMapping("login")
    public String login(@RequestParam("username") String username,
                        @RequestParam("password") String password,
                        Map<String,Object> map,
                        HttpSession session) {
        if (!StringUtils.isEmpty(username) && "123456".equals(password)) {
            session.setAttribute("user", username);
            //防止重复提交表单
            return "redirect:/main.html";
        } else {
            map.put("msg", "用户名或者密码有误，请重新登陆!");
            return "login";
        }
    }
}
