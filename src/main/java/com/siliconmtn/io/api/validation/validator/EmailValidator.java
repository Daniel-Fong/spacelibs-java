package com.siliconmtn.io.api.validation.validator;

// JDK 11.x
import java.util.List;
import java.util.regex.Pattern;

// Spacelibs
import com.siliconmtn.data.text.StringUtil;
import com.siliconmtn.io.api.validation.ValidationErrorDTO;
import com.siliconmtn.io.api.validation.ValidationErrorDTO.ValidationError;

// Lombok 1.18.x
import lombok.NoArgsConstructor;

/****************************************************************************
 * <b>Title</b>: EmailValidator.java
 * <b>Project</b>: spacelibs-java
 * <b>Description: </b> Validator that handles validation of String parameters.
 * <b>Copyright:</b> Copyright (c) 2021
 * <b>Company:</b> Silicon Mountain Technologies
 * 
 * @author Eric Damschroder
 * @version 3.0
 * @since Mar 9, 2021
 * @updates:
 ****************************************************************************/

@NoArgsConstructor
public class EmailValidator extends StringValidator {
	
	public static String EMAIL_REGEX = "^[A-Za-z0-9+_.-]+@(.+)$";
	


	/**
	 * If a regex has not been provided use the default EMAIL_REGEX and then treat as a normal string
	 */
	@Override
	public void validateRegex(ValidationDTO validation, List<ValidationErrorDTO> errors) {
		if (validation.getRegex() == null) {
			validation.setRegex(EMAIL_REGEX);
		}
		super.validateRegex(validation, errors);
	}

}
