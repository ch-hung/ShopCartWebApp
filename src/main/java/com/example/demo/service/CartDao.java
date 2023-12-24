package com.example.demo.service;

import java.util.List;

import com.example.demo.vo.Cart;

public interface CartDao {
	// add
	void addCart(Cart c);
	
	// query
	Cart queryCart(Integer id);
	List<Cart> queryAll();
	List<Cart> queryMemberId(Integer member_id);
	List<Cart> queryGoodId(Integer good_id);
	
	// update
	void updateCart(Cart c);	
	
	// delete
	void deleteCart(Integer id);
}
