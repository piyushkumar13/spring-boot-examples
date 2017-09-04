package com.piyush.practice.customization.endpoints;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.endpoint.AbstractEndpoint;
import org.springframework.boot.actuate.endpoint.Endpoint;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by piyushkumar on 05/09/17.
 */
@Component
public class ListAllEndpoints extends AbstractEndpoint<List<Endpoint>> {

    private List<Endpoint> endpoints;

    @Autowired
    public ListAllEndpoints(List<Endpoint> endpoints) {
        super("listEndpoints");
        this.endpoints = endpoints;
        this.setEnabled(true);
    }

    @Override
    public List<Endpoint> invoke() {
        return endpoints;
    }

}
