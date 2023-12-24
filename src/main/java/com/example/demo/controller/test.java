package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.service.impl.MemberDaoImpl;
import com.example.demo.vo.Member;

@RestController
public class test {
	@Autowired
	MemberDaoImpl mdi;

	@GetMapping("/test")
	public ModelAndView gotest(@ModelAttribute("Member") Member m) {
		ModelAndView mav = new ModelAndView();

//		Member m = new Member("username01", "password01", "", "");
//		mdi.addMember(m);

		mav.setViewName("loginSuccess");
		return mav;
	}

}
