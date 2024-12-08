package com.example.jobportal.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.jobportal.Model.Recuiter;
import com.example.jobportal.Model.User;

public interface RecuiterRepo extends JpaRepository<Recuiter, Integer> {

	Recuiter findByMobile(long mobile);

	Recuiter findByEmail(String email);

	Recuiter findById(User user);
}
