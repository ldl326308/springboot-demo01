package com.lm.springbootdemo01.taskscheduler;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

@Configuration
@ComponentScan("com.lm.springbootdemo01.taskscheduler")
@EnableScheduling  //通过此注解开启对计划任务的支持
public class TaskSchedulerConfig {
}
