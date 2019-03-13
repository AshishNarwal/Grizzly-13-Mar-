package com.cts.grizzly.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.cts.grizzly.bean.Product;
import com.cts.grizzly.service.ProductService;

@Controller
public class ProductController {
	@Autowired
	ProductService productService;
	@RequestMapping("product.html")
	public String getProductPage(){
		return "product";
	}
	@RequestMapping(value="product.html", method=RequestMethod.POST)
	public ModelAndView addProduct(@ModelAttribute Product product){
		ModelAndView modelAndview = new ModelAndView();
		
		String result = productService.addProduct(product);
		
		if("success".equals(result)){
			modelAndview.addObject("product", product);
			modelAndview.setViewName("productAdded");
		}
		else {
			modelAndview.setViewName("productAdded");
		}
		
		return modelAndview;
	}
}
