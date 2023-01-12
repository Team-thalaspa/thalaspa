package fr.eni.controllerMmi.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import fr.eni.bll.ServiceCure;

import fr.eni.bll.exception.BusinessException;
import fr.eni.bo.Cure;


@Controller
@RequestMapping("/cures")
@SessionAttributes({ "userSession" })

public class ControllerCure {

	private ServiceCure serviceCure;
	

	@Autowired
	public ControllerCure(ServiceCure serviceCure) {
		super();
		this.serviceCure = serviceCure;
		
	}


	@GetMapping 

	public String showAllCures(Model model) {
		Iterable<Cure> lstCure = serviceCure.getCureAll();
		if (lstCure == null) {
			lstCure = new ArrayList<>();
		}
		model.addAttribute("cures", lstCure);
		return "view-cure";
	}

	// Création d'un nouveau soin
	@GetMapping("/saveCure")
	public String createCure(Model model) {
		String retour = "redirect:/login";
		// Test si un unser est connecté
		Object att = model.getAttribute("userSession");
		// if (att != null) {
		Cure cure = new Cure();
		// Ajout de l'instance dans le modèle
		model.addAttribute("cure", cure);
		retour = "view-add-cure";
		// }
		return retour;

		// return "view-form-cure";
	}

	@PostMapping("/saveCure")
	public String createCure(@Valid @ModelAttribute("cure") Cure cure, BindingResult bindingResult, Model model) {

		// Test si un user est connecté
//		String retour = "redirect:/login";
//		Object attribute = model.getAttribute("userSession");
//		if (attribute != null) {
//			if (bindingResult.hasErrors()) {
//				return "redirect:/login";
//			} else {
//				System.out.println(cure);
//				try {
//					serviceCure.saveCure(cure);
//					retour = "redirect:/cures";
//				} catch (BusinessException e) {
//					System.err.println(e.getErrors());
//					model.addAttribute("cure", cure);
//					model.addAttribute("errors", e.getErrors());
//					retour = "view-form-cure";
//				}
//
//			}
//
//		}
//		return retour;
		//String retour = "redirect:/view-form-cure";
		//try {
			serviceCure.saveCure(cure);
			//retour = "redirect:/cures";
		//} catch (Exception e) {
			//System.err.println(e.getStackTrace());
			//retour = "view-form-cure";
		//}
		
		
		return "view-add-cure";
	}

	
}
