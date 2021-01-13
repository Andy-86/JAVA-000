package com.andy.activemq.listener;

import lombok.extern.slf4j.Slf4j;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

/**
 * @author mac
 */
@Component
@Slf4j
public class TopicConsumerListener {
    @JmsListener(destination = "firstTopic", containerFactory = "topicListenerFactory")
    public void OnListen(String message){
        log.info("receive message for firsttopic : " + message);
    }
}
