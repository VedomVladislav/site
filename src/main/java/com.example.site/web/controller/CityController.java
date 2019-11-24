package com.example.site.web.controller;

import com.example.site.model.City;
import com.example.site.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/cities")
public class CityController {

    @Autowired
    private CityService cityService;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String getAllCities(Model model) {
        List<City> cities = cityService.getAllCities();
        model.addAttribute("cities", cities);
        return "cities/cities";
    }

//    @RequestMapping(value = "idCity", method = RequestMethod.GET)
    @GetMapping("/edit/{idCity}")
    public String getCityById(@RequestParam(value = "idCity", required = false)Integer id, Model model) {
        City city = cityService.getCityById(id);
        List<City> cities = new ArrayList<>();
        cities.add(city);
        model.addAttribute("cities", cities);
        return "cities/cities";
    }

}
