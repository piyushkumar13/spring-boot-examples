package com.piyush.autoconfiguration;

import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by piyushkumar on 09/09/17.//
 */

@Configuration
@ConditionalOnMissingClass(value = {"org.springframework.batch.core.launch.JobLauncher"})
@AutoConfigureAfter({AbConfiguration.class})
public class AnotherConfiguration {

//    @Bean
//    public Employee employee(){
//        Employee employee = new Employee();
//        employee.setId(2);
//        employee.setCompany("My Company1");
//        employee.setName("Piyush Kumar1");
//
//        return employee;
//    }

    @Bean
    public Address address(){
        Address address = new Address();
        address.setHouseNo("208");
        address.setApartmentName("apn apartment");
        address.setArea("Marathahalli");
        address.setStreetName("XV street");
        address.setCity("Bangalore");
        address.setState("Karnataka");

        return address;
    }

}
