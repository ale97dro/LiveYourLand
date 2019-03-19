package com.bianchi.platform;

import com.bianchi.platform.model.City;
import com.bianchi.platform.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class DBLoader {

    @Autowired
    private CityRepository cityRepository;

    public DBLoader()
    {

    }

    @PostConstruct
    public void load()
    {
        if(cityRepository.findByName("Brebbia") == null)
        {
            City brebbia = new City("Brebbia", "Secondo Bombogni e Redaelli,");
            cityRepository.save(brebbia);
        }
    }
}
