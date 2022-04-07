package com.fen.dou;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.embedded.undertow.UndertowBuilderCustomizer;
import org.springframework.boot.web.embedded.undertow.UndertowServletWebServerFactory;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.AdviceMode;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableDiscoveryClient
@SpringBootApplication
@EnableAsync(mode = AdviceMode.PROXY)
@EnableTransactionManagement
public class Application  implements WebServerFactoryCustomizer<UndertowServletWebServerFactory> {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Override
    public void customize(UndertowServletWebServerFactory factory) {
        factory.addBuilderCustomizers((UndertowBuilderCustomizer) builder -> {
            builder.addHttpListener(8080, "0.0.0.0");
        });
    }
}
