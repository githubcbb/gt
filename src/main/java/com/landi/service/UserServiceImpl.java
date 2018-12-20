package com.landi.service;

import com.landi.entity.User;
import org.springframework.stereotype.Service;

/**
 * Created by cbb on 2018/12/19.
 */
@Service(value = "userService")
public class UserServiceImpl implements UserService{
	@Override
	public int addUser(User user) {
		return 0;
	}
}
