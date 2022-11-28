package com.douzone.dataservice.service.kafka;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
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

    // FIXME: repository -> mapper
    // private final CatalogRepository catalogRepository;
    //
    // FIXME: topics modify, method customizing
    // @KafkaListener(topics = "example-catalog-topic")
    // public void updateQty(String kafkaMessage){
    //     log.info("Kafka Message: ->" + kafkaMessage);
    //
    //     Map<String, Object> map = new HashMap<>();
    //     ObjectMapper mapper = new ObjectMapper();
    //     try{
    //         map = mapper.readValue(kafkaMessage, new TypeReference<Map<String, Object>>() {});
    //     }catch (JsonProcessingException ex){
    //         ex.printStackTrace();
    //     }
    //
    //     CatalogEntity entity = catalogRepository.findByProductId((String)map.get("productId"));
    //
    //     if(entity != null){
    //         entity.setStock(entity.getStock() - (Integer)map.get("qty"));
    //         catalogRepository.save(entity);
    //     }
    // }

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

        // testMapper.insertTable(tableName, keys, values);

    }

}
