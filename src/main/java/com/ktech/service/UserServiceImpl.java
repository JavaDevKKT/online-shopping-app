package com.ktech.service;

import java.util.List;
import org.springframework.stereotype.Service;
import com.ktech.entity.User;
import com.ktech.repo.UserRepository;

@Service
public class UserServiceImpl implements UserService {
	private UserRepository userRepository;

	public UserServiceImpl(UserRepository userRepository) {
		super();
		this.userRepository = userRepository;
	}

	@Override
	public User saveUser(User user) {
		return userRepository.save(user);
	}

	@Override
	public List<User> getUsersList() {
		return userRepository.findAll();
	}
}
