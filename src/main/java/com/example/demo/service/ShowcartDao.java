package com.example.demo.service;

import java.util.List;

import com.example.demo.vo.Showcart;

public interface ShowcartDao {
	// query
	List<Showcart> queryMemberId(Integer member_id);
}
