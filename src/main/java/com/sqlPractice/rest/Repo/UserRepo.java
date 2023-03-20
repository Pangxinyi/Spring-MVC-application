package com.sqlPractice.rest.Repo;

import com.sqlPractice.rest.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Long> {

}
