package com.bianchi.platform.repository;

import com.bianchi.platform.model.City;
import com.bianchi.platform.model.Picture;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CityRepository extends JpaRepository<City, Integer>
{
    City findByName(String name);
}
