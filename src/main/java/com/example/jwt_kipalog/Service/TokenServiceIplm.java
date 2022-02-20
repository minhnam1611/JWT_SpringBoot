package com.example.jwt_kipalog.Service;

import com.example.jwt_kipalog.Entity.Token;
import com.example.jwt_kipalog.Repository.TokenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TokenServiceIplm implements TokenService {

    @Autowired
    TokenRepository tokenRepository;

    @Override
    public Token createToken(Token token) {
        return tokenRepository.saveAndFlush(token);
    }

    @Override
    public Token findByToken(String token) {
        return tokenRepository.findByToken(token);
    }

}
