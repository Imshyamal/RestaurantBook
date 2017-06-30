package com.andiroot.restaurantbook;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.ImageView;
import android.support.v7.widget.LinearLayoutCompat;
import android.widget.RelativeLayout;

import java.util.ArrayList;

public class Second extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Toolbar toolbar = (Toolbar) findViewById(R.id.second_toolbar);
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


        ArrayList<String> selecetdItems = i.getStringArrayListExtra(MainActivity.SELECETD_ITEMS);
        for (String selecetdItem : selecetdItems) {
            if (selecetdItem.equals("table")) {
                addImageView(R.drawable.table, hall);
            } else if (selecetdItem.equals("chair")) {
                addImageView2(R.drawable.chair2, hall);
            }
        }


    }

    private void addImageView(int imageRes, LinearLayoutCompat hall) {
        ImageView iv = new ImageView(this);
        iv.setImageResource(imageRes);
        iv.setLayoutParams(new android.view.ViewGroup.LayoutParams(250, 250));
        iv.setMaxHeight(180);
        iv.setMaxWidth(120);
        iv.setPadding(15,15,0,0);
        hall.addView(iv);
    }

    private void addImageView2(int imageRes, LinearLayoutCompat hall) {
        ImageView iv2 = new ImageView(this);
        iv2.setImageResource(imageRes);
        iv2.setLayoutParams(new android.view.ViewGroup.LayoutParams(150, 150));
        iv2.setMaxHeight(30);
        iv2.setMaxWidth(30);

        iv2.setPadding(25,0,0,0);
        hall.addView(iv2);
    }

}