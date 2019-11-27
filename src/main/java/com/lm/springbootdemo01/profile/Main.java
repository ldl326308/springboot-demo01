package com.lm.springbootdemo01.profile;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        //注意：这里不直接生成Bean
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        //设置Profile为prod
        context.getEnvironment().setActiveProfiles("prod");
        //设置Profile后，后置注册Bean配置类，不然会报Bean未定义的错误
        context.register(ProfileConfig.class);
        //刷新容器
        context.refresh();

        System.out.println("-----------------------------------");
        DemoBean bean = context.getBean(DemoBean.class);
        System.out.println(bean.getContent());

//        System.out.println("-----------------------------------");
//        context.getEnvironment().setActiveProfiles("dev");
//        context.register(ProfileConfig.class);
//        context.refresh();
//        DemoBean demoBean = context.getBean(DemoBean.class);
//        System.out.println(demoBean.getContent());
//
//        System.out.println("-----------------------------------");

    }
}
