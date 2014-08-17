package com.example.yoshii.intelligentdatabase;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;

/**
 * Created by yoshii on 8/16/14.
 */
public class RecipeProvider extends ContentProvider{

    static final String PROVIDER_NAME = "com.example.yoshii.intelligentdatabase";
    static final String URL = "content://" + PROVIDER_NAME + "/friends";
    static final Uri CONTENT_URI = Uri.parse(URL);
    private SQLiteDatabase mDatabase;



    @Override
    public boolean onCreate() {
        Context context = getContext();
        recipedb mRecipe = new recipedb(context);

        mDatabase = mRecipe.getWritableDatabase();
        if(mDatabase == null)
            return false;
        else {
            return true;
        }
    }

    @Override
    public Cursor query(Uri uri, String[] strings, String s, String[] strings2, String s2) {
        return null;
    }

    @Override
    public String getType(Uri uri) {
        return null;
    }

    @Override
    public Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    @Override
    public int delete(Uri uri, String s, String[] strings) {
        return 0;
    }

    @Override
    public int update(Uri uri, ContentValues contentValues, String s, String[] strings) {
        return 0;
    }
}
