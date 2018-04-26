package com.shanggg.exception;

/**
 * @Author : yangxudong
 * @Description :
 * @Date : 下午4:31 2018/4/26
 */


public class UserNotFoundException extends RuntimeException{

    public UserNotFoundException() {
        super("用户未找到");
    }

    public UserNotFoundException(String message) {
        super(message);
    }
}
