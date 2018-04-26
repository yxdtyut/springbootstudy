package com.shanggg.component;

import com.shanggg.exception.UserNotFoundException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author : yangxudong
 * @Description :
 * @Date : 下午4:32 2018/4/26
 */
@ControllerAdvice
public class MyExceptionHandler {

//    @ResponseBody
//    @ExceptionHandler({UserNotFoundException.class})
//    public Map<String, Object> handlerUserException(Exception e) {
//        Map<String, Object> map = new HashMap<String, Object>();
//        map.put("code", "444");
//        map.put("exceptionMessage", e.getMessage());
//        return map;
//    }

    @ExceptionHandler({UserNotFoundException.class})
    public String handlerUserException(Exception e, HttpServletRequest request) {
        Map<String, Object> map = new HashMap<>();
        //设置状态码
//        Integer statusCode = (Integer) request
//                .getAttribute("javax.servlet.error.status_code");
        request.setAttribute("javax.servlet.error.status_code", 555);
        map.put("code", "5xx");
        map.put("exceptionMessage", e.getMessage());
        request.setAttribute("ext", map);
        return "forward:/error";
    }
}
