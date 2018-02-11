package com.smvcdemo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class addController {
	@RequestMapping(value="/add", method=RequestMethod.GET)
	public ModelAndView add(HttpServletRequest request, HttpServletResponse response){
		
		int i = Integer.parseInt(request.getParameter("t1"));
		int j = Integer.parseInt(request.getParameter("t2"));
		AddService add = new AddService();

		ModelAndView mv = new ModelAndView();
		mv.setViewName("display");
		mv.addObject("result",add.add(i, j));
		return mv;
	}
}
