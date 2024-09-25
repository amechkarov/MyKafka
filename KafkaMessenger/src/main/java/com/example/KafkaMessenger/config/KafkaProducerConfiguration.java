package com.example.KafkaMessenger.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class KafkaProducerConfiguration {

    @Bean
    public NewTopic createTopic(){
        return new NewTopic("kafkaDemo",5,(short) 1);
    };
}
