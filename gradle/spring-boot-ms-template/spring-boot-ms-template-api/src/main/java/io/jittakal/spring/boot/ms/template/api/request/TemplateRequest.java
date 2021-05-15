package io.jittakal.spring.boot.ms.template.api.request;

import java.io.Serializable;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class TemplateRequest implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8903966921721015831L;

	private String templateName;

	private String templateLocale;

	public TemplateRequest() {
		super();
	}

	public TemplateRequest(String templateName, String templateLocale) {
		super();
		this.templateName = templateName;
		this.templateLocale = templateLocale;
	}

	public String getTemplateName() {
		return templateName;
	}

	public void setTemplateName(String templateName) {
		this.templateName = templateName;
	}

	public String getTemplateLocale() {
		return templateLocale;
	}

	public void setTemplateLocale(String templateLocale) {
		this.templateLocale = templateLocale;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((templateLocale == null) ? 0 : templateLocale.hashCode());
		result = prime * result + ((templateName == null) ? 0 : templateName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TemplateRequest other = (TemplateRequest) obj;
		if (templateLocale == null) {
			if (other.templateLocale != null)
				return false;
		} else if (!templateLocale.equals(other.templateLocale))
			return false;
		if (templateName == null) {
			if (other.templateName != null)
				return false;
		} else if (!templateName.equals(other.templateName))
			return false;
		return true;
	}

}
