package com.fen.dou;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class Controller {

    @Value("${spring.application.name}")
    private String serverName;

    @Value("${server.port}")
    private String serverPort;

    @Value("${spring.cloud.nacos.discovery.metadata.version}")
    private String version;


    @GetMapping("/service")
    public String getApplicationInfo() {
        return "application name is: 【" + serverName + "】, server port is: 【" + serverPort + "】" + ", version is: 【" + version + "】";
    }
}
