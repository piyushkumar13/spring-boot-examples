package com.piyush.practice.customization.endpoints;

import org.springframework.boot.actuate.endpoint.Endpoint;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by piyushkumar on 05/09/17.
 */
@Component
public class CustomEndpoints implements Endpoint {
    @Override
    public String getId() {
        return "piyush-endpoint";
    }

    @Override
    public boolean isEnabled() {
        return true;
    }

    @Override
    public boolean isSensitive() {
        return false;
    }

    @Override
    public List<String> invoke() {
        return new ArrayList<String>(){{
            add("Mtech");
            add("Btech");
        }};
    }
}
