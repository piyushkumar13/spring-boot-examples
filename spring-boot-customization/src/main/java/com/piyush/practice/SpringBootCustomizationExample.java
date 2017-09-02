package com.piyush.practice;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

import java.io.PrintStream;
import java.util.Properties;

/**
* Here, we are not using any @SpringBootApplication or @EnableAutoConfiguration annotation coz we are using the following
* dependency in our pom :
*  <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter</artifactId>
   </dependency>
* which is core spring context. We are using this coz, we are not going to use any web server or not going to configure any
* beans. But, if we add the following dependency in the pom :
* <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-web</artifactId>
  </dependency>
* Then, we have to use the @SpringBootApplication or @EnableAutoConfiguration annotation to wire up and start the embedded
* webserver which comes with this dependency. Otherwise, we will get the exception i.e unable to start embedded container.
*
* */
@SpringBootApplication
//@EnableAutoConfiguration
public class SpringBootCustomizationExample {

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(SpringBootCustomizationExample.class);

        app.setLogStartupInfo(false);
        app.setBannerMode(Banner.Mode.CONSOLE);
        /*
        * We can customize banner either by putting banner.txt in the resources directory or by adding following code. If
        * both are there, then resources/banner.txt will override the following code banner.
        * */
        app.setBanner(new Banner() {
            @Override
            public void printBanner(Environment environment, Class<?> sourceClass, PrintStream out) {
                out.println("-----------The custom banner-------------");
            }
        });
        Properties properties = new Properties();
        properties.setProperty("banner.location","my-banner.txt");
        app.setDefaultProperties(properties);
        app.run(args);
    }
}
