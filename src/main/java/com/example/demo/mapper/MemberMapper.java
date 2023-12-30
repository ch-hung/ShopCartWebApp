package com.example.demo.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.example.demo.vo.Member;

@Mapper
public interface MemberMapper {
	@Insert("insert into member(member_username, member_password, member_name, member_email) "
			+ "value(#{member_username}, #{member_password}, #{member_name}, #{member_email})")
	void addMember(Member m);
	
	@Select("select * from member where member_username=#{member_username} and member_password=#{member_password}")
	Member queryMember(String member_username, String member_password);
	
	@Select("select * from member where member_username=#{member_username}")
	Member queryUsername(String member_username);
}
