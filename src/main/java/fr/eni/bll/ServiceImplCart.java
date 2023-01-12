package fr.eni.bll;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.eni.bo.Cart;
import fr.eni.dal.DaoCart;


@Service
public class ServiceImplCart implements ServiceCart {


	private DaoCart daoCart ;

	
	@Autowired
	public ServiceImplCart(DaoCart daoCart) {
		super();
		this.daoCart = daoCart;
	}
	
	@Override
	public void deleteCart(Long id) {
		daoCart.deleteById(id);
		
	}

	
	/************************PAs Besion pour l'instant ************************/
	@Override
	public Cart saveCart(Cart employee) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

	@Override
	public Optional<Cart> getCart(Long id) {
		// TODO Auto-generated method stub
		return daoCart.findById(id);
	}

	@Override
	public Iterable<Cart> getCartAll() {
		// TODO Auto-generated method stub
		return null;
	}

	

	

	
}
