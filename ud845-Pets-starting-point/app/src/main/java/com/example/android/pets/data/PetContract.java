package com.example.android.pets.data;

import android.net.Uri;
import android.provider.BaseColumns;

/**
 * Created by Samuel Brito on 13/11/2016.
 */

public final class PetContract {


    // content authority for the URI use
    public static final String CONTENT_AUTHORITY = "com.example.android.pets";

    // constant for the  whole URI
    // concatenates the scheme content:// with the content authority
    public static final Uri BASE_CONTENT_URI = Uri.parse("content://" + CONTENT_AUTHORITY);

    // store the path of the tables that will use the URI
    public static final String PATH_PETS = "pets";

    private PetContract(){}
    /* Inner class that defines the table contents of the pets table */
    public static final class PetsEntry implements BaseColumns {

        // constants for the table name, columns and gender types
        public static final String TABLE_NAME = "pets";
        public static final String _ID = BaseColumns._ID;
        public static final String COLUMN_PET_NAME = "name";
        public static final String COLUMN_PET_BREED = "breed";
        public static final String COLUMN_PET_GENDER = "gender";
        public static final String COLUMN_PET_WEIGHT = "weight";
        public static final int GENDER_MALE = 1;
        public static final int GENDER_FEMALE = 2;
        public static final int GENDER_UNKNOW = 0;


        /**
         * we create a full URI for the class as a constant called CONTENT_URI
         * The Uri.withAppendedPath() method appends the BASE_CONTENT_URI
         * (which contains the scheme and the content authority) to the path segment.
         */
        public static final Uri CONTENT_URI = Uri.withAppendedPath(BASE_CONTENT_URI, PATH_PETS);
    }
}
