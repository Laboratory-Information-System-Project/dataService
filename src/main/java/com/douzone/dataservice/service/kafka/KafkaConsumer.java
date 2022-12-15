package com.douzone.dataservice.service.kafka;

import com.douzone.dataservice.mapper.InspectionMapper;
import com.douzone.dataservice.mapper.collectmapper.CollectMapper;
import com.douzone.dataservice.mapper.conclusion.SmsMapper;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@Slf4j
@RequiredArgsConstructor
public class KafkaConsumer {

    private final InspectionMapper inspectionMapper;
    private final KafkaProducer kafkaProducer;

    private final CollectMapper collectMapper;
    private final SmsMapper smsMapper;

    @KafkaListener(topics = "sendBarcode")
    public void sendBarcode(String kafkaMessage){

        List<String> prescribeCode= new ArrayList<>();

        Map<String, Object> map = new HashMap<>();
        ObjectMapper mapper = new ObjectMapper();
        try{
            map = mapper.readValue(kafkaMessage, new TypeReference<Map<String, Object>>() {});
        }catch (JsonProcessingException ex){
            ex.printStackTrace();
        }

        prescribeCode.add(inspectionMapper.getPrescribeCode(map));

        kafkaProducer.send("updateStatus","M", prescribeCode);
    }

    @KafkaListener(topics = "sendBarcodeUpdate")
    public void sendBarcodeUpdate(String kafkaMessage){

        kafkaProducer.send("updateStatus","D", collectMapper.getCode(kafkaMessage));
    }

    @KafkaListener(topics = "sendBarcodeReUpdate")
    public void sendBarcodeReUpdate(String kafkaMessage){
        kafkaProducer.send("updateStatus","X", collectMapper.getCode(kafkaMessage));
        kafkaProducer.send("updateCancellation","1",collectMapper.getCode(kafkaMessage));
    }

    @KafkaListener(topics = "smsDelete")
    public void smsDataDelete(String kafkaMessage){
        smsMapper.smsDelete(kafkaMessage);
    }
}