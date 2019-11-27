package com.lm.springbootdemo01.prepost;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.lm.springbootdemo01.prepost")
public class PrePostConfig {

    /**
     * initMethod 和 destroy 指定BeanWayService 类的init和destroy方法在构造之后、Bean销毁之前执行
     * @return
     */
    @Bean(initMethod = "init", destroyMethod = "destroy")
    BeanWayService beanWayService(){
        return new BeanWayService();
    }

    @Bean
    JSR250WayService jsr250WayService(){
        return new JSR250WayService();
    }
}
