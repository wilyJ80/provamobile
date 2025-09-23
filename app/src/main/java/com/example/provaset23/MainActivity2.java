package com.example.provaset23;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Button exitBtn = (Button) findViewById(R.id.exit_btn);
        exitBtn.setOnClickListener(v -> {
            finishAffinity();
        });

        Button configBtn = (Button) findViewById(R.id.config_btn);
        configBtn.setOnClickListener(v -> {
            var intent = new Intent(getApplicationContext(), MainActivity3.class);
            startActivity(intent);
        });
    }
}