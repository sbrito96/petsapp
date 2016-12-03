package com.example.android.pets.data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.android.pets.data.PetContract.PetsEntry;

/**
 * Created by Samuel Brito on 15/11/2016.
 */

public class PetsDbHelper extends SQLiteOpenHelper {

    public static final String DATABASE_NAME = "shelter.db";
    public static final int VERSION_DATABASE = 1;

    public PetsDbHelper(Context context) {
        super(context, DATABASE_NAME, null, VERSION_DATABASE);
    }


    @Override
    public void onCreate(SQLiteDatabase db) {

        //constant for the SQLite CREATE TABLE and Values statement
        String SQL_CREATE_PETS_TABLE = "CREATE TABLE " + PetsEntry.TABLE_NAME + "("
                + PetsEntry._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                + PetsEntry.COLUMN_PET_NAME + " TEXT NOT NULL,"
                + PetsEntry.COLUMN_PET_BREED + " TEXT, "
                + PetsEntry.COLUMN_PET_GENDER + " INTEGER NOT NULL, "
                + PetsEntry.COLUMN_PET_WEIGHT + " INTEGER NOT NULL DEFAULT 0);";

        // execute the create table statement
        db.execSQL(SQL_CREATE_PETS_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
