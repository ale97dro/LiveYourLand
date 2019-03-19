package com.bianchi.platform.controllertest;

import com.bianchi.platform.model.City;
import com.bianchi.platform.model.Picture;
import com.bianchi.platform.service.CityService;
import com.bianchi.platform.service.PictureService;
import org.aspectj.weaver.patterns.ExactTypePattern;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Controller
public class ControllerTest
{
    @Autowired
    private CityService cityService;
    @Autowired
    private PictureService pictureService;

    @GetMapping("/test")
    public String getTest()
    {
        System.out.println("test ok");
        return "test";
    }

    @GetMapping("/")
    public String getIndex(Model model)
    {
        List<City> cities = cityService.getAllCities();

        for(City c : cities)
            c.createTruncateDescription();

        model.addAttribute("cities", cities);
        return "index";
    }

    @GetMapping("/city/{cityName}")
    public String getCity(Model model, @PathVariable String cityName)
    {
        City city = cityService.getCityByName(cityName);

        List<Picture> cityPictures = pictureService.getPicturesByCity(city);


        model.addAttribute("city", city);

        //Try to add 4 images: if there isn't 4 images, upload all the images
        try
        {
            model.addAttribute("pictures", cityPictures.subList(0, 4));
        }
        catch(Exception ex)
        {
            model.addAttribute("pictures", cityPictures);
        }
        model.addAttribute("picturesList", null); //todo: aggiugnere l'elenco di link per le immagini
        return "city";
    }
}