package com.example.smartrecipe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Itemdetails extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        TextView t1,t2,t3,t4;
        ImageView img;

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_itemdetails);

        t1=findViewById(R.id.t1);
        t2=findViewById(R.id.t2);
        t3=findViewById(R.id.t3);
        t4=findViewById(R.id.t4);
        img=findViewById(R.id.i1);

        Intent intent1=getIntent();
        String name=intent1.getStringExtra("name");
        String ingredients=intent1.getStringExtra("ingredients");
        String methods=intent1.getStringExtra("methods");
        String time=intent1.getStringExtra("time");

        t1.setText(name);
        t2.setText(ingredients);
        t3.setText(methods);
        t4.setText(time);

        switch(name)
        {
            case"Hydrabadi biryani":
                img.setImageResource(R.drawable.a1);
                break;
            case "Sindhi Biryani":img.setImageResource(R.drawable.a2);
                break;
            case "Bombai Biryani":img.setImageResource(R.drawable.a3);
                break;
            case "Kacchi Biryani":img.setImageResource(R.drawable.a4);
                break;
            case "Tahari Biryani":img.setImageResource(R.drawable.a5);
                break;
            case "Yakhni Palao":img.setImageResource(R.drawable.a6);
                break;
            case "Kabuli Palao":img.setImageResource(R.drawable.a7);
                break;
            case "Matar Palao":img.setImageResource(R.drawable.a8);
                break;
            case "Banu Beef Palao":img.setImageResource(R.drawable.a9);
                break;
            case "Vegetable Palao":img.setImageResource(R.drawable.a10);
                break;
            default:img.setImageResource(R.drawable.icon);
        }
    }
}

