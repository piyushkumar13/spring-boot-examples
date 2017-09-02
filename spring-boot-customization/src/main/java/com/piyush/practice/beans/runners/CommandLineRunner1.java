package com.piyush.practice.beans.runners;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.util.StringUtils;

/**
 * Created by piyushkumar on 02/09/17.
 */

@Order(2)
public class CommandLineRunner1 implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {

        System.out.println("Inside command line runner 1 :::: "+ args.length);
    }
}
