package fr.ambulR.controller;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;

import fr.ambulR.model.ConfirmPassword;
import fr.ambulR.model.Patient;
import fr.ambulR.validator.PatientValidator;

@Controller
public class Controller_inscription extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/*@Override
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		SpringBeanAutowiringSupport.processInjectionBasedOnServletContext(this, config.getServletContext());  // methode
																												// init
																												// appelée
																												// à
																												// l'instanciation
		// on lui dit de injecter dans l'objet courant .this tous les Autowired
	} */
	
	@RequestMapping("/inscription")
	public String inscriptionUser (Model model) {
	model.addAttribute("utilisateur", new Patient()); //modelAttribute="patient" dans le jsp inscription
	return "page_inscription";
	} 


	/*
	@Autowired
	private PatientValidator patientValidator;

	// ça va m'envoyer à la page jsp inscription
	@RequestMapping(value = "/inscription", method = RequestMethod.GET)
		public String inscription(Model model) {
		return "page_inscription";
	}

	
	@RequestMapping(value = "/inscription", method = RequestMethod.POST)
	public String inscription(@Valid @ModelAttribute("patient") ConfirmPassword confirmPassword, BindingResult result,
			Model model) {
		patientValidator.validate(confirmPassword, result);
		if (result.hasErrors()) {
			System.out.println("Validation errors:");
			for (ObjectError oe : result.getAllErrors()) {
				System.out.println(oe.getDefaultMessage());
			}
			return "page_inscription";
		}
		System.out.println(confirmPassword.toString());
		return "redirect:/page_accueil/" + confirmPassword.getPrenom();
	} */

} 
