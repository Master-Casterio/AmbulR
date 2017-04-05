package fr.ambulR.controller;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;

import fr.ambulR.model.ConfirmPassword;

@Controller
@RequestMapping("/inscription")
public class InscriptionController {
	
	 @Override
     public void init(ServletConfig config) throws ServletException {
	   super.init(config);
	   SpringBeanAutowiringSupport.processInjectionBasedOnServletContext(this, config.getServletContext()); //methode init appelée à l'instanciation
	   //on lui dit de injecter dans l'objet courant .this tous les Autowired
	 }
	
	
	@Autowired
	private PatientValidator patientValidator;
		
	
	// ça va m'envoyer à la page jsp inscription
	@RequestMapping(value = "/inscription", method = RequestMethod.GET)
	public String inscription(Model model){
		return "inscription";
	}
	
	
	@RequestMapping(value = "/inscription", method = RequestMethod.POST)
	public String inscription(@Valid @ModelAttribute("patient") ConfirmPassword confirmPassword, BindingResult result, Model model) {
		patientValidator.validate(confirmPassword, result);
		if ( result.hasErrors() ) {
			System.out.println("Validation errors:");
			for ( ObjectError oe : result.getAllErrors() ) {
				System.out.println(oe.getDefaultMessage());
			}
			return "inscription";
		}
		System.out.println(confirmPassword.toString());
		return "redirect:/accueil/" + confirmPassword.getPrenom();
	} 
	

}
