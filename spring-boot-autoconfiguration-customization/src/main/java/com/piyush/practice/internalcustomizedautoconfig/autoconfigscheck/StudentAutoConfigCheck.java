package com.piyush.practice.internalcustomizedautoconfig.autoconfigscheck;

import com.piyush.practice.domain.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by piyushkumar on 09/09/17.
 */
@Component("studentAutoConfigCheck")
public class StudentAutoConfigCheck {

    @Autowired
    Student student;

    public void testStudentConfigs(){
        System.out.println("The details of the student is ::: "+ student);
    }
}
