package fr.ambulR.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import fr.ambulR.model.Patient;

public class PatientInscriptionValidator implements Validator {

	
	
	@Override
	public boolean supports(Class<?> cls) {
		// avec supports on lui dit quel type d'objet il faut valider
		return Patient.class.equals(cls);
	}
	
		

	@Override public void validate(Object obj, Errors e) {
		ValidationUtils.rejectIfEmptyOrWhitespace(e, "patient.nom", "patient.nom.empty", "Le nom doit être saisi");
		ValidationUtils.rejectIfEmptyOrWhitespace(e, "patient.prenom", "patient.prenom.empty", "Le prénom doit être saisi");
		ValidationUtils.rejectIfEmptyOrWhitespace(e, "patient.age", "patient.age.empty", "L'age doit être saisi");
		ValidationUtils.rejectIfEmptyOrWhitespace(e, "patient.sexe", "patient.sexe.empty", "Le sexe doit être saisi");
		ValidationUtils.rejectIfEmptyOrWhitespace(e, "patient.adresse", "patient.adresse.empty", "L'adresse doit être saisie");
		ValidationUtils.rejectIfEmptyOrWhitespace(e, "patient.tel", "patient.tel.empty", "Le numéro de téléphone doit être saisi");
		ValidationUtils.rejectIfEmptyOrWhitespace(e, "patient.nomU", "patient.nomU.empty", "Le nom du contact d'urgence doit être saisi");
		ValidationUtils.rejectIfEmptyOrWhitespace(e, "patient.prenomU", "patient.prenomU.empty", "Le prénom du contact d'urgence doit être saisi");
		ValidationUtils.rejectIfEmptyOrWhitespace(e, "patient.telU", "patient.telU.empty", "Le numéro de téléphone du contact d'urgence doit être saisi");
		ValidationUtils.rejectIfEmptyOrWhitespace(e, "patient.DMP", "patient.DMP.empty", "Le Dossier Medical Personnel doit être saisi");
		ValidationUtils.rejectIfEmptyOrWhitespace(e, "patient.numSecu", "utilisateur.numSecu.empty", "Le numéro de sécurité sociale doit être saisi");
	
		

		}
	

} 
