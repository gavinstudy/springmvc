package com.gavin.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value="/")
public class QueryProduct {
	@RequestMapping(value="order/queryproduct")
	public ModelAndView queryForProduct(HttpServletRequest request,HttpServletResponse response) {
		String some = request.getParameter("someText");
		System.out.println(some);
		ModelAndView mav = new ModelAndView();
		mav.addObject("someTest", some);
		return mav;
	}
}
