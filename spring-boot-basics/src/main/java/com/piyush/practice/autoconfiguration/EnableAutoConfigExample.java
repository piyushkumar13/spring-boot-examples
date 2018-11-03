package com.piyush.practice.autoconfiguration;

import com.piyush.practice.autoconfiguration.controller.MessagingController;
import com.piyush.practice.autoconfiguration.service.MessagingService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;

/**
 * @Author Piyush Kumar
 *
 * @EnableAutoConfiguration is like @Configuration but with some extra capabilities i.e it binds the configurations with
 * the spring context based on the jars present in the class path. @EnableAutoConfiguration is the superset of the
 * @Configuration
 *
 */
@EnableAutoConfiguration //This Configuration will be loaded by the AnnotationConfigApplicationContext which is registered
// by the statement SpringApplication.run(...) statement.
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
