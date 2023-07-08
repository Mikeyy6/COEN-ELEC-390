package com.example.myapptest.Views;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapptest.R;


public class Homepage_Activity extends AppCompatActivity {

    Button button_meds, button_support, button_info, button_settings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);

        // Link Java with XML Items
        button_meds = findViewById(R.id.button_medication);
        button_support = findViewById(R.id.button_technical_support);
        button_info = findViewById(R.id.button_legal_info);
        button_settings = findViewById(R.id.button_settings);


        button_info.setOnClickListener(v -> {
            Intent intent = new Intent(getApplicationContext(), Legal_Information_Activity.class);
            startActivity(intent);
            finish();
        });

        button_settings.setOnClickListener(v -> {
            Intent intent = new Intent(getApplicationContext(), SettingsActivity.class);
            startActivity(intent);
        });

    }

}