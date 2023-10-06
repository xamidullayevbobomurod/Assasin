package com.xa.warehouse.config;


import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.security.SecurityRequirement;
import io.swagger.v3.oas.models.security.SecurityScheme;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
@RequiredArgsConstructor
@ConditionalOnProperty(name = "springdoc.swagger-ui.enabled", havingValue = "true", matchIfMissing = true)

public class OpenApiConfigurer {


    private static final String SCHEMA = "Bearer";
    private static final String BEARER_FORMAT = "JWT";
    private static final String SECURITY_SCHEMA_NAME = "Project security schema";

    @Bean
    public OpenAPI api() {
        return new OpenAPI().schemaRequirement(SECURITY_SCHEMA_NAME, getSecurityScheme()).security( getSecurityRequirements() );
    }

    private SecurityScheme getSecurityScheme() {
        SecurityScheme scheme = new SecurityScheme();
        scheme.bearerFormat(BEARER_FORMAT);
        scheme.type(SecurityScheme.Type.HTTP);
        scheme.in(SecurityScheme.In.HEADER);
        scheme.scheme(SCHEMA);
        return scheme;
    }

    private List<SecurityRequirement> getSecurityRequirements() {

        SecurityRequirement requirement = new SecurityRequirement();
        requirement.addList(SECURITY_SCHEMA_NAME);
        return List.of(requirement);

    }





}



