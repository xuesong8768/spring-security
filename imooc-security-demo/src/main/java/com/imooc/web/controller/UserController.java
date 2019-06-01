package com.imooc.web.controller;

import com.imooc.dto.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xuesong <songxue@wisedu.com>
 */
@RestController
public class UserController {

	@GetMapping("/user")
	public List<User> query(@RequestParam String username, @RequestParam String password){
		List<User> users=new ArrayList<>();
		users.add(new User());
		users.add(new User());
		users.add(new User());
		return users;
	}
}
