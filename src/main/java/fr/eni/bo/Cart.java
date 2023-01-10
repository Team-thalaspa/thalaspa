package fr.eni.bo;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "table_cart")
public class Cart {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long cartId;
	private double total;
	@ManyToMany
	private List<Cure> lstCure;
	
	public Cart() {
		super();
	}

	public Cart(double total, List<Cure> lstCure) {
		super();
		this.total = total;
		this.lstCure = lstCure;
	}

	public Cart(long cartId, double total, List<Cure> lstCure) {
		super();
		this.cartId = cartId;
		this.total = total;
		this.lstCure = lstCure;
	}

	public long getCartId() {
		return cartId;
	}

	public void setCartId(long cartId) {
		this.cartId = cartId;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public List<Cure> getLstCure() {
		return lstCure;
	}

	public void setLstCure(List<Cure> lstCure) {
		this.lstCure = lstCure;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Cart [cartId=");
		builder.append(cartId);
		builder.append(", total=");
		builder.append(total);
		builder.append("]");
		return builder.toString();
	}
	
	
	
	
	
	
	
	
}
