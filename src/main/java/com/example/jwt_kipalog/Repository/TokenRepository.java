package com.example.jwt_kipalog.Repository;

import com.example.jwt_kipalog.Entity.Token;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TokenRepository extends JpaRepository<Token, Long> {
    Token findByToken(String token);
}
