package com.example.osamakhalid.tourguideapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class Restaurants extends AppCompatActivity {
    ArrayList<Guide> array;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurants);
        array = new ArrayList<Guide>();
        array.add(new Guide("Kolachi",R.drawable.kolachi));
        array.add((new Guide("Kababjees",R.drawable.kababjees)));
        array.add(new Guide("Boat Basin Food Street",R.drawable.boat_basin));
       // array.add(new Guide("Sindi Muslim Food Street",R.drawable.sindhi));
        array.add(new Guide("Burger Lab",R.drawable.burger));
        ListAdapter adapter= new CustomAdapter(this,array);
        ListView mylist = (ListView) findViewById(R.id.list);
        mylist.setAdapter(adapter);

    }
}
