package jp.co.internous.ecsite.model.form;

import java.io.Serializable;
import java.util.List;

import templates.Cart;

public class CartForm implements Serializable{
	
	private int userId;
	
	private List<Cart> cartList;
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	
	public List<Cart> getCartList(){
		return cartList;
	}
	public void setCartList(List<Cart> cartList) {
		this.cartList = cartList;
	}
}
