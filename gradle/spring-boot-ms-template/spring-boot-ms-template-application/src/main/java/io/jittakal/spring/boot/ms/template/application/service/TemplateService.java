package io.jittakal.spring.boot.ms.template.application.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.jittakal.spring.boot.ms.template.client.SampleExternalClient;
import io.jittakal.spring.boot.ms.template.client.TemplateStatus;

@Service
public class TemplateService {
		
		@Autowired
		private SampleExternalClient externalClient;
		
		public String getStatus() {
			TemplateStatus status =externalClient.getTemplateHealth();
			return status.getStatus();
		}
		
}
