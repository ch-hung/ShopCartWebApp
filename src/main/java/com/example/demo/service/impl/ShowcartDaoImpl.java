package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.mapper.ShowcartMapper;
import com.example.demo.service.ShowcartDao;
import com.example.demo.vo.Showcart;

@Service
public class ShowcartDaoImpl implements ShowcartDao {
	@Autowired
	ShowcartMapper showcartMapper;

	@Override
	public List<Showcart> queryMemberId(Integer member_id) {
		List<Showcart> ss = showcartMapper.queryMemberId(member_id);
		return ss;
	}

}
