package com.piyush.practice.internalcustomizedautoconfig;

import com.piyush.practice.domain.Student;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.web.EmbeddedServletContainerAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by piyushkumar on 09/09/17.
 */

@Configuration
@ConditionalOnClass(value = {EmbeddedServletContainerAutoConfiguration.EmbeddedTomcat.class})
public class StudentAutoConfiguration {

    @Bean
    public Student student(){
        Student student = new Student();
        student.setId(1);
        student.setName("Piyush Kumar");
        student.setCollegeName("XYZ college");

        return student;
    }
}
