package fr.ambulR.controller;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
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
import fr.ambulR.validator.PatientValidator;

@Controller
public class Controller_inscriptionInvalide extends HttpServlet  {

	/*
	@Override
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		SpringBeanAutowiringSupport.processInjectionBasedOnServletContext(this, config.getServletContext()); 
	}
	
	
	
	@Autowired
	private PatientValidator patientValidator;
	
*/
	
	
	@RequestMapping(value = "/validationInscription", method = RequestMethod.POST)
	public String inscription(@Valid @ModelAttribute("patient") ConfirmPassword confirmPassword, BindingResult result,
			Model model) {
		/* patientValidator.validate(confirmPassword, result);
		if (result.hasErrors()) {
			System.out.println("Validation errors:");
			for (ObjectError oe : result.getAllErrors()) {
				System.out.println(oe.getDefaultMessage());
			}
			return "page_inscription";
		}
		System.out.println(confirmPassword.toString()); */
		return "redirect:/page_accueil/" /*+ confirmPassword.getPrenom()*/;
	} 
	
	
	
	
}
