package fr.eni.controllerMmi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import fr.eni.bll.ServiceConnection;
import fr.eni.bo.User;


@Controller
@SessionAttributes({"userSession"})
public class ControllerConnection {

	private ServiceConnection serviceConnection;
	
	@Autowired
	public ControllerConnection() {
		this.serviceConnection = serviceConnection;
	}
	
	@GetMapping("/login")
	public String login() {
		return "view-login";
	}
	

	@PostMapping("/login")
	public String login(@RequestParam(required = true) String email, @RequestParam(required = true) String password,
			Model model) {
		String retour = "view-login";
		User user = serviceConnection.login(email, password);
		if (user != null) {
			model.addAttribute("userSession", user);
			retour = "redirect:/cures";//appel du contrôleur ControllerCure
		} 
		
		return retour;
	}

	@GetMapping("/logout")
	public String invalidateSession(SessionStatus status) {
		status.setComplete();
		// redirection
		return "redirect:/";
	}
	
	
	
	
}
