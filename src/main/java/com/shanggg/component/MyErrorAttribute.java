package com.shanggg.component;

import org.springframework.boot.autoconfigure.web.DefaultErrorAttributes;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestAttributes;

import java.util.Map;

/**
 * @Author : yangxudong
 * @Description :
 * @Date : 下午5:02 2018/4/26
 */
@Component
public class MyErrorAttribute extends DefaultErrorAttributes {
    @Override
    public Map<String, Object> getErrorAttributes(RequestAttributes requestAttributes, boolean includeStackTrace) {
        Map<String, Object> map = super.getErrorAttributes(requestAttributes, includeStackTrace);
        map.put("company", "lihua");
        Map<String,Object> map1 = (Map<String, Object>) requestAttributes.getAttribute("ext", RequestAttributes.SCOPE_REQUEST);
        map.put("ext", map1);
        return map;
    }
}
