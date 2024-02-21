package com.Praveen.SpringMVCBoot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.Praveen.SpringMVCBoot.model.User;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class ControllerClass 
{
	@RequestMapping("/")
	public String home()
	{
		return "index";
	}
	@RequestMapping("add")
	public ModelAndView add(@RequestParam("num1") int i,@RequestParam("num2") int j)
	{
		ModelAndView mv = new ModelAndView();
		mv.setViewName("result");
		mv.addObject("result",i+j);
		return mv;
	}
	@RequestMapping("addUser")
	public String addUserString(@ModelAttribute User user)
	{
		return "user";
	}
}
