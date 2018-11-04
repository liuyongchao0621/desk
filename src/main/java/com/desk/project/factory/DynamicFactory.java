package com.desk.project.factory;

import com.desk.project.biz.Impl.UserService;

public class DynamicFactory {

    public UserService newInstance(String name){
        return new UserService(name);
    }
}
