package fr.eni.controllerMmi.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import fr.eni.bo.Cure;
import fr.eni.dal.DaoCure;



@Controller
@RequestMapping("/cures")
//@SessionAttributes({"userSession"})
public class ControllerCure {

	private DaoCure daoCure;

	
	@Autowired
	public ControllerCure(DaoCure daoCure) {
		super();
		this.daoCure = daoCure;
	}
	
	@GetMapping
	public String showAllMovies(Model model) {
		List<Cure> lstCure = daoCure.findAll();
		if (lstCure == null) {
			lstCure = new ArrayList<>();
		}
		model.addAttribute("lstCure", lstCure);
		return "view-cures";
	}
	

//	// Création d'un nouveau film
//		@GetMapping("/create")
//		public String createCure(Model model) {
//			String retour = "redirect:/login";
//			// Test si un membre est connecté
//			Object att = model.getAttribute("userSession");
//			if (att != null) {
//				Cure cure = new Cure();
//				// Ajout de l'instance dans le modèle
//				model.addAttribute("cure", cure);
//				retour = "view-cure-form";
//			}
//			return retour;
//		}
}
