package com.piyush.practice.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;

/**
 * Created by piyushkumar on 02/09/17.
 */
public class ApplicationArgumentBean {

    @Autowired
    private ApplicationArguments argument;

    public void printArguments(){

        System.out.println("The option arguments names are ::: "+argument.getOptionNames());
        System.out.println("The option values are ::: " + argument.getOptionValues("myarg"));
        System.out.println("The non-option arguments are ::: "+argument.getNonOptionArgs());
    }
}
