package com.example.faruq.educahomework;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Day2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_day2);


    }
    public void toLogin(View view){
        Intent intent = new Intent(Day2Activity.this,Day2RegisterActivity.class);
        startActivity(intent);
    }
}
