package fr.eni.controllerMmi.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;


import fr.eni.bll.ServiceImplCart;
import fr.eni.bo.Cart;


@Controller
@RequestMapping("/cart")
@SessionAttributes({"userSession","cart"})
public class ControllerCart {

	
	private ServiceImplCart serviceImplCart;
	
	
	@Autowired
	public ControllerCart(ServiceImplCart serviceImplCart) {
		super();
		this.serviceImplCart = serviceImplCart;
	}
	// Injection en session le panier 

	@GetMapping
	@ModelAttribute("cart")
	public String  showAllCart(Model model ) {
		
		Iterable<Cart> lstCart = serviceImplCart.getCartAll();
		
	if(lstCart == null ) {
		lstCart = new ArrayList<>();
		System.out.println("panier est vide ");
	}
		model.addAttribute("cures", lstCart);
		
		return "view-cart";
		  
	}


	
	
}
