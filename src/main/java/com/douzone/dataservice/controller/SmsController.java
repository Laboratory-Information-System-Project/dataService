package com.douzone.dataservice.controller;

import com.douzone.dataservice.domain.MessagesRequestDTO;
import com.douzone.dataservice.domain.SendSmsResponseDTO;
import com.douzone.dataservice.service.SmsService;
import com.fasterxml.jackson.core.JsonProcessingException;
import lombok.RequiredArgsConstructor;
import org.apache.catalina.connector.Request;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestClientException;

import java.io.UnsupportedEncodingException;
import java.net.URISyntaxException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.text.ParseException;

@RestController
@RequestMapping("/data-service")
@RequiredArgsConstructor
@Controller
public class SmsController {

    private SmsService service;

    @GetMapping("/")
    public String getSmsPage() {
        return "sendSms";
    };

    @PostMapping(value = "/send/sms", produces="application/json", consumes = "application/json")
    public ResponseEntity<SendSmsResponseDTO> test(@RequestBody MessagesRequestDTO messagesRequestDTO) throws JsonProcessingException, RestClientException, URISyntaxException, InvalidKeyException, NoSuchAlgorithmException, UnsupportedEncodingException, ParseException {
        SendSmsResponseDTO data = service.sendSms(messagesRequestDTO.getSubject(), messagesRequestDTO.getTo(), messagesRequestDTO.getContent());
        return ResponseEntity.ok().body(data);
    };

}

