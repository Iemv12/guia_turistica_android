package com.example.guia_turistica.Spinner_design;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.guia_turistica.R;

public class Custom_spinner extends ArrayAdapter<String> {

    Context context;
    String[] name;
    int [] bandera;

    public Custom_spinner(@NonNull Context context, String[] name, int[] bandera) {
        super(context, R.layout.spinner,name);
        this.context = context;
        this.name = name;
        this.bandera = bandera;
    }

    @Override
    public View getDropDownView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {


            LayoutInflater inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View v = inflater.inflate(R.layout.spinner,null);

            TextView tv1 = (TextView)v.findViewById(R.id.mon);
            ImageView iv = (ImageView)v.findViewById(R.id.pais);

            tv1.setText(name[position]);
            iv.setImageResource(bandera[position]);



        return v;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {


        LayoutInflater inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View v = inflater.inflate(R.layout.spinner,null);

        TextView tv1 = (TextView)v.findViewById(R.id.mon);
        ImageView iv = (ImageView)v.findViewById(R.id.pais);

        tv1.setText(name[position]);
        iv.setImageResource(bandera[position]);



        return v;
    }
}
