package com.andy.kafka.consumer;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.support.Acknowledgment;
import org.springframework.messaging.handler.annotation.Header;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author mac
 */
@Component
@Slf4j
public class KafkaMessageListener {
    @Autowired
    ObjectMapper objectMapper;

    @KafkaListener(topics = "test",groupId = "group1")
    public void receiveFromTestGroup1(String message){
       log.info("Group1 receive message from topic test: " + message);
    }

    @KafkaListener(topics = "test",groupId = "group5")
    public void kafkaListener(List<String> messages, Acknowledgment acknowledgment) {
        for(String msg:messages){
            log.info("Group5 receive message from topic test:" + msg);
        }
        // 触发提交offset偏移量
        acknowledgment.acknowledge();
    }
}
