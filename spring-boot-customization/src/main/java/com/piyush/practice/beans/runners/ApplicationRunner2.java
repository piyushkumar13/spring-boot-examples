package com.piyush.practice.beans.runners;

import javafx.application.Application;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.Ordered;

/**
 * Created by piyushkumar on 02/09/17.
 */
public class ApplicationRunner2 implements ApplicationRunner, Ordered {
    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("Inside application runner 2 ::: "+ args.getNonOptionArgs());
    }

    @Override
    public int getOrder() {
        return 3;
    }
}
