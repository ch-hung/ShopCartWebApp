package com.example.demo.vo;

import lombok.Data;

@Data
public class Member {

	private Integer member_id;
	private String member_username;
	private String member_password;
	private String member_name;
	private String member_email;

	public Member() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Member(String member_username, String member_password, String member_name, String member_email) {
		super();
		this.member_username = member_username;
		this.member_password = member_password;
		this.member_name = member_name;
		this.member_email = member_email;
	}

	public Integer getMember_id() {
		return member_id;
	}

	public void setMember_id(Integer member_id) {
		this.member_id = member_id;
	}

	public String getMember_username() {
		return member_username;
	}

	public void setMember_username(String member_username) {
		this.member_username = member_username;
	}

	public String getMember_password() {
		return member_password;
	}

	public void setMember_password(String member_password) {
		this.member_password = member_password;
	}

	public String getMember_name() {
		return member_name;
	}

	public void setMember_name(String member_name) {
		this.member_name = member_name;
	}

	public String getMember_email() {
		return member_email;
	}

	public void setMember_email(String member_email) {
		this.member_email = member_email;
	}
}
