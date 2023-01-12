package fr.eni.bll;


import java.util.List;
import java.util.Optional;


import fr.eni.bo.Cure;





public interface ServiceCure {
	
public Optional<Cure> getCart(final Long id) ;
	
	public List<Cure> getCureAll() ;
	
	public void deleteCure(final Long id) ;
	
	public Cure saveCure(Cure cure);

	

}
