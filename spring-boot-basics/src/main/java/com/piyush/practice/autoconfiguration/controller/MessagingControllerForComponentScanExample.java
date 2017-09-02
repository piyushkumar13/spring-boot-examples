package com.piyush.practice.autoconfiguration.controller;

import com.piyush.practice.autoconfiguration.service.MessageServiceForComponentScanning;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by piyushkumar on 01/09/17.
 */

@RestController
public class MessagingControllerForComponentScanExample {

    @Autowired
    private MessageServiceForComponentScanning messageService;

    @RequestMapping(path = "/message/component-scan/example", method = RequestMethod.GET)
    public String getMessage() {
        return messageService.getMessage();
    }
}
