package com.amity.vasudha;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {

    TextView abc;
    String value = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        Bundle extras = getIntent().getExtras();
        if (extras != null) { value = extras.getString("dataSendKey"); }
        else { value = "nothing"; }

        abc = findViewById(R.id.t2);
        abc.setText(value);


    }
}