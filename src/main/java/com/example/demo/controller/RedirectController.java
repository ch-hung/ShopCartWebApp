package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.service.impl.CartDaoImpl;
import com.example.demo.service.impl.GoodDaoImpl;
import com.example.demo.service.impl.MemberDaoImpl;
import com.example.demo.service.impl.ShowcartDaoImpl;
import com.example.demo.vo.Good;
import com.example.demo.vo.Showcart;

import jakarta.servlet.http.HttpSession;

@RestController
public class RedirectController {
	@Autowired
	GoodDaoImpl gdi;

	@Autowired
	CartDaoImpl cdi;

	@Autowired
	MemberDaoImpl mdi;
	
	@Autowired
	ShowcartDaoImpl sdi;

	@Autowired
	HttpSession session;
	
	@GetMapping("/shop/shop")
	public ModelAndView shop(Model m) {
		ModelAndView mav = new ModelAndView("shop/shop");
		List<Good> goods = gdi.queryAll();
		m.addAttribute("GOODS", goods);
		return mav;
	}

	@GetMapping("/shop/cart")
	public ModelAndView cart(Model m) {
		ModelAndView mav = new ModelAndView("shop/cart/cart");
		Integer m1 = (Integer)session.getAttribute("MEMBER_ID");
		List<Showcart> ss = sdi.queryMemberId(m1);
		int sum = 0;
		for(int i = 0; i < ss.size(); i++) {
			sum += ss.get(i).getShowcart_total();
		}
		m.addAttribute("SHOWCARTS", ss);
		m.addAttribute("SUM", sum);
		return mav;
	}
}
