package com.kafka.producer.kafkaproducer.controller;

import com.kafka.producer.kafkaproducer.kafkaSchema.TedMapper;
import com.kafka.producer.kafkaproducer.modelsVO.TedVO;
import com.kafka.producer.kafkaproducer.services.Producer;
import org.apache.avro.generic.GenericRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ted")
public class TedController {

    @Autowired
    Producer producer;

    @Autowired
    TedMapper tedMapper;

    @PostMapping
    public void saveTed(@RequestBody TedVO tedVO){
        GenericRecord genericRecord = tedMapper.mapToGenericRecord(tedVO);
        producer.sendMessage(genericRecord);
    }
}
