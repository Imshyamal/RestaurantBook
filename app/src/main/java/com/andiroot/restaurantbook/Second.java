package com.andiroot.restaurantbook;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.ImageView;
import android.support.v7.widget.LinearLayoutCompat;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

public class Second extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Toolbar toolbar=(Toolbar)findViewById(R.id.second_toolbar);
        setSupportActionBar(toolbar);


        LinearLayoutCompat hall = (LinearLayoutCompat) findViewById(R.id.hall_layout);
        Intent i = getIntent();
        int x = i.getIntExtra("table",0);
        if (x==1) {
            ImageView iv = new ImageView(this);
            iv.setImageResource(R.drawable.table);
            iv.setMaxHeight(100);
            iv.setMaxWidth(100);
            hall.addView(iv);

        }

    }
}
