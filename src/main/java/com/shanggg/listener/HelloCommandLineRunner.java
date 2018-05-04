package com.shanggg.listener;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * @Author : yangxudong
 * @Description :
 * @Date : 下午5:30 2018/5/4
 */
@Component
public class HelloCommandLineRunner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        System.out.println("CommandLineRunner...run...");
    }
}
