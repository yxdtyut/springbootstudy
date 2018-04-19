package com.shanggg.entity;

/**
 * @Author : yangxudong
 * @Description :
 * @Date : 下午10:18 2018/4/18
 */

public class Dog {
    private String name;
    private Integer age;
    private Boolean happy;

    public boolean isHappy() {
        return happy;
    }

    public void setHappy(boolean happy) {
        this.happy = happy;
    }

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

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", happy=" + happy +
                '}';
    }
}
