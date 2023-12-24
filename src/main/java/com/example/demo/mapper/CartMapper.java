package com.example.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.example.demo.vo.Cart;

@Mapper
public interface CartMapper {
	@Insert("insert into cart(member_id, good_id, amount) value(#{member_id}, #{good_id}, #{amount}")
	void addCart(Cart c);

	@Select("select * from cart")
	List<Cart> queryAll();

	@Select("select * from cart where member_id=#{member_id}")
	List<Cart> queryMemberId(Integer memberid);

	@Select("select * from cart where good_id=#{good_id}")
	List<Cart> queryGoodId(Integer good_id);

	@Update("update cart set amount=#{amount} where id=#{id}")
	void updateCart(Cart c);

	@Delete("delete from cart where id=#{id}")
	void deleteCart(Integer id);
}
