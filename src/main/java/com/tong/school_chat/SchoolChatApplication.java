package com.tong.school_chat;

import com.tong.school_chat.domain.Dog;
import com.tong.school_chat.domain.Pet;
import com.tong.school_chat.domain.TestPet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SchoolChatApplication {

    public static void main(String[] args) {
    
        ApplicationContext ctx = SpringApplication.run(SchoolChatApplication.class, args);
        TestPet testPet = ctx.getBean(TestPet.class);
        System.out.println(testPet.toString());
        testPet.move();
    }

}
