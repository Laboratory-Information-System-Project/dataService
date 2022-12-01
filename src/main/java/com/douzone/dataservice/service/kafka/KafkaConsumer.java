package com.douzone.dataservice.service.kafka;

import com.douzone.dataservice.mapper.collectmapper.CollectMapper;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
@Slf4j
@RequiredArgsConstructor
public class KafkaConsumer {

    private final CollectMapper collectMapper;
    private final KafkaProducer kafkaProducer;


    @KafkaListener(topics = "sendBarcode")
    public void sendBarcode(String kafkaMessage){

        List<String> prescribeCode= new ArrayList<>();

        prescribeCode.add(collectMapper.getPrescribeCode(kafkaMessage));

        log.info("prescribeCode: ->" + prescribeCode);

        kafkaProducer.send("updateStatus","M", prescribeCode);
    }
}