package com.team13.serviceuser.controller;

import com.team13.serviceuser.dto.ResponseDto;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class IndexController {

    @Value("${app.test-string}")
    private String configTestString;

    @GetMapping
    public String index() {
        return "Index page of service-user";
    }

    @GetMapping("/config")
    public String getConfig() { return configTestString; }

    @GetMapping("/service-connection-test")
    public ResponseDto serviceConnectionTest() {
        return new ResponseDto("Greeting!!");
    }

}