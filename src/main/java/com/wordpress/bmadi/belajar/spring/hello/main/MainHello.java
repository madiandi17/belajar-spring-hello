package com.wordpress.bmadi.belajar.spring.hello.main;

import com.wordpress.bmadi.belajar.spring.hello.domain.Hello;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainHello {

    public static void main(String[] args) {
        ApplicationContext ctx
                = new ClassPathXmlApplicationContext("classpath:hello.xml");
        Hello h = (Hello) ctx.getBean("hello");
        h.getPesan();
    }
}
