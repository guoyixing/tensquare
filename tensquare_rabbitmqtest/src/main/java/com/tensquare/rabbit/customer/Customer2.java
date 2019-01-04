package com.tensquare.rabbit.customer;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @date 2018-12-20 14:45
 * @since 1.0.0
 */
@Component
@RabbitListener(queues = "itcast2")
public class Customer2 {
    @RabbitHandler
    public void getMsg(String msg){
        System.out.println("itcast2"+msg);
    }
}
