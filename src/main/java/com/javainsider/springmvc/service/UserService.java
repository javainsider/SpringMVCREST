package com.javainsider.springmvc.service;

import java.util.List;

import com.javainsider.springmvc.domain.User;

public interface UserService {

	public User getUserById(int userId);

	public List<User> getUserList();

}
