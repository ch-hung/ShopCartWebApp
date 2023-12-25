package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.service.impl.CartDaoImpl;
import com.example.demo.service.impl.GoodDaoImpl;
import com.example.demo.service.impl.MemberDaoImpl;
import com.example.demo.vo.Cart;
import com.example.demo.vo.Good;
import com.example.demo.vo.Member;
import com.example.demo.vo.ShowCart;

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
		Member m1 = (Member)session.getAttribute("MEMBER");
		// Form a list form cart display
		List<Cart> cs = cdi.queryMemberId(m1.getId());
		List<ShowCart> scs = new ArrayList<>();
		int sum = 0;
		for (int i = 0; i < cs.size(); i++) {
			Cart c = cs.get(i);
			Good g = gdi.queryId(c.getGood_id());
			ShowCart sc = new ShowCart(c.getId(), g.getName(), c.getAmount(), g.getPrice(), 0);
			scs.add(sc);
			sum += sc.getTotal();
		}
		m.addAttribute("SHOWCARTS", scs);
		m.addAttribute("SUM", sum);
		return mav;
	}
}
