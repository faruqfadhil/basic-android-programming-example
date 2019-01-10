package com.example.faruq.educahomework;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void toDay1(View vew){
        Intent intent = new Intent(MainActivity.this,Day1Activity.class);
        startActivity(intent);
    }
    public void toDay2(View vew){
        Intent intent = new Intent(MainActivity.this,Day2Activity.class);
        startActivity(intent);
    }
    public void toDay3(View view){
        Intent intent = new Intent(MainActivity.this, Day3DrawerActivity.class);
        startActivity(intent);
    }

}
