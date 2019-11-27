package com.lm.springbootdemo01.vessel.demo02;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DemoTwoMain {

    public static void main(String[] args) {
        //AnnotationConfigApplicationContext 容器，配置类作为一个参数
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfigClass.class);
        //从容器中获取 bean
        UseFunctionService bean = context.getBean(UseFunctionService.class);
        System.out.println("------------------------------------------");
        System.out.println(bean.sayHello("LIU SHI YU"));
        System.out.println("------------------------------------------");
        context.close();
    }

}
