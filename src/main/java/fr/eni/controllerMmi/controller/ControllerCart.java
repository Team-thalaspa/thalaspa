package fr.eni.controllerMmi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import fr.eni.bll.ServiceImplCart;
import fr.eni.bo.Cart;


@Controller
@RequestMapping("/cart")
public class ControllerCart {

	
	private ServiceImplCart serviceImplCart;
	
	
	@Autowired
	public ControllerCart(ServiceImplCart serviceImplCart) {
		super();
		this.serviceImplCart = serviceImplCart;
	}



	
	public List<Cart>  showAllCure() {
		
		
		return   serviceImplCart.findAll();
	}


	
	
}
