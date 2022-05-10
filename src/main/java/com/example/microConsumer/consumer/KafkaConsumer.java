package com.example.microConsumer.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaConsumer {

    @KafkaListener(topics = "microTopic", groupId = "group_id")
    public void consume(String message){
        System.out.println("messsage = " + message);
    }
}
