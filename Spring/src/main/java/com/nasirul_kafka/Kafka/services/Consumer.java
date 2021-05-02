package com.nasirul_kafka.Kafka.services;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Consumer {
    @KafkaListener(topics = "kafka_topic_nasirul", groupId = "group_id")
    public void consumeMessage(String message) {
        System.out.println("Consumer: " + message);
    }
}