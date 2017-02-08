package com.example.osamakhalid.tourguideapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;
import java.util.zip.Inflater;

/**
 * Created by Osama Khalid on 1/22/2017.
 */
public class CustomAdapter extends ArrayAdapter {
    public CustomAdapter(Context context, List<Guide> guide) {
        super(context,R.layout.list_item, guide);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View customView = convertView;
        if(customView==null){
        customView= LayoutInflater.from(getContext()).inflate(R.layout.list_item,parent,false);
    }
        Guide guide = (Guide) getItem(position);
        if(guide.hasUrduWord()) {
            TextView urdu = (TextView) customView.findViewById(R.id.Urdu);
            urdu.setText(guide.getUrduWord().toString());
        }
        if(guide.hasImage()){
            ImageView image= (ImageView) customView.findViewById(R.id.Image);
            image.setImageResource(guide.getImageid());

        }
        TextView eng= (TextView) customView.findViewById(R.id.English);
        eng.setText(guide.getEngWord().toString());

        return customView;
    }
}
