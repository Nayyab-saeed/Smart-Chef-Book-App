package com.example.smartrecipe;

import android.provider.BaseColumns;

public final class DatabaseContract
{
    public DatabaseContract()
    {

    }
    public static abstract class details implements BaseColumns
    {
        public static final String TABLE_NAME = "RECIPE DETAILS";
        public static final String COL_ID="recipe ID";
        public static final String COL_NAME = "recipe name";
        public static final String COL_INGREDIENT ="ingredients";
        public static final String COL_METHOD= "methods";
        public static final String COL_TIME = "time";

    }
}
