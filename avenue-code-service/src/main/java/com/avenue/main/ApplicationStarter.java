package com.avenue.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@Configuration
@EntityScan({"com.avenue.entity"})
@ComponentScan({"com.avenue"})
@EnableJpaRepositories("com.avenue.repository")
public class ApplicationStarter {

    public static void main(final String[] args) throws Exception {
        SpringApplication.run(ApplicationStarter.class, args);
    }

}