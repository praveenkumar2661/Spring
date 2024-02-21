package com.Praveen.SpringMVCBoot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

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
	public String add(HttpServletRequest req)
	{
		HttpSession session = req.getSession();
		session.setAttribute("result", Integer.parseInt(req.getParameter("num1")) + Integer.parseInt(req.getParameter("num2")));
		return "result.jsp";
	}
}
