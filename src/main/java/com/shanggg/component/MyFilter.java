package com.shanggg.component;

import javax.servlet.*;
import java.io.IOException;

/**
 * @Author : yangxudong
 * @Description :
 * @Date : 下午6:03 2018/4/26
 */

public class MyFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("myFilter");
        chain.doFilter(request,response);
    }

    @Override
    public void destroy() {

    }
}
