package com.consumer.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class ConsumerService {

    // Listener for the common-topic
    @KafkaListener(topics = "common-topic", groupId = "my-consumer-group")
    public void consumeCommonTopicMessage(String message) {
        System.out.println("Received message from common-topic: " + message);
    }

    // Listener for the even-topic used in ConsumerA
    @KafkaListener(topics = "even-topic", groupId = "my-consumer-group")
    public void consumeEvenTopicMessage(String message) {
        System.out.println("Received message from even-topic: " + message);
    }

//    // Listener for the odd-topic used in ConsumerB
//    @KafkaListener(topics = "odd-topic", groupId = "my-consumer-group")
//    public void consumeOddTopicMessage(String message) {
//        System.out.println("Received message from odd-topic: " + message);
//    }

}