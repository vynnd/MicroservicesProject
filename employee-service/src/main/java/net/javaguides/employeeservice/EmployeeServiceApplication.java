package net.javaguides.employeeservice;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

@OpenAPIDefinition(
		info = @Info(
				title = "Employee Service REST API",
				description = "Employee  REST APIs Documentation",
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
				description = "Employee-Service doc",
				url = "http://google.com"
		)
)
@SpringBootApplication
@EnableFeignClients
public class EmployeeServiceApplication {

	// Microservices communication using restTeamplate
//	@Bean
//	public RestTemplate restTemplate(){
//		return new RestTemplate();
//	}

	// Microservices communication using restTeamplate
	@Bean
	public WebClient webClient(){
		return WebClient.builder().build();
	}

	public static void main(String[] args) {
		SpringApplication.run(EmployeeServiceApplication.class, args);
	}

}
