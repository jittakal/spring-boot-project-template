package io.jittakal.spring.boot.ms.template.application.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import io.jittakal.spring.boot.ms.template.api.request.TemplateRequest;
import io.jittakal.spring.boot.ms.template.api.response.TemplateResponse;
import io.jittakal.spring.boot.ms.template.application.service.TemplateService;

@RestController
public class TemplateController {
	
	@Autowired
	private TemplateService templateService;

	@RequestMapping(path = "/v1/hello", method = RequestMethod.GET)
	public String templateHello() {
		return "Greetings from Micro-serivce Template based on Spring Boot!";
	}

	@ResponseBody
	@PostMapping(path = "/v1/template", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public TemplateResponse templateFormat(@RequestBody TemplateRequest request) {
		TemplateResponse templateResponse = new TemplateResponse();
		if (null != request.getTemplateName()) {
			templateResponse.setTemplateFormat(String.format("Template Name is %s, and Locale to be used is %s",
					request.getTemplateName(), request.getTemplateLocale()));
		} else {
			templateResponse.setTemplateFormat("Default template format to be used!");
		}
		return templateResponse;
	}
	
	@RequestMapping(path = "/v1/status", method = RequestMethod.GET)
	public String templateStatus() {
		return templateService.getStatus();
	}

}
