package com.qcz.dubbo.consumer;

import com.qcz.dubbo.api.service.DemoService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConsumerBootstrap {

    public static void main(String[] args){
        System.setProperty("java.net.preferIPv4Stack", "true");
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"/spring/consumer.xml"});
        context.start();
        // Obtaining a remote com.qcz.dubbo.api.service proxy
        DemoService demoService = (DemoService)context.getBean("demoService");
        // Executing remote methods
        String hello = demoService.sayHello("world");
        // Display the call result
        System.out.println(hello);
    }

}
