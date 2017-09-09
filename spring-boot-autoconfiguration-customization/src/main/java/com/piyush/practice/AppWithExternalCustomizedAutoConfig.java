package com.piyush.practice;

import com.piyush.practice.externalcustomizedautoconfig.autoconfigcheck.AutoconfigCheck;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * Created by piyushkumar on 09/09/17.
 */
/**
 * For this module, I have created another project('spring-boot-piyush-autoconfiguration') as an external jar which I
 * have added in the dependency of this module. This dependency contains the external customized autoconfigurations.
 * */
@SpringBootApplication
public class AppWithExternalCustomizedAutoConfig {

    public static void main(String[] args) {
       ConfigurableApplicationContext context = SpringApplication.run(AppWithExternalCustomizedAutoConfig.class, args);
        AutoconfigCheck check = (AutoconfigCheck)context.getBean("myEmployee");
        check.testAutoconfigEmployee();
        check.testAutoconfigAddress();
    }
}
