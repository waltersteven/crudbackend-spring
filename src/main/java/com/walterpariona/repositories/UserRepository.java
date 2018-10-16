package com.walterpariona.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.walterpariona.model.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
