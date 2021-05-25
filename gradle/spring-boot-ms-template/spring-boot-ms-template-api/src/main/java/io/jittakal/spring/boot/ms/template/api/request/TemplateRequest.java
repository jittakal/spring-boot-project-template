package io.jittakal.spring.boot.ms.template.api.request;

import java.io.Serializable;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.*;

@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class TemplateRequest implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8903966921721015831L;

	private String templateName;

	private String templateLocale;

}
