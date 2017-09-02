package com.piyush.practice.controller;

import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by piyushkumar on 02/09/17.
 */

@RestController
public class MyController {

    @RequestMapping(path = "/path2", method = RequestMethod.GET)
    public String getMessage() {

        return "Response from controller";
    }
}
