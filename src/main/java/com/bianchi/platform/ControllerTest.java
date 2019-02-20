package com.bianchi.platform;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerTest
{
    @RequestMapping(value="/person", method= RequestMethod.GET)
    public String get()
    {
        System.out.println("ciao");
        return "troppo fico";
    }
}
