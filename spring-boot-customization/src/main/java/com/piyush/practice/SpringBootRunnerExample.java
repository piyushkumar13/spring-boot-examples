package com.piyush.practice;

import com.piyush.practice.beans.CallbacksBean;
import com.piyush.practice.beans.runners.ApplicationRunner1;
import com.piyush.practice.beans.runners.ApplicationRunner2;
import com.piyush.practice.beans.runners.CommandLineRunner1;
import com.piyush.practice.beans.runners.CommandLineRunner2;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

/**
 * Created by piyushkumar on 02/09/17.
 */

@SpringBootApplication
public class SpringBootRunnerExample {

    @Bean
    public CallbacksBean callbacksBean(){
        return new CallbacksBean();
    }

    @Bean
    public CommandLineRunner2 commandLineRunner2() {
        return new CommandLineRunner2();
    }

    @Bean
    public CommandLineRunner1 commandLineRunner1() {
        return new CommandLineRunner1();
    }

    @Bean
    public ApplicationRunner2 applicationRunner2() {
        return new ApplicationRunner2();
    }

    @Bean
    public ApplicationRunner applicationRunner() {
        return new ApplicationRunner1();
    }

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SpringBootRunnerExample.class, args);
        CallbacksBean bean = context.getBean(CallbacksBean.class);
        bean.printMessage();

    }
}
