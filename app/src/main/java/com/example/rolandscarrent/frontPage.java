package com.example.rolandscarrent;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class frontPage extends AppCompatActivity {
    public Button buttons;
    public Button button;
    public Button buttonRequirements;
    public ImageButton imagebuttonExit;


    @SuppressLint({"MissingInflatedId", "WrongViewCast"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_front_page);

        buttons = findViewById(R.id.buttonCarMenus);

        buttons.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(frontPage.this, MainActivity.class);
                startActivity(intent);
            }
        });
        button = findViewById(R.id.buttonAboutUsPage);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intents = new Intent(frontPage.this, AboutUs.class);
                startActivity(intents);
            }
        });
        buttonRequirements = findViewById(R.id.buttonToRequirements);

        buttonRequirements.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intents = new Intent(frontPage.this, Requirements.class);
                startActivity(intents);
            }
        });
        imagebuttonExit  = findViewById(R.id.imageButtonExits);
        imagebuttonExit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Call finish() to close the current activity
                finish();

                // If you really want to exit the entire application
                // System.exit(0);
            }
        });
    }
}