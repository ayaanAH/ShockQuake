package com.example.shockquake;

import android.app.Activity;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class QuakeAdapter extends ArrayAdapter<EarthQuake>
{


    public QuakeAdapter(Activity context, ArrayList<EarthQuake> numberList) {
        super(context,0,numberList);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
        View root= LayoutInflater.from(getContext()).inflate(R.layout.list_element, parent,false);

        EarthQuake currentWord=getItem(position);


        TextView magnitudeView=root.findViewById(R.id.magnitude);
        TextView locationView=root.findViewById(R.id.location);
        TextView dateView=root.findViewById(R.id.date);

        magnitudeView.setText(""+currentWord.getMagnitude());
        locationView.setText(currentWord.getLocation());
        dateView.setText(currentWord.getDate());


        return root;
    }
}
