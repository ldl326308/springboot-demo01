package com.lm.springbootdemo01.fortest;


import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

//SpringJUnit4ClassRunner在JUnit环境下提供Spring TestContext Framework功能
@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration用来加载ApplicationContext，其中classes用来加载配置类
@ContextConfiguration(classes = {TestConfig.class})
//@ActiveProfiles用来声明活动的profile
@ActiveProfiles("prod")
public class DemoBeanIntegrationTests {

    @Autowired
    private TestBean testBean;

    @Test
    public void prodBeanShouldInject(){
        String expected = "from production profile";
        String content = testBean.getContent();
        Assert.assertEquals(expected, content);
    }


}
