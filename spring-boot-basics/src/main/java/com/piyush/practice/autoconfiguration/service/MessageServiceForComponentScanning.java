package com.piyush.practice.autoconfiguration.service;

import org.springframework.stereotype.Component;

/**
 * Created by piyushkumar on 01/09/17.
 */

@Component
public class MessageServiceForComponentScanning {

    public String getMessage(){
        return "This is the message used for the example of enabling autoscanning with component scanning";
    }
}
