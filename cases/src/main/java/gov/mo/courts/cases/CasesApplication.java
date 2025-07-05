package gov.mo.courts.cases;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(
		info = @io.swagger.v3.oas.annotations.info.Info(
				title = "Cases API",
				version = "1.0",
				description = "API for managing court cases",
				contact = @Contact(name = "Amitesh Jha", email = "jha.amitesh@gmail.com")
		))

public class CasesApplication {

	public static void main(String[] args) {
		SpringApplication.run(CasesApplication.class, args);
	}

}
