package com.landi.controller;

import com.landi.entity.User;
import com.landi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by cbb on 2018/12/19.
 */

@Controller
@RequestMapping(value = "/user")
public class UserController {
	@Autowired
	private UserService userService;

	@ResponseBody
	@PostMapping("/add")
	public int addUser(User user){
		return userService.addUser(user);
	}

	/*@ResponseBody
	@GetMapping("/all")
	public Object findAllUser(
			@RequestParam(name = "pageNum", required = false, defaultValue = "1")
					int pageNum,
			@RequestParam(name = "pageSize", required = false, defaultValue = "10")
					int pageSize){
		return userService.findAllUser(pageNum,pageSize);
	}*/
}
