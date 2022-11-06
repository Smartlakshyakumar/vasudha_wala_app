package com.amity.vasudha;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity implements View.OnClickListener{


    private CardView card1,card2,card3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        card1 = (CardView) findViewById(R.id.card_1);
        card2 = (CardView) findViewById(R.id.card_2);
        card3 = (CardView) findViewById(R.id.card_3);

        card1.setOnClickListener(this);
        card2.setOnClickListener(this);
        card3.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent i ;

        switch (v.getId()){
            case R.id.card_1: i = new Intent(this,MainActivity2.class); startActivity(i); break;
            case R.id.card_2: i = new Intent(this,MainActivity3.class); startActivity(i); break;
            case R.id.card_3: i = new Intent(this,MainActivity4.class); startActivity(i); break;
            default:break;

        }
    }
}