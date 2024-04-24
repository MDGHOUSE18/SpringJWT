package com.springJwt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springJwt.model.Role;
import com.springJwt.model.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer> {

    Optional<User> findByUsername(String username);

	User findByRole(Role admin);

}
