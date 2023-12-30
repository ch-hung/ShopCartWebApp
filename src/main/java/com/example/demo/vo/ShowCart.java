package com.example.demo.vo;

import lombok.Data;

// NOT IN DATABASE
@Data
public class Showcart {
	private Integer cart_id;
	private Integer member_id;
	private String good_name;
	private Integer good_price;
	private Integer cart_amount;
	private Integer showcart_total;

	public Showcart() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Showcart(Integer cart_id, Integer member_id, String good_name, Integer good_price, Integer cart_amount,
			Integer showcart_total) {
		super();
		this.cart_id = cart_id;
		this.member_id = member_id;
		this.good_name = good_name;
		this.good_price = good_price;
		this.cart_amount = cart_amount;
		this.showcart_total = showcart_total;
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

	public String getGood_name() {
		return good_name;
	}

	public void setGood_name(String good_name) {
		this.good_name = good_name;
	}

	public Integer getGood_price() {
		return good_price;
	}

	public void setGood_price(Integer good_price) {
		this.good_price = good_price;
	}

	public Integer getCart_amount() {
		return cart_amount;
	}

	public void setCart_amount(Integer cart_amount) {
		this.cart_amount = cart_amount;
	}

	public Integer getShowcart_total() {
		return showcart_total;
	}

	public void setShowcart_total(Integer showcart_total) {
		this.showcart_total = showcart_total;
	}
}
