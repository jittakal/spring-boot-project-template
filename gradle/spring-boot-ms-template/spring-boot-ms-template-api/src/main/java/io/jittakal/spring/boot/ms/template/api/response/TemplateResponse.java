package io.jittakal.spring.boot.ms.template.api.response;

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
public class TemplateResponse implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6510134671819333233L;

	private String templateFormat;

}
