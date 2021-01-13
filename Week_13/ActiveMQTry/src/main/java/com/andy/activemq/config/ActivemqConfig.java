package com.andy.activemq.config;

import javax.jms.ConnectionFactory;
import javax.jms.Queue;
import javax.jms.Topic;
import org.apache.activemq.ActiveMQConnectionFactory;
import org.apache.activemq.command.ActiveMQQueue;
import org.apache.activemq.command.ActiveMQTopic;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.config.JmsListenerContainerFactory;
import org.springframework.jms.config.SimpleJmsListenerContainerFactory;
import org.springframework.stereotype.Component;

/**
 * @author mac
 */
@Configuration
public class ActivemqConfig {
    @Value("${spring.activemq.broker-url}")
    private String brokerUrl;

    @Value("${spring.activemq.username}")
    private String username;

    @Value("${spring.activemq.password}")
    private String password;

    @Bean(name = "queue")
    public Queue queue(){
        return new ActiveMQQueue("firstQueue");
    }
    @Bean(name = "topic")
    public Topic topic(){
        return new ActiveMQTopic("firstTopic");
    }

    @Bean
    public ConnectionFactory connectionFactory() {
        return new ActiveMQConnectionFactory(username,password,brokerUrl);
    }
    @Bean(name = "queueListenerFactory")
    public JmsListenerContainerFactory<?> queueListenerContainerFactory(ConnectionFactory connectionFactory) {
        SimpleJmsListenerContainerFactory jmsListener = new SimpleJmsListenerContainerFactory();
        jmsListener.setConnectionFactory(connectionFactory);
        jmsListener.setPubSubDomain(false);
        return jmsListener;
    }
    @Bean(name = "topicListenerFactory")
    public JmsListenerContainerFactory<?> topicListenerContainerFactory(ConnectionFactory connectionFactory) {
        SimpleJmsListenerContainerFactory jmsListener = new SimpleJmsListenerContainerFactory();
        jmsListener.setConnectionFactory(connectionFactory);
        jmsListener.setPubSubDomain(true);
        return jmsListener;
    }

}
