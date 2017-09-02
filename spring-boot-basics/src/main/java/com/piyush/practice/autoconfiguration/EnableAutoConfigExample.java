package com.piyush.practice.autoconfiguration;

import com.piyush.practice.autoconfiguration.controller.MessagingController;
import com.piyush.practice.autoconfiguration.service.MessagingService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;

/**
 * Created by piyushkumar on 29/08/17.
 */

@EnableAutoConfiguration
public class EnableAutoConfigExample {

    @Bean
    public MessagingService messagingService(){
        return new MessagingService();
    }

    @Bean
    public MessagingController myController(){
        return new MessagingController();
    }

    public static void main(String[] args) {
        SpringApplication.run(EnableAutoConfigExample.class, args);
    }
}
