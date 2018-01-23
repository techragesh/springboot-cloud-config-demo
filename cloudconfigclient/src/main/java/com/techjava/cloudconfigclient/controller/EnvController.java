package com.techjava.cloudconfigclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RequestMapping("/rest")
@RestController
public class EnvController {

    @Value("${msg: Config server is down. Sorry for inconvenience..!}")
    private String msg;

    @GetMapping("/msg")
    public String getEnviornment(){
        return msg;
    }
}
