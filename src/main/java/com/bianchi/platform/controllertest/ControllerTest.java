package com.bianchi.platform.controllertest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ControllerTest
{
    @GetMapping("/test")
    public String getTest()
    {
        System.out.println("test ok");
        return "test";
    }

    @GetMapping("/")
    public String getIndex()
    {
        return "index";
    }
}