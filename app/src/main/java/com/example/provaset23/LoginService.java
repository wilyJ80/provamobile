package com.example.provaset23;

import static android.content.Context.MODE_PRIVATE;

import android.content.Context;
import android.content.SharedPreferences;

public class LoginService {

	public static boolean validateOnStart(String username, String password) {
		return username.isEmpty() && password.isEmpty();
	}

	public static boolean validateReset(String username, String password, String confirm) {

		return !username.isEmpty() &&
				password.equals(confirm) &&
				password.length() >= 8;
	}

	public static boolean loginValidation(Context context, String username, String password) {

		SharedPreferences preferences = context.getSharedPreferences("Preferences", MODE_PRIVATE);

		String savedUsername = preferences.getString("username", null);
		String savedPassword = preferences.getString("password", null);

		return (username.equals(savedUsername) && password.equals(savedPassword))
				||
				(savedUsername == null && savedPassword == null && username.equals("") && password.equals(""));
	}
}
