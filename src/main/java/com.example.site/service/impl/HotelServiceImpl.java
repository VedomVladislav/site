package com.example.site.service.impl;

import com.example.site.dao.HotelDao;
import com.example.site.model.Hotel;
import com.example.site.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HotelServiceImpl implements HotelService {

    @Autowired
    private HotelDao hotelDao;

    @Override
    public List<Hotel> getAllHotels() {
        return hotelDao.getAllHotels();
    }

    @Override
    public Hotel getHotelById(Integer id) {
        return hotelDao.getHotelById(id);
    }
}
