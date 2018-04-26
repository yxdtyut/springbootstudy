package com.shanggg.config;

import com.shanggg.component.MyFilter;
import com.shanggg.component.MyServlet;
import com.shanggg.component.MyServletListener;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author : yangxudong
 * @Description :
 * @Date : 下午5:54 2018/4/26
 */
@Configuration
public class MyServerConfig {
    @Bean
    public ServletRegistrationBean myServlet() {
        return new ServletRegistrationBean(new MyServlet(), "/myServlet");
    }

    @Bean
    public FilterRegistrationBean myFilter() {
        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();
        filterRegistrationBean.setFilter(new MyFilter());
        filterRegistrationBean.addUrlPatterns("/hello", "/myServlet");
        return filterRegistrationBean;
    }

    @Bean
    public ServletListenerRegistrationBean myServletListener() {
        return new ServletListenerRegistrationBean<MyServletListener>(new MyServletListener());
    }

}
