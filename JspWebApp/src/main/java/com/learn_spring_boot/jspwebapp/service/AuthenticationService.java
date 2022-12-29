package com.learn_spring_boot.jspwebapp.service;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {

    public boolean authenticate(String username, String password) {

        boolean isValidUserName = username.equalsIgnoreCase("Hristijan");
        boolean isValidPassword = password.equalsIgnoreCase("Kiko181134");

        return isValidUserName && isValidPassword;
    }
}
