package com.avenue.test.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("/config.properties")
public class IntegrationConfiguration {

}
