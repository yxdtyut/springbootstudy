package com.shanggg.component;

import org.springframework.web.context.ContextLoaderListener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * @Author : yangxudong
 * @Description :
 * @Date : 下午6:29 2018/4/26
 */

public class MyServletListener implements ServletContextListener{

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("context init...");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("context destroy...");
    }
}
