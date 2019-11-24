package com.example.site.service;

import com.example.site.model.City;

import java.util.List;

public interface CityService {

    List<City> getAllCities();
    City getCityById(Integer id);

}
