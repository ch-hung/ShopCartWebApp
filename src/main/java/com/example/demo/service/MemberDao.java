package com.example.demo.service;

import com.example.demo.vo.Member;

public interface MemberDao {
	// add
	void addMember(Member m);

	//	query
	Member queryMember(String username, String password);

	Member queryUsername(String username);

}