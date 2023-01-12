package fr.eni.bll;


import java.util.Optional;



import fr.eni.bo.Cart;


public interface ServiceCart {

	
	public Optional<Cart> getCart(final Long id) ;
	
	public Iterable<Cart> getCartAll() ;
	
	public void deleteCart(final Long id) ;
	
	public Cart saveCart(Cart cart);
}
