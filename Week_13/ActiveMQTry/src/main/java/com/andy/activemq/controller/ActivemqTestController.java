package com.andy.activemq.controller;

import javax.jms.Destination;
import javax.jms.Queue;
import javax.jms.Topic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author mac
 */
@RestController
@RequestMapping("/active")
public class ActivemqTestController {
    @Autowired
    private JmsMessagingTemplate jmsMessagingTemplate;
    @Autowired
    private Queue queue;
    @Autowired
    private Topic topic;

    @GetMapping("/queue/test")
    public void send2Queue(@RequestParam("message")String message) {
        sendMessage(queue,message);
    }

    @GetMapping("/topic/test")
    public void send2Topic(@RequestParam("message")String message) {
        sendMessage(topic,message);
    }

    public void sendMessage(Destination destination, String message) {
        jmsMessagingTemplate.convertAndSend(destination, message);
    }
}
