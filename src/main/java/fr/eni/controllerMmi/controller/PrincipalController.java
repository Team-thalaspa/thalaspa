package fr.eni.controllerMmi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes({ "userSession" })
public class PrincipalController {
	
	@GetMapping("/")
	public String accueil() {
		return "home";
	}

}
