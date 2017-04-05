package fr.ambulR.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class Controller_pageurgenceindex {

	@RequestMapping(value = "/pageurgenceindex", method = RequestMethod.POST)
	public String subscribe(@Valid @ModelAttribute("user") Utilisateur utilisateur, BindingResult result, Model model) {
	if (result.hasErrors()) {
	System.out.println("L'utilisateur n'a pas été validé ...");
	return "subscribe";
	}
	System.out.println("Prénom : " + utilisateur.getPrenom() + " Nom : " + utilisateur.getNom());
	return "home";
	}}