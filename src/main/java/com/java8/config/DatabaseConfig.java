package com.java8.config;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import javax.xml.crypto.Data;

@Configuration
@Component
public class DatabaseConfig {


    @Autowired
    @Bean
    public DataSource dataSource(DatabaseProperties databaseProperties) {

        HikariConfig hikariConfig = new HikariConfig();
        hikariConfig.setUsername(databaseProperties.getMysql().getUsername());
        hikariConfig.setPassword(databaseProperties.getMysql().getPassword());
        hikariConfig.setJdbcUrl(databaseProperties.getMysql().getUrl());
        hikariConfig.setDriverClassName(databaseProperties.getMysql().getDriver());
        DataSource dataSource = new HikariDataSource(hikariConfig);
        return dataSource;
    }

    @Bean
    @Autowired
    public NamedParameterJdbcTemplate namedParameterJdbcTemplate(DataSource dataSource) {

        return new NamedParameterJdbcTemplate(dataSource);


    }
}
