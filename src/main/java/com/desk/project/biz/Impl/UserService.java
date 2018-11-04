package com.desk.project.biz.Impl;

import com.desk.project.biz.User;

public class UserService implements User {

    private String name ;

    public UserService(){
        System.out.println("UserService 的无参构造函数");
    }


    @Override
    public void show() {

        System.out.println("name =" + name);

    }



    public void setName(String name) {
        this.name = name;
    }

    public UserService(String name){
        super();
        this.name = name;
    }
}
