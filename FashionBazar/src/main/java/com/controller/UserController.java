package com.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.ecomm.Model.Category;
import com.ecomm.Model.UserDetails;
import com.ecomm.dao.LoginDao;
import com.ecomm.dao.UserDAO;

@Controller
public class UserController
{
	
	@Autowired
	LoginDao loginDao;
	
	@Autowired
	UserDAO userDAO;

	@RequestMapping(value="user")
	public String showUserPage(Model m)
	{
		List<UserDetails> listUser=userDAO.UserList();
		m.addAttribute("listUser" ,listUser);      

		return "User";
	}
	
	@RequestMapping(value="AddUser")
	public String AddUser(@ModelAttribute("u")UserDetails u,Model m)
	{
		UserDetails user=new UserDetails();
		m.addAttribute("user",user);
		
		userDAO.addUser(u);
		
		List<UserDetails> listUser=userDAO.UserList();
		m.addAttribute("listUser" ,listUser);  
		
		return "Login";
	}
	
	@RequestMapping(value="deleteUser{userName}")      
	public String deleteUser(@PathVariable("userName")String userName,Model m)
	{
		UserDetails user=userDAO.getUserDetails(userName);
		userDAO.deleteUser(user);
		
		List<UserDetails> listUser=userDAO.UserList();
		m.addAttribute("listUser" ,listUser);  
		
		return "UserList";
	}

	@RequestMapping(value="loginData")
	public ModelAndView loginData(@ModelAttribute("u")UserDetails u,HttpServletRequest request) {
		HttpSession session=request.getSession();
		ModelAndView mv=new ModelAndView("redirect:home");
		
		
		boolean b=loginDao.userLogin(u.getUserName(), u.getPassword());
		
		
		if(b) {
			
			
				
				session.setAttribute("userName", u.getUserName());
				return mv;
				
			}
		
		else if((u.getUserName().equals("a") && u.getPassword().equals("a")) )
				{
				
				session.setAttribute("adminName", u.getUserName());
				
				return mv;
			
			
		}
			
		else {
			
			request.setAttribute("checklogin","UserName and Password is Not valid");
			return mv=new ModelAndView("Login");
		}
		
		
	}
	
	@RequestMapping(value="logOut")
	public ModelAndView logout(HttpSession session) {
		
		session.invalidate();
		
		return new ModelAndView("redirect:home");
	}
	
	@RequestMapping("editProfile")      
	public String editUser(HttpSession session,Model m)
	{
		String userName=(String)session.getAttribute("userName");
		UserDetails user=userDAO.getUserDetails(userName);
		m.addAttribute("user",user);
		
		return "updateUser";
	}
	
	@RequestMapping(value="UpdateUser",method=RequestMethod.POST)
	public String UpdateUser(@ModelAttribute("user")UserDetails user,Model m)
	{
		userDAO.updateUser(user);
		
		List<UserDetails> listUser=userDAO.UserList();
		m.addAttribute("listUser" ,listUser);  
		return "redirect:home";
		
		
	}
	
	@RequestMapping(value="contactUs")
 	public ModelAndView contactPage() 
	{
 		
 		return new ModelAndView("contactUs");
 	}
	
	@RequestMapping({"sendContact"})
	public ModelAndView sendContact()
	{
		return new ModelAndView("redirect:index");
	}
}
