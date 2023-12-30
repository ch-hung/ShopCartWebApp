package com.example.demo.vo;

import lombok.Data;

@Data
public class Cart {
	private Integer cart_id;
	private Integer member_id;
	private Integer good_id;
	private Integer cart_amount;

	public Cart() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cart(Integer member_id, Integer good_id, Integer cart_amount) {
		super();
		this.member_id = member_id;
		this.good_id = good_id;
		this.cart_amount = cart_amount;
	}

	public Integer getCart_id() {
		return cart_id;
	}

	public void setCart_id(Integer cart_id) {
		this.cart_id = cart_id;
	}

	public Integer getMember_id() {
		return member_id;
	}

	public void setMember_id(Integer member_id) {
		this.member_id = member_id;
	}

	public Integer getGood_id() {
		return good_id;
	}

	public void setGood_id(Integer good_id) {
		this.good_id = good_id;
	}

	public Integer getCart_amount() {
		return cart_amount;
	}

	public void setCart_amount(Integer cart_amount) {
		this.cart_amount = cart_amount;
	}
}
