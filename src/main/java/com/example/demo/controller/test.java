//package com.example.demo.controller;
//
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.servlet.ModelAndView;
//
//import com.example.demo.vo.Member;
//
//@RestController
//public class test {	
//	PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
//	
//	@GetMapping("/test")
//	public ModelAndView gotest(@ModelAttribute("Member") Member m) {
//		ModelAndView mav = new ModelAndView();
//
//		mav.setViewName("loginSuccess");
//		return mav;
//	}
//}
