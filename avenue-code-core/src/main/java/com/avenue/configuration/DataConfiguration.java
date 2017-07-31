package com.avenue.configuration;

import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class DataConfiguration {

    @Bean
    public DataSource dataSource() {
        DataSource build = DataSourceBuilder.create()
                .url("jdbc:hsqldb:mem:avenue")
                .driverClassName("org.hsqldb.jdbc.JDBCDriver")
                .username("test")
                .password("test")
                .build();
        return build;
    }
}
