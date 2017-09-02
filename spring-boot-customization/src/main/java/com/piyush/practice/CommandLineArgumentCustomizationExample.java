package com.piyush.practice;

import com.piyush.practice.beans.ApplicationArgumentBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

/**
 * Created by piyushkumar on 02/09/17.
 */

/**
 * We can pass the option command-line arguments or plain command-line arguments. Option command-line arguments are prefixed
 * with -- e.g --myarg=myargvalue. Plain command-line arguments are not prefixed with -- e.g myarg. We can pass the arguments
 * as through the command-line or using the maven command e.g mvn spring-boot:run -Drun.arguments="--myarg=myargvalue"
 * */
@SpringBootApplication
public class CommandLineArgumentCustomizationExample {

    @Bean
    ApplicationArgumentBean applicationArgumentBean(){
        return new ApplicationArgumentBean();
    }

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(CommandLineArgumentCustomizationExample.class, args);
        ApplicationArgumentBean bean = context.getBean(ApplicationArgumentBean.class);
        bean.printArguments();
    }
}
