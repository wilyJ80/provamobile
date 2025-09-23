package com.example.provaset23;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        // TODO:
        EditText username = (EditText) findViewById(R.id.username);
        EditText password = (EditText) findViewById(R.id.password);
        EditText confirm = (EditText) findViewById(R.id.confirm);
        Button submit = (Button) findViewById(R.id.submit);

        submit.setOnClickListener(v -> {

            if (LoginService.validateReset(username.getText().toString(), password.getText().toString(), confirm.getText().toString())) {

                Toast.makeText(this, "Credentials updated", Toast.LENGTH_SHORT).show();
                var intent = new Intent(getApplicationContext(), MainActivity2.class);
                startActivity(intent);

            } else {

                Toast.makeText(this, "Username must not be empty, passwords must match, password must be at least 8 characters", Toast.LENGTH_SHORT).show();
            }
        });
    }
}