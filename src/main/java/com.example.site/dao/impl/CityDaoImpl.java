package com.example.site.dao.impl;

import com.example.site.dao.CityDao;
import com.example.site.model.City;
import com.example.site.model.Hotel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

@Repository
public class CityDaoImpl implements CityDao {

    private static final String GET_ALL_CITIES = "SELECT * FROM city";
    private static final String GET_CITY_BY_ID_QUERY = "SELECT * FROM city WHERE id = :id";

    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    @Autowired
    public void setNamedParameterJdbcTemplate(NamedParameterJdbcTemplate namedParameterJdbcTemplate) {
        this.namedParameterJdbcTemplate = namedParameterJdbcTemplate;
    }

    @Override
    public List<City> getAllCities() {
        return namedParameterJdbcTemplate.query(GET_ALL_CITIES, new CityMapper());
    }

    @Override
    public City getCityById(Integer id) {
        MapSqlParameterSource mapSqlParameterSource = new MapSqlParameterSource();
        mapSqlParameterSource.addValue("id", id);
        return namedParameterJdbcTemplate.queryForObject(GET_CITY_BY_ID_QUERY, mapSqlParameterSource, new CityMapper());
    }


    private static final class CityMapper implements RowMapper<City> {
        public City mapRow(ResultSet rs, int rowNum) throws SQLException {
            City city = new City();
            city.setId(rs.getInt("id"));
            city.setName(rs.getString("name"));
            return city;
        }
    }

}
