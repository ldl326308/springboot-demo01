package com.lm.springbootdemo01.annotation;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Configuration  //组合元注解@Configuration
@ComponentScan  //组合元注解@ComponentScan
public @interface WiselyConfiguration {

    //覆盖value参数
    String[] value() default {};

}
