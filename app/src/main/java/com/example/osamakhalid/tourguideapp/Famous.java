package com.example.osamakhalid.tourguideapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class Famous extends AppCompatActivity {
    ArrayList<Guide> array;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_famous);
        array = new ArrayList<Guide>();
        array.add(new Guide("Tomb of Quiad-E-Azam",R.drawable.splash_image));
        array.add((new Guide("Arabian Sea",R.drawable.beach)));
        array.add(new Guide("Port Grand",R.drawable.port_grand));
        array.add(new Guide("Saddar",R.drawable.saddar));
        array.add(new Guide("Churna Island",R.drawable.churna));
        ListAdapter adapter= new CustomAdapter(this,array);
        ListView mylist = (ListView) findViewById(R.id.list);
        mylist.setAdapter(adapter);
    }
}
