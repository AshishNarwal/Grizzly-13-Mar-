package com.cts.grizzly.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.cts.grizzly.bean.Login;
import com.cts.grizzly.service.LoginService;

@Controller
public class LoginController {
	@RequestMapping("login.html")
	public String getLoginPage(){
		return "login";
	}
	
	@Autowired
	LoginService loginService;
	
	@RequestMapping(value="login.html", method=RequestMethod.POST)
	public ModelAndView validateUser(@ModelAttribute Login login){
		ModelAndView modelAndView = new ModelAndView();
		if(loginService.authentication(login)){
			modelAndView.setViewName("adminPage");
		} else{
			modelAndView.addObject("login",login);
			modelAndView.setViewName("index");
		}
		return modelAndView;
	}
}
