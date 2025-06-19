package com.kafka.springboot.kafka;

import com.kafka.springboot.payload.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class JsonKafkaConsumer {
    private static final Logger LOGGER = LoggerFactory.getLogger(JsonKafkaConsumer.class);

    @KafkaListener(topics = "kafkatopic_json", groupId = "kafka-g01")
    public void consumer(User data) {
        LOGGER.info(String.format("Json Message Received -> %s", data.toString()));
    }
}
