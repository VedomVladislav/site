package com.example.site.dao;

import com.example.site.model.Hotel;

import java.util.List;

public interface HotelDao{

    List<Hotel> getAllHotels();
    Hotel getHotelById(Integer id);
}
