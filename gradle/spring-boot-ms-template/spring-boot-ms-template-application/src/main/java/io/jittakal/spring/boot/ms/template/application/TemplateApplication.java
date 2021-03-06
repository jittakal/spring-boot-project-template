package io.jittakal.spring.boot.ms.template.application;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class TemplateApplication {

	private static final Logger LOGGER = LoggerFactory.getLogger(TemplateApplication.class);

	public static void main(String[] args) {
		LOGGER.info("Simple log statement with inputs {}, {} and {}", 1, 2, 3);
		SpringApplication.run(TemplateApplication.class, args);
	}

}
