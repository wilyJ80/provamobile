package com.example.provaset23;

import static android.app.PendingIntent.getActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.dialog.MaterialAlertDialogBuilder;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MaterialAlertDialogBuilder builder = new MaterialAlertDialogBuilder(MainActivity.this);
        builder.setTitle("Login");

        LayoutInflater inflater = getLayoutInflater();
        View customLayout = inflater.inflate(R.layout.custom, null);
        builder.setView(customLayout);

        builder.setPositiveButton("OK", (dialog, which) -> {
            EditText username = customLayout.findViewById(R.id.username);
            EditText password = customLayout.findViewById(R.id.password);

            if (username.getText().toString().equals("") && password.getText().toString().equals("")) {
                var intent = new Intent(getApplicationContext(), MainActivity2.class);
                startActivity(intent);
            } else {
                Toast.makeText(MainActivity.this, "Wrong username or password", Toast.LENGTH_SHORT).show();
            }
        });

        builder.setNegativeButton("Exit", (dialog, which) -> {
            finish();
        });

        AlertDialog dialog = builder.create();
        dialog.setCancelable(false);
        dialog.show();

        Button button = (Button) findViewById(R.id.login_btn);
        button.setOnClickListener(v -> {
            dialog.show();
        });
    }
}