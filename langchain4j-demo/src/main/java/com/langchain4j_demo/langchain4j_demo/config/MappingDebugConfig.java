package com.langchain4j_demo.langchain4j_demo.config;

import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;

@Configuration
public class MappingDebugConfig {

    @Bean
    ApplicationRunner showMappings(
            RequestMappingHandlerMapping mapping) {

        return args -> mapping.getHandlerMethods()
                .forEach((key, value) ->
                        System.out.println(
                                "REGISTERED API: " + key
                        ));
    }
}
