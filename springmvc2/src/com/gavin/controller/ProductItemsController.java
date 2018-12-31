package com.gavin.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.gavin.entity.Product;

@Controller
@RequestMapping(value="/")
public class ProductItemsController{
	@RequestMapping(value="order/productItems")
	public ModelAndView productItems(HttpServletRequest request,HttpServletResponse response) {
		List<Product> list = new ArrayList<Product>();
		
		Product p1 = new Product();
		p1.setName("iphone");
		p1.setPrice(5000D);
		p1.setDetail("iphone手机就是好！！！");
		
		Product p2 = new Product();
		p2.setName("vivo");
		p2.setPrice(2000D);
		p2.setDetail("vivo手机就是好！！！");
		
		Product p3 = new Product();
		p3.setName("chuizi");
		p3.setPrice(1000D);
		p3.setDetail("chuizi手机就是好！！！");
		
		list.add(p1);
		list.add(p2);
		list.add(p3);
		
		System.out.println("product列表！！！！");
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("list", list);
//		mav.setViewName("/WEB-INF/jsp/order/productItems.jsp");
		return mav;
	}
}
