package com.example.hp.shopit;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;


import com.example.hp.shopit.Activityfour.Adapter;
import com.example.hp.shopit.Activityfour.Datalist;

public class Activity4 extends AppCompatActivity {
    private RecyclerView recyclerView;
    private Adapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activitymain3);
        recyclerView=(RecyclerView)findViewById(R.id.recycler);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter=new Adapter(this, Datalist.getListData());
        recyclerView.setAdapter(adapter);


    }
}
