package com.example.SpringDataJPA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class UserController 
{
	@Autowired
	UserRepository repo; 
	
	@RequestMapping("/")
	public String home()
	{
		return "index.jsp";
	}
	
	@RequestMapping("add")
	public String addUser1(@ModelAttribute("user") User user)
	{
		repo.save(user);
		return "result.jsp";
	}
	
	@RequestMapping("findUser")
	public String findbymail(@RequestParam String mail, @ModelAttribute("user") User user)
	{
		repo.findById(mail);
		return "result.jsp"; 
	}
	
	@RequestMapping("removeUser")
	public String remove(@RequestParam String mail, @ModelAttribute("user") User user)
	{
		repo.deleteById(mail);
		return "result.jsp";
	}
	
	@RequestMapping("findAll")
	public String findAll(Model m)
	{
		m.addAttribute("user", repo.findAll());
		return "result.jsp";
	}
	
	@RequestMapping("updateUser")
	public String update(@RequestParam String mail, String newmail, String newpassword, Model m)
	{
		User user = new User();
		 if(repo.existsById(mail))
		 {
			 repo.deleteById(mail);
			 user.setMail(newmail);
			 user.setPassword(newpassword);
			 repo.save(user);
		 }
		 m.addAttribute("user", user);
		return "result.jsp";
	}
}
