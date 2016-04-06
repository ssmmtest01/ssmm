package com.hand.ssm.service.serviceImpl;



import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hand.ssm.model.user;
import com.hand.ssm.service.userService;
import com.hand.ssm.dao.userMapper;
@Service("userservice")
public class userServiceImpl implements userService{
private userMapper userMapper;
	public userMapper getUserMapper() {
	return userMapper;
}
@Autowired
public void setUserMapper(userMapper userMapper) {
	this.userMapper = userMapper;
}

	@Override
	public user getById(Integer id) {
		return userMapper.getByPrimaryKey(id);
	}
	@Override
	public List<user> getAll() {
		return userMapper.getAll();
	}
	@Override
	public List<user> getAll2() {
		return userMapper.getAll2();
	}
	@Override
	public List<user> getAll3() {
		return userMapper.getAll3();
	}
	@Override
	public void deleteUser(Integer id) {
		userMapper.deleteUser(id);
	}
	@Override
	public void updateUser(user user) {
		userMapper.updateUser(user);
	}
	@Override
	public void addUser(user user) {
		userMapper.addUser(user);
	}

}
