package io.kimmking.kmq.config;

import com.sun.corba.se.pept.broker.Broker;
import io.kimmking.kmq.core.KmqBroker;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author mac
 */
@Configuration
public class KmqConfiguration {
    @Bean("broker")
    public KmqBroker broker() {
        return new KmqBroker();
    }


}
