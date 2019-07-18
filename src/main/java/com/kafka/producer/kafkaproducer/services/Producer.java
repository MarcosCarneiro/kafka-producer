package com.kafka.producer.kafkaproducer.services;

import org.apache.avro.generic.GenericRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class Producer {

    private static final Logger logger = LoggerFactory.getLogger(Producer.class);

    @Autowired
    KafkaTemplate<String, GenericRecord> kafkaTemplate;

    private static final String TOPIC = "topic-hamburgo-test";

    public void sendMessage(GenericRecord genericRecord){
        logger.info("Message producer: " + genericRecord);
        kafkaTemplate.send(TOPIC, genericRecord);
    }
}
