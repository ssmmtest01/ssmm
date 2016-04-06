package org.felix.service.impl;

import org.felix.model.User;
import org.felix.service.UserService;

public class UserServiceImpl implements UserService {

	
	public void add(User u) {
		System.out.println("add user[" + u.getName() + "]");
		System.out.println("this server data");
	}

}
