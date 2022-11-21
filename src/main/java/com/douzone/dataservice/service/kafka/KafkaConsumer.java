package com.douzone.dataservice.service.kafka;

import com.douzone.dataservice.mapper.TestMapper;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.handler.annotation.Headers;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class KafkaConsumer {

    private final TestMapper testMapper;

    @KafkaListener(topics = "insertTable")
    public void insert(@Payload String kafkaMessage,
                       @Headers MessageHeaders messageHeaders){
        String tableName = messageHeaders.get("tableName", String.class);

        Map<String,Object> payload = new LinkedHashMap<>();

        ObjectMapper mapper = new ObjectMapper();
        try{
            payload = mapper.readValue(kafkaMessage, new TypeReference<Map<String, Object>>() {});
        }catch (JsonProcessingException ex){
            ex.printStackTrace();
        }

        List<String> keys = payload.keySet().stream().collect(Collectors.toList());
        List<Object> values = payload.values().stream().collect(Collectors.toList());

        testMapper.insertTable(tableName, keys, values);

    }

}
