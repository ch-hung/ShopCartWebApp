package com.example.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.example.demo.vo.Good;

@Mapper
public interface GoodMapper {
	@Insert("insert into good(name. detail, price) value(#{name}, #{detail}, #{price}")
	void addGood(Good g);
	
	@Select("select * from good")
	List<Good> queryAll();
	
	@Select("select * from good where id=#{id}")
	Good queryId(Integer id);
}
