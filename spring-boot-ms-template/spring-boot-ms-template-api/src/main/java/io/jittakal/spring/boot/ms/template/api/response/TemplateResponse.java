package io.jittakal.spring.boot.ms.template.api.response;

import java.io.Serializable;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class TemplateResponse implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6510134671819333233L;

	private String templateFormat;
	
	public TemplateResponse() {
		super();
	}

	public TemplateResponse(String templateFormat) {
		super();
		this.templateFormat = templateFormat;
	}

	public String getTemplateFormat() {
		return templateFormat;
	}

	public void setTemplateFormat(String templateFormat) {
		this.templateFormat = templateFormat;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((templateFormat == null) ? 0 : templateFormat.hashCode());
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
		TemplateResponse other = (TemplateResponse) obj;
		if (templateFormat == null) {
			if (other.templateFormat != null)
				return false;
		} else if (!templateFormat.equals(other.templateFormat))
			return false;
		return true;
	}

}
