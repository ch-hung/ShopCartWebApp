package com.example.demo.service;

import java.util.List;

import com.example.demo.vo.Good;

public interface GoodDao {
	// add
	void addGood(Good g);

	// query
	List<Good> queryAll();

	Good queryId(Integer id);

}
