package com.example.site.dao;

import com.example.site.model.City;
import com.example.site.model.Hotel;

import java.util.List;
import java.util.Map;

public interface CityDao {

    List<City> getAllCities();
    City getCityById(Integer id);
}
