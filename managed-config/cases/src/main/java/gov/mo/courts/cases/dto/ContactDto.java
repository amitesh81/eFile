package gov.mo.courts.cases.dto;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.List;
import java.util.Map;
@ConfigurationProperties(prefix = "contact")
public record ContactDto(String name, Map<String,String> email, List<String> phone) {
}
