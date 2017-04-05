package fr.ambulR.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
public class Controller_commercial {


	@RequestMapping("/offres")
	public String Controller_commercial(Model model) {
		//System.out.print("entrer dans le controller");
		return "page_commercial"; 
	}
	
	
}
