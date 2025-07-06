package gov.mo.courts.cases.dto;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix="contact")
public record ContactDto (String name){
}
