package com.bianchi.platform.controllertest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

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


/*
PROPERTIES FOR DB
    spring.datasource.url=jdbc:mysql://localhost:3306/tourism
    spring.jpa.generate-ddl=true
    spring.jpa.hibernate.ddl-auto=update
    spring.datasource.username=user
    spring.datasource.password=123456
    spring.jmx.enabled=false
    spring.jpa.properties.hibernate.dialect = org.hibernate.dialect.MySQL5InnoDBDialect
 */