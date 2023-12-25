package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.service.impl.CartDaoImpl;
import com.example.demo.service.impl.GoodDaoImpl;
import com.example.demo.service.impl.MemberDaoImpl;
import com.example.demo.vo.Cart;
import com.example.demo.vo.Good;
import com.example.demo.vo.Member;

import jakarta.servlet.http.HttpSession;

@RestController
public class CartController {
	@Autowired
	GoodDaoImpl gdi;

	@Autowired
	CartDaoImpl cdi;

	@Autowired
	MemberDaoImpl mdi;

	@Autowired
	HttpSession session;

	@GetMapping("/shop/shop/add")
	public ModelAndView add(Integer id, Model m) {
		ModelAndView mav = new ModelAndView("shop/add");
		Good g = gdi.queryId(id);
		m.addAttribute("GOOD", g);
		return mav;
	}
	
	@PostMapping("/shop/shop/addS")
	public ModelAndView addS(Integer good_id, Integer amount) {
		ModelAndView mav = new ModelAndView("shop/addSuccess");
		Member m = (Member)session.getAttribute("MEMBER");
		cdi.addCart(new Cart(m.getId(), good_id, amount));
		return mav;
	}
	
	@GetMapping("/shop/cart/delete")
	public ModelAndView delete(Integer id) {
		ModelAndView mav = new ModelAndView("shop/cart/delete");
		cdi.deleteCart(id);
		return mav;		
	}
}
