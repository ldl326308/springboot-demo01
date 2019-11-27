package com.lm.springbootdemo01.taskexecutor;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class AsyncTaskService {

    /**
     * 注解@Async在方法上则表明该方法是一个异步方法，如果注解在类上，则表明该类所有方法都是异步方法
     *
     * @param i
     */
    @Async
    public void executeAsyncTask(Integer i) {
        System.out.println("执行异步任务：" + i);
    }

    @Async
    public void executeAsyncTaskPlus(Integer i) {
        System.out.println("执行异步任务+1：" + (i + 1));
    }


    public void noExecuteAsyncTaskPlus(Integer i) {
        System.out.println("执行非异步任务----------：" + (i));
    }

}



