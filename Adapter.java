package com.example.smartrecipe;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;

import java.util.ArrayList;

public class Adapter<String> extends ArrayAdapter {

    Context context;
    SQLiteDatabase db;
    Cursor cursor;
    Adapter<String> adapter;
    DatabaseHelper helper;
    int resource;
    private ArrayList<String>item=new ArrayList<>();

    public Adapter(@NonNull Context context, int resource, ArrayList<String> list) {
        super(context, resource);
        this.context=context;
        this.resource=resource;
        helper=new DatabaseHelper(context);
        db=helper.getWritableDatabase();
    }

    public View getView(int position, View convertView, ViewGroup parent)
    {
        String name=getItem(position).getName();
        String ingredients=getItem(position).getIngredients();
        String methods=getItem(position).getMethods();
        String time=getItem(position).getTime();

        LayoutInflater inflater=LayoutInflater.from(context);
        convertView=inflater.inflate(resource,parent,false);

        TextView t1=convertView.findViewById(R.id.t1);
        TextView t2=convertView.findViewById(R.id.t2);
        TextView t3=convertView.findViewById(R.id.t3);
        TextView t4=convertView.findViewById(R.id.t4);

        t1.setText(name);
        t2.setText(ingredients);
        t3.setText(methods);
        t4.setText(time);

        return convertView;
    }

}
