package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.mapper.GoodMapper;
import com.example.demo.service.GoodDao;
import com.example.demo.vo.Good;

@Service
public class GoodDaoImpl implements GoodDao {
	@Autowired
	GoodMapper goodMapper;

	@Override
	public void addGood(Good g) {
		goodMapper.addGood(g);
		return;
	}

	@Override
	public List<Good> queryAll() {
		List<Good> gs = goodMapper.queryAll();
		return gs;
	}

	@Override
	public Good queryId(Integer id) {
		Good g = goodMapper.queryId(id);
		return g;
	}

}
