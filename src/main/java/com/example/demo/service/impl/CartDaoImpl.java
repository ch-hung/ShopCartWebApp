package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.mapper.CartMapper;
import com.example.demo.service.CartDao;
import com.example.demo.vo.Cart;

@Service
public class CartDaoImpl implements CartDao {
	@Autowired
	CartMapper cartMapper;

	@Override
	public void addCart(Cart c) {
		cartMapper.addCart(c);
		return;
	}

	@Override
	public List<Cart> queryAll() {
		List<Cart> cs = cartMapper.queryAll();
		return cs;
	}

	@Override
	public List<Cart> queryMemberId(Integer member_id) {
		List<Cart> cs = cartMapper.queryMemberId(member_id);
		return cs;
	}

	@Override
	public List<Cart> queryGoodId(Integer good_id) {
		List<Cart> cs = cartMapper.queryGoodId(good_id);
		return cs;
	}

	@Override
	public void updateCart(Cart c) {
		cartMapper.updateCart(c);
		return;
	}

	@Override
	public void deleteCart(Integer id) {
		cartMapper.deleteCart(id);
		return;
	}
}
