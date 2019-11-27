package com.lm.springbootdemo01.vessel.demo02;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//声明为配置类
@Configuration
public class JavaConfigClass {

    @Bean
    public FunctionService functionService(){
        return new FunctionService();
    }

    /**
     * 通过functionService方法返回值注入
     * @return
     */
    @Bean
    public UseFunctionService useFunctionService(){
        UseFunctionService useFunctionService = new UseFunctionService();
        useFunctionService.setFunctionService(functionService());
        return useFunctionService;
    }

    /**
     * 将FunctionService作为参数传递
     */
//    @Bean
//    public UseFunctionService useFunctionService(FunctionService functionService){
//        UseFunctionService useFunctionService = new UseFunctionService();
//        useFunctionService.setFunctionService(functionService);
//        return useFunctionService;
//    }

}
