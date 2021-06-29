package com.abhi.WebCrawlerApp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

import java.util.Collections;


@Configuration
public class SwaggerConfig {

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2).select()
                .apis(RequestHandlerSelectors.basePackage("com.abhi.WebCrawlerApp")).paths(PathSelectors.any())
                .build().apiInfo(apiDetails());

    }

    private ApiInfo apiDetails() {

        return new ApiInfo("WebCrawler API", "API documentation", "1.0", "Free to use",
                new springfox.documentation.service.Contact("ABHISHEK", "https://github.com/abhimana06", "chandraabhishek93@gmail.com"),
                "","", Collections.emptyList());
    }

}