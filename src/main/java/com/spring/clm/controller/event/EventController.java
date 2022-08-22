package com.spring.clm.controller.event;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/event")
public class EventController {
	
	@GetMapping("/eventSpecial")
	public ModelAndView noticeNormalView() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("/event/eventSpecial.html");
		
		return mv;
	}

}



