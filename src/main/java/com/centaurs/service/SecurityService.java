package com.centaurs.service;

public interface SecurityService {
    String findLoggedInUsername();
    void autologin(String username, String password);
}
