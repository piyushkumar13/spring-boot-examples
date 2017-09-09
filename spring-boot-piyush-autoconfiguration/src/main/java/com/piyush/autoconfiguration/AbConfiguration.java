package com.piyush.autoconfiguration;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.web.EmbeddedServletContainerAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by piyushkumar on 09/09/17.
 *
 * Consider we have defined two autoconfiguration which is returning/registering same Employee object. But one with ConditionalOnClass
 * annotation i.e AbConfiguration class in this project and another one with ConditionalOnMissingClass i.e AnotherConfiguration
 * class in this project. Then following happens :
 * First, ConditionalOnMissingClass autoconfiguration gets loaded(irrespective of the order in which the autoconfiguration defined in
 * spring.factories), then ConditionalOnClass autoconfiguration gets loaded. Hence, ConditionalOnClass autoconfiguration overrides
 * ConditionalOnMissingClass autoconfiguration. But, there we can make it to load ConditionalOnClass autoconfiguration and then
 * ConditionalOnMissingClass autoconfiguration by using AutoConfigureAfter and AutoConfigurebefore.
 * <p/>
 * If both the autoconfiguration classes using ConditionalOnClass/ConditionalOnMissingClass, then it won't consider the order in which
 * autoconfiguration is defined in spring.factories. It loads autoconfiguration alphabetically. The autoconfiguration which loaded last
 * will override all the loaded autoconfiguration.
 */

@Configuration
@ConditionalOnClass(value = {EmbeddedServletContainerAutoConfiguration.EmbeddedTomcat.class})
public class AbConfiguration {

    @Bean
    public Employee employee() {
        Employee employee = new Employee();
        employee.setId(1);
        employee.setCompany("My Company");
        employee.setName("Piyush Kumar");

        return employee;
    }
}
