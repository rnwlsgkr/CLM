package com.spring.clm.controller.user;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@GetMapping("/login")
	public ModelAndView loginView() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("/user/login.html");
		
		return mv;
	}
	
	@GetMapping("/movieChart")
	public ModelAndView movieChartView() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("/user/movieChart.html");
		
		return mv;
	}
	
	@GetMapping("/join")
	public ModelAndView join() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("/user/join.html");
		
		return mv;
	}

}



