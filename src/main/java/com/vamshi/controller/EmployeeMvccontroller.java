package com.vamshi.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class EmployeeMvccontroller {

    private static final Logger logg= LogManager.getLogger(EmployeeMvccontroller.class);


    @GetMapping({"/home", "/",""})
    public String employeeregister(){
        logg.info("not loading class");
        return "EmployeeeLogin.html";
    }
}
