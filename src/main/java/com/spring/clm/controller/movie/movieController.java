package com.spring.clm.controller.movie;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/movie")
public class movieController {
	
	@GetMapping("/mTopgun")
	public ModelAndView topgunView() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("/movie/mTopgun.html");
		
		return mv;
	}
	
	@GetMapping("/m645")
	public ModelAndView m645View() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("/movie/m645.html");
		
		return mv;
	}
	
	@GetMapping("/mBullet")
	public ModelAndView mBulletView() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("/movie/mBullet.html");
		
		return mv;
	}
	
	@GetMapping("/mDemonSlayer")
	public ModelAndView mDemonSlayerView() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("/movie/mDemonSlayer.html");
		
		return mv;
	}
	
	@GetMapping("/mHansan")
	public ModelAndView mHansanView() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("/movie/mHansan.html");
		
		return mv;
	}
	
	@GetMapping("/mHunt")
	public ModelAndView mHuntView() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("/movie/mHunt.html");
		
		return mv;
	}
	
	@GetMapping("/mKonan")
	public ModelAndView mKonanView() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("/movie/mKonan.html");
		
		return mv;
	}
	
	@GetMapping("/mLOL")
	public ModelAndView mLOLView() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("/movie/mLOL.html");
		
		
		return mv;
	}
	
	@GetMapping("/mNope")
	public ModelAndView mNopeView() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("/movie/mNope.html");
		
		
		return mv;
	}
	
	@GetMapping("/mSemanic")
	public ModelAndView mSemanicView() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("/movie/mSemanic.html");
		
		
		return mv;
	}
}
