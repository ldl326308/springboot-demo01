package com.lm.springbootdemo01.taskscheduler;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 计划任务执行类
 */
@Service
public class ScheduledTaskService {

    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

    /**
     * 通过注解@Scheduled声明该方法是计划任务，使用fixedRate属性每隔固定时间执行
     */
    @Scheduled(fixedDelay = 5000)
    public void reportCurrentTime(){
        System.out.println("每隔五秒执行一次：" + dateFormat.format(new Date()));
    }

    @Scheduled(cron = "0 28 11 ? *  *")
    public void fixTimeExecution(){
        System.out.println("指定时间：" + dateFormat.format(new Date()) + "执行");
    }

}
