package io.jittakal.spring.boot.ms.template.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class SampleExternalClient {
	
	@Autowired
	private RestTemplate restTemplate;

	private String templateBaseURI = "http://127.0.0.1:8080";

	/**
	 * Sample get method to simulate API calls to self status API based on actuator
	 * @return
	 */
	public TemplateStatus getTemplateHealth() {
		return restTemplate.getForObject(templateBaseURI + "/actuator/health", TemplateStatus.class);
	}
	
}
