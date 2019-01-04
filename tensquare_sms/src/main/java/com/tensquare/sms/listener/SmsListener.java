package com.tensquare.sms.listener;

import com.aliyuncs.exceptions.ClientException;
import com.tensquare.sms.utils.SmsUtil;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * @date 2018-12-21 14:05
 * @since 1.0.0
 */
@Component
@RabbitListener(queues = "sms")
public class SmsListener {
    @Autowired
    private SmsUtil smsUtil;

    @Value("${aliyun.sms.template_code}")
    private String templateCode;
    @Value("${aliyun.sms.sign_name}")
    private String signName;

    @RabbitHandler
    public void executeSms(Map<String,String> map){
        String moblie = map.get("moblie");
        String checkcode = map.get("checkcode");
        try {
            smsUtil.sendSms(moblie,templateCode,signName,"{\"checkcode\":\""+checkcode+"\"}");
        } catch (ClientException e) {
            e.printStackTrace();
        }
    }

}
