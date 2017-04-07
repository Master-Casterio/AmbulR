package fr.ambulR.rendu;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import fr.ambulR.model.Connexion;

public class Rendu {

	public static void pagePrincipale(RequestMapping mapping, HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		/*
		 * RequestDispatcher dispatcher =
		 * context.getRequestDispatcher("/WEB-INF/views/structure.jsp");
		 * dispatcher.forward(req, resp);
		 */
	}

	public static String home() {
		/*model.addAttribute("user", new Connexion());*/
		System.out.println("je suis la fonction home");
		return "page_accueil";

	}
}