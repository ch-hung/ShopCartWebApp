package com.example.demo.vo;

import lombok.Data;

@Data
public class Cart {
	private Integer id;
	private Integer member_id;
	private Integer good_id;
	private Integer amount;

	public Cart() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cart(Integer member_id, Integer good_id, Integer amount) {
		super();
		this.member_id = member_id;
		this.good_id = good_id;
		this.amount = amount;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	public Integer getAmount() {
		return amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}

}
