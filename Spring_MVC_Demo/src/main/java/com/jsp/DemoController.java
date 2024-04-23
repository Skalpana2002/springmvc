package com.jsp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class DemoController
{
	@GetMapping("/message")
	public ModelAndView getMessage()
	{
		ModelAndView mv=new ModelAndView();
		mv.addObject("username","Durga");//model
		mv.setViewName("home.jsp");//view
		return mv;//returning both model and view
		
	}
	
	@GetMapping("/details")
	public ModelAndView getDetails()
	{
		ModelAndView mv=new ModelAndView();
		mv.addObject("username","durga");
		mv.addObject("address","Banglore");
		mv.addObject("email","adurga@gamil.com");
		mv.setViewName("details.jsp");
		return mv;
	}

}
