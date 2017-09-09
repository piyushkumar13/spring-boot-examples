package com.piyush.practice;

import com.piyush.practice.internalcustomizedautoconfig.autoconfigscheck.StudentAutoConfigCheck;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * Created by piyushkumar on 09/09/17.
 */

/**
 * We can create autoconfigurations internal to this project. By creating internal autoconfigurations do not make more sense
 * to create. We can directly use bean annotation method inside the @Configuration class and autowire the bean anywhere.
 * But, if we do internal autoconfigurations in addition to use bean annotation method inside the @Configuration class. We
 * have to create spring.factories file within META-INF directory of resources.
 */
@SpringBootApplication
public class AppWithInternalCustomizedAutoConfig {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(AppWithExternalCustomizedAutoConfig.class, args);
        StudentAutoConfigCheck check = (StudentAutoConfigCheck) context.getBean("studentAutoConfigCheck");
        check.testStudentConfigs();
    }
}
