package com.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.model.Users;

public interface UserRepository extends JpaRepository<Users,Integer> {

}
