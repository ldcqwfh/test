package com.itheima.UserDao;

import java.util.List;

import com.wanda.entity.User;

public interface IUserDao {
	List<User> findAll();

	User findUser(User user);

	void addUser(User user);

	void delUser(String id);

	void update(String id);
}
