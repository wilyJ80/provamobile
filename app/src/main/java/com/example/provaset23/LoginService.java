package com.example.provaset23;

public class LoginService {

    public static boolean validateOnStart(String username, String password) {
        return username.isEmpty() && password.isEmpty();
    }

    public static boolean validateReset(String username, String password, String confirm) {

        return !username.isEmpty() &&
                password.equals(confirm) &&
                password.length() >= 8;
    }
}
