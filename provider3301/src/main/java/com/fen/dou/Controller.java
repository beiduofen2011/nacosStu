package com.fen.dou;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

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
    public String getApplicationInfo() throws InterruptedException {
        Thread.sleep(5000);
        return "application name is: 【" + serverName + "】, server port is: 【" + serverPort + "】" + ", version is: 【" + version + "】";
    }

    @GetMapping("/service1")
    public String getApplicationInfo1() throws InterruptedException {
        Thread.sleep(5000);
        return "application name is: 【" + serverName + "】, server port is: 【" + serverPort + "】" + ", version is: 【" + version + "】";
    }

    @PostMapping("/service")
    public String postApplicationInfo(@RequestBody User user) {
        return "application name is: 【" + serverName + "】, server port is: 【" + serverPort + "】" + ", version is: 【" + version + "】";
    }


}
