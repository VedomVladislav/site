package com.example.site.web.controller;

import com.example.site.model.Hotel;
import com.example.site.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/hotels")
public class HotelController {

    @Autowired
    private HotelService hotelService;

    @RequestMapping (value = "", method = RequestMethod.GET)
    public String getAllHotels(Model model) {
        List<Hotel> hotels = hotelService.getAllHotels();
        model.addAttribute("hotels", hotels);
        return "hotels/hotels";
    }

    @RequestMapping(value = "/{idHotel}", method = RequestMethod.GET)
    public String getHotelById(@PathVariable("idHotel") int id, Model model) {
        Hotel hotel = hotelService.getHotelById(id);
        List<Hotel> hotels = new ArrayList<>();
        hotels.add(hotel);
        model.addAttribute("hotels", hotels);
        return "hotels/hotels";
    }

}
