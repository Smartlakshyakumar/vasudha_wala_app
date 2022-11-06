package com.amity.vasudha;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {

    ArrayList list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        list = new ArrayList();
        generateData();
        RecyclerView recyclerview = findViewById(R.id.myRecyclerView);
        CustomAdapter adapter = new CustomAdapter(list);
        recyclerview.setAdapter(adapter);
        recyclerview.setLayoutManager(new LinearLayoutManager(this));


    }

    void generateData(){
        for ( int count = 0; count <= 4; count++){
            list.add("Area " + (count+1));
        }
    }

}