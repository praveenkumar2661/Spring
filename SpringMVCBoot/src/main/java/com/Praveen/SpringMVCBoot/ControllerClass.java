package com.Praveen.SpringMVCBoot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ControllerClass 
{
	@RequestMapping("/")
	public String home()
	{
		return "index.jsp";
	}
}
