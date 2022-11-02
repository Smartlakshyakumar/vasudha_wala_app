package com.amity.vasudha;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    Button MoveToList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MoveToList = findViewById(R.id.button1);
        MoveToList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(view.getContext(), MainActivity2.class);
                startActivity(intent1);
            }
        });

        // List Factory Locations in App
        // Get API Quote
        // Process AQI information
        // Display Data onto app
        // Send data to govt.




    }
}