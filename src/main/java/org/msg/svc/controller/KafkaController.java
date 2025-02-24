package org.msg.svc.controller;

import org.msg.svc.service.KafkaProducerService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/kafka")
public class KafkaController {

    private final KafkaProducerService producerService;

    public KafkaController(KafkaProducerService producerService) {
        this.producerService = producerService;
    }

    @GetMapping("/send")
    public String sendMessage(@RequestParam String message) {
        producerService.sendMessage("test-topic", message);
        return "Message sent to Kafka topic!";
    }
}
