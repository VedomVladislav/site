package com.example.site.service.impl;

import com.example.site.dao.CityDao;
import com.example.site.model.City;
import com.example.site.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CityServiceImpl implements CityService {

    @Autowired
    private CityDao cityDao;

    @Override
    public List<City> getAllCities() {
        return cityDao.getAllCities();
    }

    @Override
    public City getCityById(Integer id) {
        return cityDao.getCityById(id);
    }
}
