package com.xander.android.amity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class FinishActivity extends AppCompatActivity {

    private SharedPreferences sharedPreferences;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finish);

        sharedPreferences=getSharedPreferences("PREF",MODE_PRIVATE);

        sharedPreferences.edit().putBoolean("travelstart",true).apply();

    }
}
