package com.shanggg.controller;

import com.shanggg.entity.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Author : yangxudong
 * @Description :
 * @Date : 上午9:15 2018/4/19
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class TestController {

    @Autowired
    private Person person;

    @Autowired
    ApplicationContext ioc;

    @Test
    public void beanTest() {
        System.out.println(ioc.containsBean("userService"));
    }

    @Test
    public void testYml() {
        System.out.println(person);
    }
}
