package com.piyush.practice.profiles.beans;

import org.springframework.beans.factory.annotation.Value;

/**
 * Created by piyushkumar on 03/09/17.
 */

public class DevMessagingService implements MessagingService {

    @Value("${app.name}")
    private String appName;

    @Value("${app.author}")
    private String appAuthor;

    @Value("${project.name}")
    private String projectName;

    @Value("${app.message}")
    private String message;

    @Override
    public void printMessage() {
        System.out.println("This is the dev messaging service. The author is :: " + appAuthor + ".The app name is :: " + appName);
        System.out.println("The name of the project is ::: " + projectName);
        System.out.println("My message ::: " + message);
    }
}
