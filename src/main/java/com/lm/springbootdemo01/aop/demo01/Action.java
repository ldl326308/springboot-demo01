package com.lm.springbootdemo01.aop.demo01;

import java.lang.annotation.*;


/**
 * 拦截注解的规则类
 * @Target 用于声明此注解用于方法还是类，可多选
 * @Retention 用于声明此注解的声明周期
 * @Documented 用于生成DOC
 */

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Action {

    String name();

}
