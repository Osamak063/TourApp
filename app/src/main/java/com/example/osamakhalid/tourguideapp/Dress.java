package com.example.osamakhalid.tourguideapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class Dress extends AppCompatActivity {
    ArrayList<Guide> array;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dress);

        array = new ArrayList<Guide>();
        array.add(new Guide("Men Dress","شلوار قمیض",R.drawable.dress2));
        array.add((new Guide("Women Dress","شلوار قمیض",R.drawable.dress1)));
        array.add(new Guide("Men Foot Wear","چپل",R.drawable.foot_wear));
        array.add(new Guide("Women Foot Wear","چپل",R.drawable.foot_wear2));
        array.add(new Guide("Cap","ٹوپی",R.drawable.topi));

        ListAdapter adapter= new CustomAdapter(this,array);
        ListView mylist = (ListView) findViewById(R.id.list);
        mylist.setAdapter(adapter);
    }
}
