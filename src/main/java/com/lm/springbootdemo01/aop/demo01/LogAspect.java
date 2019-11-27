package com.lm.springbootdemo01.aop.demo01;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * @Aspect 声明为一个切面
 *
 * @Advice: 要向目标位置加入什么
 * @Pointcut: 要加到哪些位置
 * @Aspect: 一系列 Advice + Pointcut 的集合。
 * Joinpoint: Pointcut 中的具体某个位置
 */

@Aspect
@Component
public class LogAspect {

    /**
     * @Pointcut 用于声明切点
     */
    @Pointcut("@annotation(com.lm.springbootdemo01.aop.demo01.Action)")
    public void annotationPointCut(){}

    @After("annotationPointCut()")
    public void after(JoinPoint joinPoint){
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        Method method = signature.getMethod();
        Action annotation = method.getAnnotation(Action.class);
        System.out.println("方法拦截方式-----：" + method.getName());
    }

//    @Before(value = "execution(*com.lm.springbootdemo01.aop.demo01.Action.DemoMethodService.*(..))")
//    public void before(JoinPoint joinPoint){
//        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
//        Method method = signature.getMethod();
//        System.out.println("方法拦截方式：" + method.getName());
//    }

}
