package com.desk.project.factory;

import com.desk.project.biz.Impl.UserService;

public class UserFactory {

    public static UserService newInstance(String name){
        return new UserService(name);
    }
}
