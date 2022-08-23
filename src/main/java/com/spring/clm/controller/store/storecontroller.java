package com.spring.clm.controller.store;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/store")
public class storecontroller {
	@GetMapping("/storemain")
	public ModelAndView storemainView() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("/store/storemain.html");
		
		return mv;
	}
}






