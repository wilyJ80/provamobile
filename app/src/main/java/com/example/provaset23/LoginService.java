package com.example.provaset23;

public class LoginService {

    public static boolean validateOnStart(String username, String password) {
        return username.isEmpty() && password.isEmpty();
    }
}
