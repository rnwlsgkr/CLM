package com.spring.clm.controller.ticket;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/ticket")
public class TicketController {

	@GetMapping("/ticket_home")
	public ModelAndView ticketView() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("/ticket/ticket_home.html");
		
		return mv;
	}
}
