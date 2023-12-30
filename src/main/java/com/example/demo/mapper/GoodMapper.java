package com.example.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.example.demo.vo.Good;

@Mapper
public interface GoodMapper {
	@Insert("insert into good(good_name, good_detail, good_price) value(#{good_name}, #{good_detail}, #{good_price}")
	void addGood(Good g);
	
	@Select("select * from good")
	List<Good> queryAll();
	
	@Select("select * from good where good_id=#{good_id}")
	Good queryId(Integer good_id);
}
