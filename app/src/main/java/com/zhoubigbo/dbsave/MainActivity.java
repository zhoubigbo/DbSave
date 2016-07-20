package com.zhoubigbo.dbsave;

import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.zhoubigbo.dbsave.db.DBHelper;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DBHelper dbHelper = new DBHelper(getApplicationContext(), "Test.DB", null, 1);
        SQLiteDatabase sd = dbHelper.getWritableDatabase();
    }
}
