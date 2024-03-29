package br.com.crcarvalho.crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.crcarvalho.crud.entity.User;
import br.com.crcarvalho.crud.service.UserService;

@RestController
@RequestMapping("users")
public class UserController {
	
	private UserService userService;
	
	@Autowired
	public UserController(UserService userService) {
		this.userService = userService;
	}
	
	@GetMapping
	public List<User> findAll(){
		return userService.findAll();
	}
	
}
