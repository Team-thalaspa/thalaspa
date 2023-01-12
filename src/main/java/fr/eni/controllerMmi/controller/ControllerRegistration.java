package fr.eni.controllerMmi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import fr.eni.bll.ServiceRegistration;
import fr.eni.bo.User;

@Controller
@RequestMapping("/registration")
public class ControllerRegistration {

	private ServiceRegistration serviceRegistration;
	
	@Autowired
	public ControllerRegistration(ServiceRegistration serviceRegistration) {
		this.serviceRegistration= serviceRegistration;
		
	}

	@GetMapping
	public String registration(Model model) {
		User user = new User();
		model.addAttribute("user", user);
		return "view-form-registration";
	}
	
	@PostMapping
	public String registration(@ModelAttribute("user") User user, Model model) {
		
		String retour = "view-cure";
		System.out.println(user);
		serviceRegistration.saveUser(user);
	return retour;
}
	
}
