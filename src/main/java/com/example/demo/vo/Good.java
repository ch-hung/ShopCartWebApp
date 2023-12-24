package com.example.demo.vo;

import lombok.Data;

@Data
public class Good {
	private Integer id;
	private String name;
	private String detail;
	private Integer price;

	public Good() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Good(String name, String detail, Integer price) {
		super();
		this.name = name;
		this.detail = detail;
		this.price = price;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}
}
