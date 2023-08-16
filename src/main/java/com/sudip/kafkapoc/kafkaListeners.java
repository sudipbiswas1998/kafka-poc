package com.sudip.kafkapoc;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class kafkaListeners {

    @KafkaListener(topics = "topic", groupId = "groupId")
    void listener(String data){
        System.out.println("Listener received = " + data);
    }
}
