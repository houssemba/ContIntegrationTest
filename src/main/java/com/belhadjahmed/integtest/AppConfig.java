package com.belhadjahmed.integtest;

import com.belhadjahmed.integtest.config.DispatcherConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * Created by houssem on 07/06/14.
 */
@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.belhadjahmed.integtest")
@Import({WebInitializer.class, DispatcherConfig.class})
@EnableAutoConfiguration
public class AppConfig {
    public static void main(String[] args) {
        SpringApplication.run(AppConfig.class, args);
    }
}
