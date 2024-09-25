package com.mykafka.consumer;

import com.mykafka.dto.Customer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaMessageListener {

    Logger logger = LoggerFactory.getLogger(KafkaMessageListener.class);

    @KafkaListener(topics = "kafkaDemo7", groupId = "kafka-demo-group4")
    public void consumeEvents(Customer customer){

        logger.info("consumer consumed the message {}",customer.toString());

    }

//    @KafkaListener(topics = "kafkaDemo4", groupId = "kafka-demo-group3")
//    public void consume2(String message){
//
//        logger.info("consumer2 consumed the message {}",message);
//
//    }
//
//    @KafkaListener(topics = "kafkaDemo4", groupId = "kafka-demo-group3")
//    public void consume3(String message){
//
//        logger.info("consumer3 consumed the message {}",message);
//    }
//
//    @KafkaListener(topics = "kafkaDemo4", groupId = "kafka-demo-group3")
//    public void consume4(String message){
//
//        logger.info("consumer4 consumed the message {}",message);
//
//    }

}
