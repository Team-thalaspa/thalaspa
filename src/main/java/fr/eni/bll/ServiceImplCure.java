package fr.eni.bll;


import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import fr.eni.bo.Cure;
import fr.eni.dal.DaoCure;


@Service
public class ServiceImplCure implements ServiceCure {
	
	private DaoCure daoCure;
	
	

	public ServiceImplCure(DaoCure daoCure) {
		super();
		this.daoCure = daoCure;
	}
	
	@Override
	public List<Cure> getCureAll() {
		
		return daoCure.findAll();
	}
	
	@Override
	public Cure saveCure(Cure cure) {
		return daoCure.save(cure);
	}

	/************************PAs Besion pour l'instant ************************/

	@Override
	public Optional<Cure> getCart(Long id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	

	@Override
	public void deleteCure(Long id) {
		// TODO Auto-generated method stub
		
	}

	
	

}
