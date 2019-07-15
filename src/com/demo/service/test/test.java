package com.demo.service.test;

import com.demo.service.UserSerivce;
import com.demo.service.impl.UserServiceimpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
    //以前创建的方式
    @Test
    public void testOld(){
        UserSerivce userSerivce =new UserServiceimpl();
        userSerivce.add();
    }

    //Spring方式
    @Test
    public void testNow(){
        ApplicationContext context =new ClassPathXmlApplicationContext("UserMapper.xml");
        UserServiceimpl userServiceimpl = (UserServiceimpl) context.getBean("demo");
        userServiceimpl.add();
    }

}
