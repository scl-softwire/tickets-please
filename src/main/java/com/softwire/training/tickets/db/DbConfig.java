package com.softwire.training.tickets.db;

import org.jdbi.v3.core.Jdbi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DbConfig {

    private String dbUrl;

    @Autowired
    public DbConfig(@Value("${spring.datasource.url}") String dbUrl) {
        this.dbUrl = dbUrl;
    }

    @Bean
    public Jdbi jdbi() {
        return Jdbi.create(dbUrl);
    }

}
