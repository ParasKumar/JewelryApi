package com.example.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entity.User;

@Repository
public interface IUserRepository extends JpaRepository<User, Long> {
	User findByUserName(String userName);

}
