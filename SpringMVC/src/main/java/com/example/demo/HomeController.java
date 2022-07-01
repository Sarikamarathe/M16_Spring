package com.example.demo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller

public class HomeController 
{
	@RequestMapping("/Sarika")
	public String home(HttpServletRequest req,HttpServletResponse res)
	{
		HttpSession session=req.getSession();
		String name=req.getParameter("name");
		System.out.println("Welcome to TechnoServ");
		session.setAttribute(name, name);
		return "home.ghp";
		
	}
}
