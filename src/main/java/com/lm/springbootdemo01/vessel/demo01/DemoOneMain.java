package com.lm.springbootdemo01.vessel.demo01;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DemoOneMain {

    public static void main(String[] args) {
        /**
         * 第一种方式：类上添加注解@Service、@Controller、@Component、@Repository，
         * 再通过配置类注解@ComponentScan指定扫描包名的路径，对有以上注解的类注册为bean
         */
        //AnnotationConfigApplicationContext 容器，配置类作为一个参数
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfigClass.class);
        //从容器中获取 bean
        UseFunctionService bean = context.getBean(UseFunctionService.class);
        System.out.println("------------------------------------------");
        System.out.println(bean.sayHello("SHI SEN MING"));
        System.out.println("------------------------------------------");
        context.close();
    }

}
