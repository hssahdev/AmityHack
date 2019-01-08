package com.xander.android.amity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class StartActivity extends AppCompatActivity {

    private SharedPreferences sharedPreferences;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        sharedPreferences=getSharedPreferences("PREF",MODE_PRIVATE);

        if(sharedPreferences.getBoolean("travelstart",true)){
            sharedPreferences.edit().putBoolean("travelstart",false).apply();
        }else{
            startActivity(new Intent(StartActivity.this,FinishActivity.class));
        }
    }
}
