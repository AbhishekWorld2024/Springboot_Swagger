package com.example.Springboot_Swagger;


import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.OpenAPI;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

    @Configuration

    public class ConfigurationMemebr {

        @Bean
        public OpenAPI customOpenAPI() {
            return new OpenAPI()
                    .info(new Info()
                            .title("Member API")
                            .version("1.0")
                            .description("This is a  Spring Boot REST API with Swagger documentation.")
                            .contact(new Contact()
                                    .name("Abhishek")
                                    .email("abhishek.arugonda223@.com")
                                    .url("https://your-site.com")
                            )
                    );
        }
    }
