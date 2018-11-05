package com.tong.school_chat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class SchoolChatApplication {

    public static void main(String[] args) {
        SpringApplication.run(SchoolChatApplication.class, args);
    }
    
}
