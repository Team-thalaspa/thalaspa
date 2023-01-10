package fr.eni.controllerMmi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import fr.eni.bll.ServiceConnection;

@Controller
@SessionAttributes({"userSession"})
public class ControllerConnection {

	private ServiceConnection serviceConnection;
	
	public ControllerConnection() {
		this.serviceConnection = serviceConnection;
	}
	
	@GetMapping("/login")
	public String login() {
		return "view-login";
	}
	
	@PostMapping("/login")
	public String login(@RequestParam(required=true)String firstName, String lastName, String email, String telephone, ) {
		
	}
	
	
	
	
	
}
