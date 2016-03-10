package com.centaurs.service;

import com.centaurs.model.User;

public interface UserService {
    void save(User user);
    User findByUsername(String username);
}
