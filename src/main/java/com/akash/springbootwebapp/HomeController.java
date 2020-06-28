package com.akash.springbootwebapp;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
	
	@RequestMapping("home")
	//@ResponseBody
	public String home(HttpServletRequest req)
	{
		HttpSession session = req.getSession();
		String name = req.getParameter("name");
		System.out.println("Hi" + " - " + name);
		session.setAttribute("name", name);
		return "home";
	}
}
