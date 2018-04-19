package com.shanggg.entity;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.*;

/**
 * @Author : yangxudong
 * @Description :
 * @Date : 下午10:16 2018/4/18
 */
@Component
@ConfigurationProperties(prefix = "person")
public class Person {
    private String name;
    private Integer age;
    private Boolean isboy;
    private Date birthday;
    private Map<String, Object> map = new HashMap<String, Object>();
    private List<String> list = new ArrayList<String>();
    private Dog dog;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Boolean getBoy() {
        return isboy;
    }

    public void setBoy(Boolean boy) {
        this.isboy = boy;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Map<String, Object> getMap() {
        return map;
    }

    public void setMap(Map<String, Object> map) {
        this.map = map;
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", isBoy=" + isboy +
                ", birthday=" + birthday +
                ", map=" + map +
                ", list=" + list +
                ", dog=" + dog +
                '}';
    }
}
