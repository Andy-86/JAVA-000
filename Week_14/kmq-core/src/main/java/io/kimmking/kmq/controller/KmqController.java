package io.kimmking.kmq.controller;

import io.kimmking.kmq.core.ConsumerHolder;
import io.kimmking.kmq.core.KmqBroker;
import io.kimmking.kmq.core.KmqConsumer;
import io.kimmking.kmq.core.KmqMessage;
import io.kimmking.kmq.core.KmqProducer;
import io.kimmking.kmq.core.ProducerHolder;
import java.util.HashMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author mac
 */
@RestController
@RequestMapping("/kmq")
public class KmqController {

    public static final long TIMEOUT = 1000L;

    @Autowired
    KmqBroker broker;

    @GetMapping("/get")
    public KmqMessage get(@RequestParam("sessionId") String sessionId, @RequestParam("topic") String topic) {
        KmqConsumer consumer = ConsumerHolder.get(sessionId, broker);
        return consumer.poll(TIMEOUT);
    }

    @PutMapping("put")
    public boolean put(@RequestParam("sessionId") String sessionId, @RequestParam("topic") String topic, @RequestParam("msg") String msg) {
        KmqProducer producer = ProducerHolder.get(sessionId, broker);
        KmqMessage<String> message = new KmqMessage(new HashMap<String, Object>(), msg);
        return producer.send(topic, message);
    }
}
