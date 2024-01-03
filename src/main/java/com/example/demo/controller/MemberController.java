package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
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
	
	private PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

	@PostMapping("/login")
	public ModelAndView login(@ModelAttribute("Member") Member m) {
		ModelAndView mav = new ModelAndView();
		
		Member m1 = mdi.queryUsername(m.getMember_username());
		if (passwordEncoder.matches(m.getMember_password(), m1.getMember_password())) {
			mav.setViewName("loginSuccess");
			m1.setMember_password(null);
			session.setAttribute("MEMBER", m1);
		} else {
			mav.setViewName("loginError");
		}
		return mav;
	}

	@PostMapping("/signup")
	public ModelAndView signup(@ModelAttribute("Member") Member m) {
		ModelAndView mav = new ModelAndView();
		// username not exit -> success
		if (mdi.queryUsername(m.getMember_username()) == null) {
			String encodedPassword = passwordEncoder.encode(m.getMember_password());
			m.setMember_password(encodedPassword);
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
