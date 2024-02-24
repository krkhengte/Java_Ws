package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FirstController {

	@GetMapping("/Welcome")
	public ModelAndView getWelcomeMsg() {
		
		ModelAndView mav=new ModelAndView();
		
		mav.addObject("msg", "Welcome To Spring Web MVC..! (Second Application)");
		
		mav.setViewName("welcome");
		return mav;
	}
}
