package com.lm.springbootdemo01.aop.demo01;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.lm.springbootdemo01.aop.demo01")
@EnableAspectJAutoProxy //使用此注解开启 Spring 对 AspectJ 的支持
public class AopConfig {
}
