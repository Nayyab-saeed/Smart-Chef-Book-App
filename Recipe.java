package com.example.smartrecipe;

import java.util.ArrayList;

public class Recipe
{
    String name;
    String ingredients;
    String methods;
    String time;

    private ArrayList<String> items=null;

    public Recipe(String n, String i,String m, String t)
    {
        name=n;
        methods=m;
        ingredients=i;
        time=t;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name=name;
    }

    public String getIngredients()
    { return  ingredients;}

    public void setIngredients(String ingredients){
        this.ingredients=ingredients;
    }

    public String getMethods()
    {return methods;}

    public void setMethods(String methods)
    {
        this.methods=methods;
    }

    public String getTime(){
        return time;
    }

    public void setTime(String time)
    {
        this.time=time;
    }
}

