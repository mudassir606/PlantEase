package com.example.plantease;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MenuActivity extends AppCompatActivity {

    TextView numberTextView;
    int number = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);


        numberTextView = findViewById(R.id.number);
        CardView addButton = findViewById(R.id.cardAdd);
        CardView minusButton = findViewById(R.id.cardMins);



        // Find the "Go back to Home" button by its ID
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) ImageView backToHomeButton = findViewById(R.id.backbtn);

        // Set an OnClickListener for the button
        backToHomeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Finish the current activity and return to HomeActivity
                finish();
            }
        });

        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (number < 100) {
                    number++;
                    updateNumberText();
                }
            }
        });

        minusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (number > 0) {
                    number--;
                    updateNumberText();
                }
            }
        });


        // Retrieve data passed from HomeActivity
        Intent intent = getIntent();
        String plantName = intent.getStringExtra("plant_name");
        String plantDescription = intent.getStringExtra("plant_description");
        int plantImageResource = intent.getIntExtra("plant_image_id", R.drawable.cactus); // Use a default image if none is provided

        // Find views in the layout
        ImageView plantImageView = findViewById(R.id.default_image);
        TextView plantNameTextView = findViewById(R.id.NameItem);
        TextView plantDescriptionTextView = findViewById(R.id.descriptionText);

        // Set data in views
        plantImageView.setImageResource(plantImageResource);
        plantNameTextView.setText(plantName);
        plantDescriptionTextView.setText(plantDescription);
    }

    private void updateNumberText() {
        numberTextView.setText(String.valueOf(number));
    }
}