package com.piyush.practice.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Created by piyushkumar on 03/09/17.
 */
public class CallbacksBean {
    /**
     * @PostConstruct method will be call way before run methods of Application or CommandLine runners. Coz postconstruct method
     * gets called when bean is initialized(or created) which happens way before full startup of the application.
     */
    @PostConstruct
    public void init() {
        System.out.println("Inside the post construct method");

    }

    public void printMessage() {
        System.out.println("Inside print message method");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Inside the pre destroy method");
    }

}
