package com.example.site.service;

import com.example.site.model.Hotel;

import java.util.List;

public interface HotelService {

    List<Hotel> getAllHotels();
    Hotel getHotelById(Integer id);
}
