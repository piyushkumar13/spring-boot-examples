package com.piyush.practice.autoconfiguration;

import com.piyush.practice.autoconfiguration.service.MessagingService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by piyushkumar on 01/09/17.
 */

@EnableAutoConfiguration
@ComponentScan
public class EnableAutoConfigWithComponentScanExample {

    /*
    * Following bean added to ignore the autowiring of the MessagingService class in the MessagingController.
    * */
    @Bean
    public MessagingService messagingService(){
        return new MessagingService();
    }

    public static void main(String[] args) {
        SpringApplication.run(EnableAutoConfigWithComponentScanExample.class, args);
    }
}
