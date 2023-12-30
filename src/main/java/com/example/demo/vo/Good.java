package com.example.demo.vo;

import lombok.Data;

@Data
public class Good {
	private Integer good_id;
	private String good_name;
	private String good_detail;
	private Integer good_price;

	public Good() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Good(String good_name, String good_detail, Integer good_price) {
		super();
		this.good_name = good_name;
		this.good_detail = good_detail;
		this.good_price = good_price;
	}

	public Integer getGood_id() {
		return good_id;
	}

	public void setGood_id(Integer good_id) {
		this.good_id = good_id;
	}

	public String getGood_name() {
		return good_name;
	}

	public void setGood_name(String good_name) {
		this.good_name = good_name;
	}

	public String getGood_detail() {
		return good_detail;
	}

	public void setGood_detail(String good_detail) {
		this.good_detail = good_detail;
	}

	public Integer getGood_price() {
		return good_price;
	}

	public void setGood_price(Integer good_price) {
		this.good_price = good_price;
	}
}
