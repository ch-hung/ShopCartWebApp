package com.example.demo.vo;

import lombok.Data;

// NOT IN DATABASE
@Data
public class ShowCart {
	private Integer cart_id;
	private String name;
	private Integer amount;
	private Integer price;
	private Integer total;

	public ShowCart() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ShowCart(Integer cart_id, String name, Integer amount, Integer price, Integer total) {
		super();
		this.cart_id = cart_id;
		this.name = name;
		this.amount = amount;
		this.price = price;
		total = amount * price;
	}

	public Integer getCart_id() {
		return cart_id;
	}

	public void setCart_id(Integer cart_id) {
		this.cart_id = cart_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAmount() {
		return amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public Integer getTotal() {
		total = amount * price;
		return total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

}
