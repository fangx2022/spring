package com.lll.feng.config;

import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI springOpenAPI(){
        return new OpenAPI()
                .info(new Info().title("SpringBoot API")
                        .description("SpringBoot API演示")
                        .version("v1.0.0")
                        .license(new License().name("MIT 3.0").url("http://springdoc.org"))
                        ).externalDocs(new ExternalDocumentation()
                        .description("相关文档")
                        .url("http://127.0.0.1:8888/swagger-ui/index.html"));
    }
}
