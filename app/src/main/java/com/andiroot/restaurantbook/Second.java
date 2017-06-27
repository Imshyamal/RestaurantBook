package com.andiroot.restaurantbook;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.support.v7.widget.LinearLayoutCompat;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

public class Second extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Toolbar toolbar = (Toolbar)findViewById(R.id.second_toolbar);
        setSupportActionBar(toolbar);
        ActionBar ab = getSupportActionBar();
        ab.setDisplayHomeAsUpEnabled(true);

        /*toolbar.setNavigationIcon((R.drawable.back_arrow));

        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });*/


        LinearLayoutCompat hall = (LinearLayoutCompat) findViewById(R.id.hall_layout);
        Intent i = getIntent();
        int x = i.getIntExtra("table",0);
        int y = i.getIntExtra("chair",0);
        if (x==1) {
            ImageView iv = new ImageView(this);
            iv.setImageResource(R.drawable.table);
            iv.setLayoutParams(new android.view.ViewGroup.LayoutParams(200,200));
            iv.setMaxHeight(120);
            iv.setMaxWidth(120);
            hall.addView(iv);
        }
        if (y==1) {
            ImageView iv = new ImageView(this);
            iv.setImageResource(R.drawable.chair);
            iv.setLayoutParams(new android.view.ViewGroup.LayoutParams(200,200));
            iv.setMaxHeight(120);
            iv.setMaxWidth(120);
            hall.addView(iv);
        }
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
    }
}
