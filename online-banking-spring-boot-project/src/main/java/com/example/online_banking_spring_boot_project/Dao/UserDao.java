package com.example.online_banking_spring_boot_project.Dao;

import com.example.online_banking_spring_boot_project.Entity.User;

public interface UserDao {

	User saveUserDao(User user);

	User findUserByIdDao(Integer userId);

	User findUserByEmailDao(String userEmail);

}
