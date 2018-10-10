package com.androidtraining.devicesapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.androidtraining.lib.MyClass;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity_TAG";
    private MyClass myClass;
    private ArrayList<String> list;

    private MyRecyclerAdapter myRecyclerAdapter;
    private RecyclerView recycler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        recycler = findViewById(R.id.recycler);
        myRecyclerAdapter =  new MyRecyclerAdapter();

        recycler.setAdapter(myRecyclerAdapter);
        recycler.setLayoutManager(new LinearLayoutManager(this));

        myClass = new MyClass();
        list = myClass.createList(1000);

        myRecyclerAdapter.updateDataSet(list);

        for(String element:list) {
            Log.d(TAG, "onCreate: List - " + element);
        }
    }
}
