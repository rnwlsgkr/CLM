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
	
	@GetMapping("/mypage_edit_myinfo")
	public ModelAndView mypage() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("/user/mypage_edit_myinfo.html");
		
		return mv;
	}
	
	@GetMapping("/mypage_home")
	public ModelAndView mypage_home() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("/user/mypage_home.html");
		
		return mv;
	}
	
	@GetMapping("/mypage_leave")
	public ModelAndView mypage_leave() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("/user/mypage_leave.html");
		
		return mv;
	}
	
	@GetMapping("/mypage_leave_completion")
	public ModelAndView mypage_leave_completion() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("/user/mypage_leave_completion.html");
		
		return mv;
	}
	
	@GetMapping("/mypage_myprofile")
	public ModelAndView mypage_myprofile() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("/user/myprofile.html");
		
		return mv;
	}

}



