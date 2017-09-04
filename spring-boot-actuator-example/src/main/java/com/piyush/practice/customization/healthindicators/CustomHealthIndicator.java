package com.piyush.practice.customization.healthindicators;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

/**
 * Created by piyushkumar on 05/09/17.
 */
@Component
public class CustomHealthIndicator implements HealthIndicator {
    @Override
    public Health health() {

        return Health.up().withDetail("description", "This is the customized healthcheck").build();
    }
}
