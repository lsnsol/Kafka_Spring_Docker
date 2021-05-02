package com.nasirul_kafka.Kafka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("kafka_api")
public class KafkaController {

    private final com.nasirul_kafka.Kafka.services.Producer producer;

    @Autowired
    public KafkaController(com.nasirul_kafka.Kafka.services.Producer producer) {
        this.producer = producer;
    }

    @PostMapping(value = "/publishKafka")
    public String messageToTopic(@RequestParam("msg") String message) {
        this.producer.sendMessage(message);
        return "Message Published Successfully";
    }

    @GetMapping(value = "/publishKafka")
    public String messageToTopicGet(@RequestParam("msg") String message) {
        this.producer.sendMessage(message);
        return "Message Published Successfully";
    }
}