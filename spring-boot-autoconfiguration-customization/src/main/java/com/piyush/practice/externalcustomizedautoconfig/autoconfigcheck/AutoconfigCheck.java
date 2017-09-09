package com.piyush.practice.externalcustomizedautoconfig.autoconfigcheck;

import com.piyush.autoconfiguration.Address;
import com.piyush.autoconfiguration.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by piyushkumar on 09/09/17.
 */
@Component("myEmployee")
public class AutoconfigCheck {

    @Autowired
    private Employee employee;

    @Autowired
    private Address address;

    public void testAutoconfigEmployee() {
        System.out.println("The employee details are :::: " + employee);
    }

    public void testAutoconfigAddress() {
        System.out.println("The address details are ::: " + address);
    }

}
