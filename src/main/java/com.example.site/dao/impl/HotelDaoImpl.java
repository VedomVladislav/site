package com.example.site.dao.impl;

import com.example.site.dao.HotelDao;
import com.example.site.model.Hotel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class HotelDaoImpl implements HotelDao {

    private static final String GET_ALL_HOTELS = "SELECT * FROM hotel";
    private static final String GET_HOTEL_BY_ID = "SELECT * FROM hotel WHERE id = :id";

    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    @Autowired
    public void setNamedParameterJdbcTemplate(NamedParameterJdbcTemplate namedParameterJdbcTemplate) {
        this.namedParameterJdbcTemplate = namedParameterJdbcTemplate;
    }

    @Override
    public List<Hotel> getAllHotels() {
        return namedParameterJdbcTemplate.query(GET_ALL_HOTELS, new HotelMapper());
    }

    @Override
    public Hotel getHotelById(Integer id) {
        MapSqlParameterSource mapSqlParameterSource = new MapSqlParameterSource();
        mapSqlParameterSource.addValue("id", id);
        return namedParameterJdbcTemplate.queryForObject(GET_HOTEL_BY_ID, mapSqlParameterSource, new HotelMapper());
    }

    private static final class HotelMapper implements RowMapper<Hotel> {
        public Hotel mapRow(ResultSet rs, int rowNum) throws SQLException {
            Hotel hotel = new Hotel();
            hotel.setId(rs.getInt("id"));
            hotel.setName(rs.getString("name"));
            hotel.setName(rs.getString("name"));
            hotel.setStars(rs.getInt("stars"));
            hotel.setCityId(rs.getInt("cityId"));
            return hotel;
        }
    }
}
