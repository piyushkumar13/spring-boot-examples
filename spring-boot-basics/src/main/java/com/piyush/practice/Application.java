package com.piyush.practice;

import com.piyush.practice.autoconfiguration.service.MessagingService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/**
 * Created by piyushkumar on 29/08/17.
 */

@SpringBootApplication
public class Application {

    /*
    * Following bean added to ignore the autowiring of the MessagingService class in the MessagingController.
    * */
    @Bean
    public MessagingService messagingService() {
        return new MessagingService();
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
