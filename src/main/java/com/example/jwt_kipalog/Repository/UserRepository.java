package com.example.jwt_kipalog.Repository;

import com.example.jwt_kipalog.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
    User findByUsername(String username);
}
