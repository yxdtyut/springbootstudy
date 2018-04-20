package com.shanggg.service.impl;

import com.shanggg.service.IUserService;
import org.springframework.stereotype.Component;

/**
 * @Author : yangxudong
 * @Description :
 * @Date : 上午10:56 2018/4/20
 */
public class UserServiceImpl implements IUserService {
    @Override
    public void userInfo() {
        System.out.println("userinfo信息被调用");
    }
}
