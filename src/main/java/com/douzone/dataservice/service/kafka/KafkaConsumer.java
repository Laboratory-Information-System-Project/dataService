package com.douzone.dataservice.service.kafka;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

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
}


