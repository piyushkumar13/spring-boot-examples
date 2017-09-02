package com.piyush.practice.beans.runners;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.Ordered;

/**
 * Created by piyushkumar on 02/09/17.
 */

public class CommandLineRunner2 implements CommandLineRunner, Ordered {

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Inside command line runner 2 ::: "+ args.length);
    }

    @Override
    public int getOrder() {
        return 4;
    }
}
