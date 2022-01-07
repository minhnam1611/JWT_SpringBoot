package com.example.jwt_kipalog.Service;

import com.example.jwt_kipalog.Entity.Token;

public interface TokenService {
    Token createToken (Token token);
    Token findByToken(String token);
}
