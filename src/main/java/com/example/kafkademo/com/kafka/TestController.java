package com.example.kafkademo.com.kafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    private KafkaSender kafkaSender;
    @RequestMapping("/send")
    public String test(){
        kafkaSender.sendMessage("sa");
        return null;
    }
}
