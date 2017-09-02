package com.piyush.practice;

import com.piyush.practice.servlet.components.nonannotated.NonAnnotatedServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;

import static java.util.Arrays.asList;

/**
 * Created by piyushkumar on 02/09/17.
 */

@SpringBootApplication
public class NonAnnotatedServletApplicationMain {

    /**
     * ServletRegistrationBean is use to register the non-annotated servlets i.e servlets not annotated with @WebServlet.
     * It register the servlets without changing the servlet code.
     * Corresponding classes for the filters and listeners are FilterRegistrationBean and ListenerRegistrationBean.
     * */
    @Bean
    ServletRegistrationBean servletRegistrationBean(){
        ServletRegistrationBean bean = new ServletRegistrationBean();
        bean.setServlet(new NonAnnotatedServlet());
        bean.setUrlMappings(asList("/path3"));
        return bean;
    }

    public static void main(String[] args) {
        SpringApplication.run(NonAnnotatedServletApplicationMain.class, args);
    }
}
