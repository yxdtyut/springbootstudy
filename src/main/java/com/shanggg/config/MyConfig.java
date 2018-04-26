package com.shanggg.config;

import com.shanggg.component.MyLocalResolver;
import com.shanggg.interceptor.MyInterceptor;
import com.shanggg.service.IUserService;
import com.shanggg.service.impl.UserServiceImpl;
import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @Author : yangxudong
 * @Description :
 * @Date : 下午1:44 2018/4/20
 */
//@EnableWebMvc
@Configuration
//@PropertySource(value = {"classpath:person.properties"})
public class MyConfig extends WebMvcConfigurerAdapter {

//    @Bean
//    public EmbeddedServletContainerCustomizer embeddedServletContainerCustomizer() {
//        return new EmbeddedServletContainerCustomizer() {
//            @Override
//            public void customize(ConfigurableEmbeddedServletContainer container) {
//                container.setPort(8888);
//            }
//        };
//    }

    @Bean
    public IUserService userService() {
        return new UserServiceImpl();
    }

//    @Bean
//    public ViewResolver myViewResolver() {
//        return new MyViewResolver();
//    }

    //配置这样就可以不用写跳转到页面的空方法了
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        //super.addViewControllers(registry);
        registry.addViewController("/toSuccess").setViewName("success");
        registry.addViewController("/index.html").setViewName("login");
        registry.addViewController("/main.html").setViewName("dashboard");

    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
//        registry.addInterceptor(new MyInterceptor()).addPathPatterns("/**")
//            .excludePathPatterns("/index.html","/","/user/login");
    }

    @Bean
    public LocaleResolver localeResolver() {
        return new MyLocalResolver();
    }

}
