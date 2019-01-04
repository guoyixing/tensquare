package com.tensquare.test;

import com.tensquare.rabbit.RabbitApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @date 2018-12-20 14:38
 * @since 1.0.0
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = RabbitApplication.class)
public class ProductTest {
    @Autowired
    private RabbitTemplate rabbitTemplate;
    @Test
    public void sendMsg(){
        rabbitTemplate.convertAndSend("itcast","测试测试");
    }

    @Test
    public void sendMsg2(){
        rabbitTemplate.convertAndSend("itcastexchanges","","测试测试");
    }

    @Test
    public void sendMsg3(){
        rabbitTemplate.convertAndSend("topictest","good.log","测试测试");
    }
}
