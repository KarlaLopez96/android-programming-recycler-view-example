package com.velasco00036514.laboratorio5;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<Planet> planetList;
    RecyclerView recyclerView;
    PlanetAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //filling the planet list
        planetList = fillList();

        //setting the recyclerview
        recyclerView = findViewById(R.id.recyclerView);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        adapter = new PlanetAdapter(this, planetList);

        //recyclerview
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(adapter);

    }

    private ArrayList<Planet> fillList(){
        String desc = "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book";

        ArrayList<Planet> l = new ArrayList<>();
        l.add(new Planet(1, "Earth", desc));
        l.add(new Planet(2, "Venus", desc));
        l.add(new Planet(3, "Mars", desc));

        return l;
    }
}
