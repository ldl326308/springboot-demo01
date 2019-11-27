package com.lm.springbootdemo01.vessel.demo01;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//声明为配置类
@Configuration
//扫描包名下使用了@Service、@Component、@Repository、@Controller的类，并注册为bean
@ComponentScan(basePackages = "com.lm.springbootdemo01.vessel.demo01")
public class JavaConfigClass {



}
