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
	public ModelAndView joinView() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("/user/join.html");
		
		return mv;
	}
	
	// S mypage  ************************************************************

	
	@GetMapping("/mypage/mypage_home")
	public ModelAndView mypage_homeView() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("/user/mypage/mypage_home.html");
		
		return mv;
	}
	
	@GetMapping("/mypage/edit_myinfo")
	public ModelAndView mypageView() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("/user/mypage/edit_myinfo.html");
		
		return mv;
	}
	
	@GetMapping("/mypage/leave")
	public ModelAndView mypage_leaveView() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("/user/mypage/leave.html");
		
		return mv;
	}

	
	@GetMapping("/mypage/leave_completion")
	public ModelAndView mypage_leave_completionView() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("/user/mypage/leave_completion.html");
		
		return mv;
	}
	
	@GetMapping("/mypage/profile")
	public ModelAndView mypage_profileView() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("/user/mypage/profile.html");
		
		return mv;
	}

	@GetMapping("/support/support_home")
	public ModelAndView support_homeView() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("/user/support/support_home.html");
		
		return mv;
	}
	
	@GetMapping("/support/qna")
	public ModelAndView qnaView() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("/user/support/qna.html");
		
		return mv;
	}
	
	// E mypage ************************************************************
}



