/**
 * FileName :User
 * Author :zengzhijun
 * Date : 2018/5/9 11:59
 * Description:
 */
package com.byedbl.proxy.util;

import java.util.Date;

public class User {

    private String name;
    private Date birth;
    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void hi() {
        System.out.println("hi...");
    }

    public static void hello() {
        System.out.println("hello...");
    }
}
