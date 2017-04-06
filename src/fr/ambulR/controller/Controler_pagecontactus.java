package fr.ambulR.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Controler_pagecontactus {

	
	@RequestMapping("/contact")
	public String pagecontactus(Model model) {
		return "page_contactus";
	}
	
}


