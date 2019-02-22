package com.bianchi.platform.controllertest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class ControllerTest
{
    @GetMapping("/")
    public String get()
    {
        System.out.println("test ok");
        return "index";
    }
}
