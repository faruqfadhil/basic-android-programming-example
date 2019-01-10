package com.example.faruq.educahomework;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.widget.CalendarView;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class activity_day3 extends AppCompatActivity {

    private Toolbar mToolbar;
    private TextView mTextTime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_day3);

        mToolbar = (Toolbar) findViewById(R.id.myToolbar);
        mTextTime = (TextView) findViewById(R.id.txtTime);
        setSupportActionBar(mToolbar);

        Calendar c = Calendar.getInstance();
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");

        String formatDate = df.format(c.getTime());
        mTextTime.setText(formatDate);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_appbar,menu);
        return  true;
    }
}
