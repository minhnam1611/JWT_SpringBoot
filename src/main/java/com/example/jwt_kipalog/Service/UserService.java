package com.example.jwt_kipalog.Service;

import com.example.jwt_kipalog.Entity.User;
import com.example.jwt_kipalog.Security.UserPrincipal;

public interface UserService {
    User createUser(User user);

    UserPrincipal findByUsername(String username);
}
