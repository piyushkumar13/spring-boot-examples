package com.piyush.practice.autoconfiguration.controller;

import com.piyush.practice.autoconfiguration.service.MessagingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author Piyush Kumar
 * @Date 11/01/2018
 */
@RestController
public class MessagingController {

    @Autowired
    private MessagingService messagingService;

    @RequestMapping(path = "/message", method = RequestMethod.GET)
    public String getMessage(){
        return messagingService.getMessage();
    }
}
