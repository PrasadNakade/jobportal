package com.example.jobportal.Repo;

import org.springframework.data.jpa.repository.JpaRepository;


import com.example.jobportal.Model.User;

public interface UserRepo extends JpaRepository<User, Integer>{

	User findByMobile(long mobile);

	User findByEmail(String email);

	User findById(User user);

}
