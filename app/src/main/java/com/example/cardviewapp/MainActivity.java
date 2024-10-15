package com.example.cardviewapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements SportListener {

//    AdapterView
    RecyclerView recyclerView;

//    Data source
    List<Sport> sportList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        Find AdapterView in layout
        recyclerView = findViewById(R.id.recycleView);

//        Initialize data source
        sportList = new ArrayList<>();

        Sport sport1 = new Sport(R.drawable.football,"Football");
        Sport sport2 = new Sport(R.drawable.basketball,"Basketball");
        Sport sport3 = new Sport(R.drawable.tennis,"Tennis");
        Sport sport4 = new Sport(R.drawable.volley,"Volley");
        Sport sport5 = new Sport(R.drawable.ping,"Ping");

        sportList.add(sport1);
        sportList.add(sport2);
        sportList.add(sport3);
        sportList.add(sport4);
        sportList.add(sport5);

        SportAdapter sportAdapter = new SportAdapter(sportList);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);

        recyclerView.setLayoutManager(linearLayoutManager);

        recyclerView.setAdapter(sportAdapter);


//        Link Adapter and click Listener

        sportAdapter.setSportListener(this);


    }

    @Override
    public void onClickSportListener(View view, int position) {
        Toast.makeText(this, "Say my name: "+sportList.get(position).getSportName(), Toast.LENGTH_SHORT).show();

    }
}