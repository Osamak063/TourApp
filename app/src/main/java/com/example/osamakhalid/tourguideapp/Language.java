package com.example.osamakhalid.tourguideapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class Language extends AppCompatActivity {
    ArrayList<Guide> array;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_language);
        array = new ArrayList<Guide>();
        array.add(new Guide("One","ایک"));
        array.add((new Guide("Two","دو")));
        array.add(new Guide("Three","تین"));
        array.add(new Guide("Four","چار"));
        array.add(new Guide("Five","پانچ"));
        array.add(new Guide("Six","چھ"));
        array.add(new Guide("Seven","سات"));
        array.add(new Guide("Eight","آٹھ"));
        array.add(new Guide("Nine","نو"));
        array.add(new Guide("Ten","دس"));
        ListAdapter adapter= new CustomAdapter(this,array);
        ListView mylist = (ListView) findViewById(R.id.list);
        mylist.setAdapter(adapter);
    }
}
