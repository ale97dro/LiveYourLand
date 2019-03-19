package com.bianchi.platform.repository;

import com.bianchi.platform.model.City;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CityRepository extends JpaRepository<City, Integer>
{
    City findById(int id);
    City findByName(String name);
}
