package com.brain.fisc.contribuable.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class FiscalisationKafkaConsumer {

    private final Logger log = LoggerFactory.getLogger(FiscalisationKafkaConsumer.class);
    private static final String TOPIC = "topic_fiscalisation";

    @KafkaListener(topics = "topic_fiscalisation", groupId = "group_id")
    public void consume(String message) throws IOException {
        log.info("Consumed message in {} : {}", TOPIC, message);
    }
}
