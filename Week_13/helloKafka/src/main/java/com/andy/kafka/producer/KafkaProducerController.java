package com.andy.kafka.producer;
import	java.util.Random;

import java.util.concurrent.ExecutionException;
import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.concurrent.ListenableFuture;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author mac
 */
@Slf4j
@RestController
@RequestMapping("/kafka")
public class KafkaProducerController {

    @Autowired
    KafkaTemplate<String,String> template;

    /**
     * first try
     * @param msg
     */
    @GetMapping("/producer/send")
    public void send(@RequestParam("msg") String msg){
        log.info("send to topic test: " + msg);
        ProducerRecord<String,String> record = new ProducerRecord<>("test", msg);
        template.send(record);
    }

    /**
     *  同步发送
     * @param msg
     * @throws ExecutionException
     * @throws InterruptedException
     */
    @GetMapping("/producer/send2")
    public void sendSyn(@RequestParam("msg") String msg) throws ExecutionException, InterruptedException {
        log.info("send2 to topic test: " + msg);
        ProducerRecord<String,String> record = new ProducerRecord<>("test", msg);
        ListenableFuture<SendResult<String, String>> future = template.send(record);
        log.info(future.get().toString());
    }

    /**
     *  异步发送
     * @param msg
     * @throws ExecutionException
     * @throws InterruptedException
     */
    @GetMapping("/producer/send3")
    public void sendAsyn(@RequestParam("msg") String msg) throws ExecutionException, InterruptedException {
        log.info("send3 to topic test: " + msg);
        Random random = new Random();
        ListenableFuture<SendResult<String, String>> future = template.send("test","key"+random.nextInt(10),msg);
        future.addCallback(res->{log.info(res.toString());},err->{log.error(err.toString());});
    }

    @GetMapping("/producer/send4")
    @Transactional(rollbackFor = RuntimeException.class)
    public void sendTran(@RequestParam("msg") String msg) throws ExecutionException, InterruptedException {
        log.info("send4 to topic test: " + msg);
        Random random = new Random();
        ListenableFuture<SendResult<String, String>> future = template.send("test","key"+random.nextInt(10),msg);
        throw new RuntimeException("1111");
    }
}
