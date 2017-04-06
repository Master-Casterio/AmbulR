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
		ValidationUtils.rejectIfEmptyOrWhitespace(e, "patient.nom", "patient.nom.empty", "Le nom doit �tre saisi");
		ValidationUtils.rejectIfEmptyOrWhitespace(e, "patient.prenom", "patient.prenom.empty", "Le pr�nom doit �tre saisi");
		ValidationUtils.rejectIfEmptyOrWhitespace(e, "patient.age", "patient.age.empty", "L'age doit �tre saisi");
		ValidationUtils.rejectIfEmptyOrWhitespace(e, "patient.sexe", "patient.sexe.empty", "Le sexe doit �tre saisi");
		ValidationUtils.rejectIfEmptyOrWhitespace(e, "patient.adresse", "patient.adresse.empty", "L'adresse doit �tre saisie");
		ValidationUtils.rejectIfEmptyOrWhitespace(e, "patient.tel", "patient.tel.empty", "Le num�ro de t�l�phone doit �tre saisi");
		ValidationUtils.rejectIfEmptyOrWhitespace(e, "patient.nomU", "patient.nomU.empty", "Le nom du contact d'urgence doit �tre saisi");
		ValidationUtils.rejectIfEmptyOrWhitespace(e, "patient.prenomU", "patient.prenomU.empty", "Le pr�nom du contact d'urgence doit �tre saisi");
		ValidationUtils.rejectIfEmptyOrWhitespace(e, "patient.telU", "patient.telU.empty", "Le num�ro de t�l�phone du contact d'urgence doit �tre saisi");
		ValidationUtils.rejectIfEmptyOrWhitespace(e, "patient.DMP", "patient.DMP.empty", "Le Dossier Medical Personnel doit �tre saisi");
		ValidationUtils.rejectIfEmptyOrWhitespace(e, "patient.numSecu", "utilisateur.numSecu.empty", "Le num�ro de s�curit� sociale doit �tre saisi");
	
		

		}
	

} 
