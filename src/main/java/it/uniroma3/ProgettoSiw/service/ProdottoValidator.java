package it.uniroma3.ProgettoSiw.service;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;


@Component
public class ProdottoValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		return Admin.class.equals(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "categoria", "required");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "idFornitore", "required");

	}

}
