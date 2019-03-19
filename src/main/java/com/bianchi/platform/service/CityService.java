package com.bianchi.platform.service;

import com.bianchi.platform.model.City;
import com.bianchi.platform.model.Picture;
import com.bianchi.platform.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityService
{
    @Autowired
    private CityRepository cityRepository;

    public City getCityByName(String name)
    {
        return cityRepository.findByName(name);
    }

    public List<City> getAllCities()
    {
        return cityRepository.findAll();
    }
}
