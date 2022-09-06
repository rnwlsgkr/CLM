package com.spring.clm.controller.support;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/support")
public class SupportController {
	

	@GetMapping("/support_home")
	public ModelAndView support_homeView() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("/support/support_home.html");
		
		return mv;
	}
	
	@GetMapping("/qna")
	public ModelAndView qnaView() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("/support/qna.html");
		
		return mv;
	}
	
	@GetMapping("/news")
	public ModelAndView newsView() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("/support/news.html");
		
		return mv;
	}
	
	@GetMapping("/faq")
	public ModelAndView faqView() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("/support/faq.html");
		
		return mv;
	}
}



