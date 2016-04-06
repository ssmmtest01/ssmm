package com.hand.ssm.service;

import java.util.List;

import com.hand.ssm.model.user;


public interface userService {
 user getById(Integer id);
 List<user> getAll();
 List<user> getAll2();
 List<user> getAll3();
 void deleteUser(Integer id);
 void updateUser(user user);
 public void addUser(user user);
}
