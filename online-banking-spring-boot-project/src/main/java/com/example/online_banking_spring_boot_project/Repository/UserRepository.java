package com.example.online_banking_spring_boot_project.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.online_banking_spring_boot_project.Entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

	User findByEmail(String userEmail);

}
