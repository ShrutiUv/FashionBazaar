package com.ecomm.Model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table
public class Cart 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cartId;
	
	@OneToOne(cascade=CascadeType.PERSIST)
	@JoinColumn(name="userName")
	private UserDetails user;

	@OneToOne(cascade=CascadeType.PERSIST)
	@JoinColumn(name="productId")
	private Product product;

	
	@Override
	public String toString() {
		return "Cart [cartId=" + cartId + ", user=" + user + ", product=" + product + "]";
	}

	public int getCartId() {
		return cartId;
	}

	public void setCartId(int cartId) {
		this.cartId = cartId;
	}

	public UserDetails getUser() {
		return user;
	}

	public void setUser(UserDetails user) {
		this.user = user;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	
	
	
}



