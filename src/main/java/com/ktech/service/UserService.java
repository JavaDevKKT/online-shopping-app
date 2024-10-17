package com.ktech.service;

import java.util.List;
import com.ktech.entity.User;

public interface UserService {

	public User saveUser(User user);

	public List<User> getUsersList();
}
