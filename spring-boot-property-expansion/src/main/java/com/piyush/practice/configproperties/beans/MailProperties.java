package com.piyush.practice.configproperties.beans;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Created by piyushkumar on 03/09/17.
 */

/**
 * We have to provide the getters and setters both. If we provide only the getters, then the value of the properties from yml
 * won't get set in the instance variables of the class.
 */
@ConfigurationProperties(locations = "classpath:my-application.yml", prefix = "mail")
public class MailProperties {
    private String host;
    private String username;
    private String password;

    public void setHost(String host) {
        this.host = host;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getHost() {
        return host;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}
