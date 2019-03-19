package com.bianchi.platform.service;

import com.bianchi.platform.model.City;
import com.bianchi.platform.model.Picture;
import com.bianchi.platform.repository.PictureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PictureService
{
    @Autowired
    PictureRepository pictureRepository;

    public List<Picture> getPicturesByCity(City city)
    {
        return pictureRepository.getAllByPlace(city);
    }
}
