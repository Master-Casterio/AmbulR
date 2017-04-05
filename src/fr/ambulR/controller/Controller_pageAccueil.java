package fr.ambulR.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Controller_pageAccueil {

	@RequestMapping("/pageacceuil")
	public String home(Model model) {
	
	return "pageacceuil";
	}
	}

