package com.hand.ssm.model;

import java.util.ArrayList;
import java.util.List;


public class user {
private Integer id;
private String name;
private List<role_user> role_users=new ArrayList<role_user>();
public Integer getId() {
	return id;
}

public void setId(Integer id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public List<role_user> getRole_users() {
	return role_users;
}

public void setRole_users(List<role_user> role_users) {
	this.role_users = role_users;
}
}
