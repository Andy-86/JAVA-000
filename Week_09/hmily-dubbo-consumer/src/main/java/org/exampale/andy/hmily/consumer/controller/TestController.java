package org.exampale.andy.hmily.consumer.controller;

import org.example.alex.hmily.api.dot.TradeDto;
import org.example.alex.hmily.api.service.IConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author mac
 */
@RestController
@RequestMapping("/trade")
public class TestController {

    @Autowired
    IConsumerService consumerService;

    @GetMapping("/exchange")
    public boolean exchange(TradeDto dto) {
        return consumerService.exchange(dto);
    }
}
