package com.javainsider.springmvc.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.javainsider.springmvc.domain.User;

@Service("userService")
public class UserServiceImpl implements UserService {

	private static Map<Integer, User> userMap;

	static {
		userMap = new HashMap<Integer, User>();

		User user1 = new User();
		user1.setUserid(1);
		user1.setFirstName("Laxmipriya");
		user1.setLastName("Garnaik");
		user1.setPhone("98522333");
		user1.setEmail("laxmi@email.com");

		User user2 = new User();
		user2.setUserid(2);
		user2.setFirstName("Rithwik");
		user2.setLastName("Garnaik");
		user2.setPhone("96754321");
		user2.setEmail("rithwik@email.com");

		User user3 = new User();
		user3.setUserid(2);
		user3.setFirstName("Rudra");
		user3.setLastName("Garnaik");
		user3.setPhone("96561666");
		user3.setEmail("rudra@email.com");

		User user4 = new User();
		user4.setUserid(4);
		user4.setFirstName("John");
		user4.setLastName("Doe");
		user4.setPhone("5454555455");
		user4.setEmail("user4@email.com");

		userMap.put(1, user1);
		userMap.put(2, user2);
		userMap.put(3, user3);
		userMap.put(4, user4);

	}

	public User getUserById(int userId) {

		return userMap.get(userId);
	}

	public List<User> getUserList() {
		return new ArrayList<User>(userMap.values());
	}

	public static Map<Integer, User> getUserMap() {
		return userMap;
	}

	public static void setUserMap(Map<Integer, User> userMap) {
		UserServiceImpl.userMap = userMap;
	}

}
