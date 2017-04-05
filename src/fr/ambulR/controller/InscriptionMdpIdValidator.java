package fr.ambulR.controller;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

public class InscriptionMdpIdValidator implements Validator {

	@Override
	public boolean supports(Class<?> arg0) {
		// la classe Connexion créé par Emmmanuel 
		return Connexion.class.equals(cls);
	}

	@Override
	public void validate(Object arg0, Errors e) {
		ValidationUtils.rejectIfEmptyOrWhitespace(e, "Connexion.identifiant", "Connexion.identifiant.empty", "Le numéro de sécurité sociale doit être saisi");

		
	}

}
