package net.javaguides.organizationservice;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@OpenAPIDefinition(
		info = @Info(
				title = "Organization Service REST API",
				description = "Organization  REST APIs Documentation",
				version = "v1.0",
				contact = @Contact(
						name = "vynnd",
						email = "vynnd@gmail.com"
				),
				license = @License(
						name = "Apache2.0",
						url = "http://google.com"
				)
		),
		externalDocs = @ExternalDocumentation(
				description = "Organization-Service doc",
				url = "http://google.com"
		)
)
@SpringBootApplication
public class OrganizationServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrganizationServiceApplication.class, args);
	}

}
