package com.techjava.cloudconfigclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class EnvController {

    @Value("${msg:Config server is down. Sorry for inconvenience}")
    private String msg;

    @GetMapping("/msg")
    public String getEnviornment(){
        return msg;
    }
}
