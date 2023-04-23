package com.example.jpapractice.configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {

    @Bean
    public OpenAPI studentOpenAPI() {
        return  new OpenAPI()
                .info(new Info().title("Student")
                        .description("Student-crud")
                        .version("1.0"));
    }
}