package com.coolweather.app.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by fengkun on 2016/3/8.
 */
public class CoolWeatherOpenHelper extends SQLiteOpenHelper{
    /**
     * Province表建表语句
     */
    public static final String CREATE_PROVINCE = "create table Province("
            +"id integer primary key autoincrement,"
            +"province_name text,"
            +"province_code text";

    /**
     * City建表语句
     */
    public static final String CREATE_CITY = "create table city"
            +"id integer primary key autoincrement,"
            +"city_name text,"
            +"city_code text"
            +"province_id integer";

    /**
     *County建表语句
     */
    public static final  String CREATE_COUNTY = "create table county"
            +"id integer primary key autoincrement,"
            +"county_name text,"
            +"county_code text"
            +"city_id integer";

    public CoolWeatherOpenHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version){
        super(context, name, factory, version);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL(CREATE_PROVINCE);
        db.execSQL(CREATE_CITY);
        db.execSQL(CREATE_COUNTY);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

    }
}
