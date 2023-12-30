package com.example.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.example.demo.vo.Showcart;

@Mapper
public interface ShowcartMapper {

	@Select("select * from showcart where member_id=#{member_id} order by good_name")
	List<Showcart> queryMemberId(Integer member_id);
}
