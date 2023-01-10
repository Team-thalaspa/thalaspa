package fr.eni.bll;

import java.util.List;

import fr.eni.bo.Cure;
import fr.eni.bo.Type;




public interface ServiceCure {
	
	Cure getCureById(long id);

	List<Cure> findAllCure();

	List<Type> getTypeCure();

	void saveCure(Cure cure);

	

}
