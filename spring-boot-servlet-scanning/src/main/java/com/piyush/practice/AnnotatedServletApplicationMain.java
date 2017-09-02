package com.piyush.practice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

/**
 * Created by piyushkumar on 02/09/17.
 */
/**
 * With @ServletComponentScan, we can scan the servlet components having servlet 3.0 annotations like @WebServlet, @WebFilter
 * and @WebListener. This @ServletComponentScan annotation is used to register the servlet components with the spring boot
 * embedded servlet container without modifying the existing servlet-code.
 *
* */
@SpringBootApplication
@ServletComponentScan
public class AnnotatedServletApplicationMain {

    public static void main(String[] args) {
        SpringApplication.run(AnnotatedServletApplicationMain.class, args);
    }
}
