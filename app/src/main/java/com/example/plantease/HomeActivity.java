package com.example.plantease;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        CardView cardView1 = findViewById(R.id.card1);
        CardView cardView2 = findViewById(R.id.card2);
        CardView cardView3 = findViewById(R.id.card3);
        CardView cardView4 = findViewById(R.id.card4);

        // Set click listeners for each CardView
        cardView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // When cardView1 is clicked, pass its details to MenuActivity
                sendDetailsToMenuActivity("Ficus", "The elegant Ficus, known as the \"weeping fig,\" graces indoor spaces with glossy foliage, improving air quality while adding natural beauty.", R.drawable.ficus);
            }
        });

        cardView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // When cardView2 is clicked, pass its details to MenuActivity
                sendDetailsToMenuActivity("Cactus", "Resilient and sculptural, cacti thrive in arid conditions, adorning spaces with unique shapes and embodying the beauty of desert landscapes.", R.drawable.cactus);
            }
        });

        cardView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // When cardView3 is clicked, pass its details to MenuActivity
                sendDetailsToMenuActivity("Samantha", "Samantha, an exotic houseplant with vibrant, patterned leaves, infuses spaces with artful elegance, captivating plant enthusiasts.", R.drawable.smantha);
            }
        });

        cardView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // When cardView4 is clicked, pass its details to MenuActivity
                sendDetailsToMenuActivity("Aloe vera", "Aloe Vera, a healing succulent, soothes skin and decorates spaces with its versatile charm, making it a beloved household plant.", R.drawable.alovera);
            }
        });
    }

    private void sendDetailsToMenuActivity(String plantName, String plantDescription, int plantImageResource) {
        Intent intent = new Intent(HomeActivity.this, MenuActivity.class);
        intent.putExtra("plant_name", plantName);
        intent.putExtra("plant_description", plantDescription);
        intent.putExtra("plant_image_id", plantImageResource);
        startActivity(intent);
    }
}