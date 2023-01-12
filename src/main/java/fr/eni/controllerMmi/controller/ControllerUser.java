package fr.eni.controllerMmi.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;


import fr.eni.bll.ServiceUser;
import fr.eni.bo.User;

@Controller
@RequestMapping("/user")
@SessionAttributes({"userSession","cart"})
public class ControllerUser {
	

private ServiceUser serviceUser;

@Autowired
public ControllerUser(ServiceUser serviceUser) {
	super();
	this.serviceUser = serviceUser;
}

@GetMapping
public String  showAllUser(Model model ) {
	
	List<User> lstUser = serviceUser.getUserAll();
	
	
if(lstUser == null ) {
	lstUser = new ArrayList<>();
	System.out.println("panier est vide ");
}
	model.addAttribute("users", lstUser);
	
	return "view-user";
	  
}

}
