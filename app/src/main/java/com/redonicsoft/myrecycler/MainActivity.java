package com.redonicsoft.myrecycler;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;

    int[] image = {

            R.drawable.australia, R.drawable.bangladesh, R.drawable.spain
    };

    String[] title;
    String[] desc;

    MyAdapter myAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recycleViewId);

        title = getResources().getStringArray(R.array.country_name);
        desc = getResources().getStringArray(R.array.country_details);

        myAdapter = new MyAdapter(this, title, desc, image);

        recyclerView.setAdapter(myAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }
}
