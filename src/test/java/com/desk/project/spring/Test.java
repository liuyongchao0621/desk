package com.desk.project.spring;

import com.desk.project.biz.Impl.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {


    public static void main(String[] args) {


        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring/application-test.xml");

//        UserService userService = (UserService) context.getBean("userService");
        UserService userService = (UserService) context.getBean("user3");


        userService.show();
    }
}
