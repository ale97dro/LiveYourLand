package com.bianchi.platform.controllertest;

import com.bianchi.platform.model.City;
import com.bianchi.platform.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class ControllerTest
{
    @Autowired
    private CityService cityService;

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

    @GetMapping("/city/{cityName}")
    public String getCity(Model model, @PathVariable String cityName)
    {

        model.addAttribute("city", cityService.getCityByName(cityName));
        model.addAttribute("picturesList", null); //todo: aggiugnere l'elenco di link per le immagini
        return "city";
    }
}