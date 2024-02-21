package com.Praveen.SpringMVCBoot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class ControllerClass 
{
	@RequestMapping("/")
	public String home()
	{
		return "index.jsp";
	}
	@RequestMapping("add")
	public String add(@RequestParam("num1") int i,@RequestParam("num2") int j, HttpSession session)
	{
		session.setAttribute("result", (i+j));
		return "result.jsp";
	}
}