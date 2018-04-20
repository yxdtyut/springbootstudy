package com.shanggg.config;

import com.shanggg.service.IUserService;
import com.shanggg.service.impl.UserServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @Author : yangxudong
 * @Description :
 * @Date : 下午1:44 2018/4/20
 */
@Configuration
@PropertySource(value = {"classpath:person.properties"})
public class MyConfig {

    @Bean
    public IUserService userService() {
        return new UserServiceImpl();
    }
}
