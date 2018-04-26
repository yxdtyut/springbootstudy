package com.shanggg.component;

import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.stereotype.Component;

/**
 * @Author : yangxudong
 * @Description :
 * @Date : 下午5:32 2018/4/26
 */
//@Component
public class MyEmbedServletContainerCustomizer implements EmbeddedServletContainerCustomizer{
    @Override
    public void customize(ConfigurableEmbeddedServletContainer container) {
        container.setPort(9898);
    }
}
