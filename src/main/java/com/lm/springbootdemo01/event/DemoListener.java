package com.lm.springbootdemo01.event;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * 事件监听器，实现ApplicationListener接口，并指定监听的事件类型
 */
@Component
public class DemoListener implements ApplicationListener<DemoEvent> {

    /**
     * 使用onApplicationEvent方法对消息进行接收处理
     * @param event
     */
    @Override
    public void onApplicationEvent(DemoEvent event) {
        String msg = event.getMessage();
        System.out.println("我Bean-DemoListener接收到了bean-DemoPublisher发布的消息：" + msg);
    }
}
