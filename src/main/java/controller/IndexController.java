package controller;

import model.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import service.UserService;

@Controller
public class IndexController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(value="/index")
	public String index(){
		User user = userService.getUserById(1);
		System.out.println(user.getUsername());
		return "index";
	}

}
