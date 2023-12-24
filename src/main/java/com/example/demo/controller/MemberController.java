package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.service.impl.MemberDaoImpl;
import com.example.demo.vo.Member;

import jakarta.servlet.http.HttpSession;

@RestController
public class MemberController {
	@Autowired
	MemberDaoImpl mdi;
	
	@Autowired
	HttpSession session;

	@PostMapping("/login")
	public ModelAndView login(@ModelAttribute("Member") Member m) {
		ModelAndView mav = new ModelAndView();
		Member m1 = mdi.queryMember(m.getUsername(), m.getPassword());
		if (m1 == null) {
			mav.setViewName("loginError");
		} else {
			mav.setViewName("loginSuccess");
			session.setAttribute("MEMBER", m1);
		}
		return mav;
	}

	@PostMapping("/signup")
	public ModelAndView signup(@ModelAttribute("Member") Member m) {
		ModelAndView mav = new ModelAndView();
		// username not exit -> success
		if (mdi.queryUsername(m.getUsername())) {
			mdi.addMember(m);
			mav.setViewName("signupSuccess");
		} else {
			mav.setViewName("signupError");
		}
		
		return mav;
	}
	
	@GetMapping("/logout")
	public ModelAndView logout() {
		ModelAndView mav = new ModelAndView("logout");
		session.removeAttribute("MEMBER");
		return mav;
	}
}
