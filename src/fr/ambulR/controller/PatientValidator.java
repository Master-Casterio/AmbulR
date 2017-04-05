package fr.ambulR.controller;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import fr.ambulR.model.ConfirmPassword;
import fr.ambulR.model.Patient;

public class PatientValidator implements Validator {

	@Override
	public boolean supports(Class<?> arg0) {
		return arg0.equals(ConfirmPassword.class);

	}
	

	@Override
	public void validate(Object arg0, Errors arg1) {
		ConfirmPassword confirmPassword = (ConfirmPassword) arg0;
		Patient patient = new Patient();

		ValidationUtils.rejectIfEmpty(arg1, "confirmPassword", "password2");
		if (!confirmPassword.getPassword2().equals(patient.getPassword())) {
			arg1.reject("password2", "mot de pass invalid");
		}

	}

}
