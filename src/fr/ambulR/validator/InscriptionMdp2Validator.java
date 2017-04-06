package fr.ambulR.validator;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import fr.ambulR.model.ConfirmPassword;

@Component
public class InscriptionMdp2Validator implements Validator {

	@Override
	public boolean supports(Class<?> cls) {
		return ConfirmPassword.class.equals(cls);
	}

	@Override
	public void validate(Object arg0, Errors e) {
		ValidationUtils.rejectIfEmptyOrWhitespace(e, "ConfirmPassword.password2", "ConfirmPassword.password2.empty", "Le numéro de sécurité sociale doit être saisi");
		
	}

}
