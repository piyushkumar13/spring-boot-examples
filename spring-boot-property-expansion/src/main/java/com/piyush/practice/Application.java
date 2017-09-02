package com.piyush.practice;

import com.piyush.practice.configproperties.beans.DbProperties;
import com.piyush.practice.configproperties.beans.MailProperties;
import com.piyush.practice.profiles.beans.DevMessagingService;
import com.piyush.practice.profiles.beans.MessagingService;
import com.piyush.practice.profiles.beans.ProdMessagingService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;

/**
 * Created by piyushkumar on 03/09/17.
 */

@SpringBootApplication
public class Application {

    @Bean
    @Profile("dev")
    public MessagingService devMessagingService() {
        return new DevMessagingService();
    }

    @Bean
    @Profile("prod")
    public MessagingService prodMessagingService() {
        return new ProdMessagingService();
    }

    @Bean
    public MailProperties mailProperties() {
        return new MailProperties();
    }

    @Bean
    public DbProperties dbProperties() {
        return new DbProperties();
    }

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(Application.class, args);
        MessagingService service = context.getBean(MessagingService.class);
        service.printMessage();

        DbProperties dbProperties = context.getBean(DbProperties.class);
        System.out.println("The db name is ::: " + dbProperties.getName());

        MailProperties mailProperties = context.getBean(MailProperties.class);
        System.out.println("The mail host is ::: " + mailProperties.getHost());
    }
}
