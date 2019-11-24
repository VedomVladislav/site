package com.example.site.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import javax.sql.DataSource;

@ComponentScan({"com.example.site"})
@Configuration
public class SpringRootConfig {

    private DataSource dataSource;

    @Autowired
    public SpringRootConfig(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Bean
    public NamedParameterJdbcTemplate getNamedParameterJdbcTemplate() {
        return new NamedParameterJdbcTemplate(dataSource);
    }
}

