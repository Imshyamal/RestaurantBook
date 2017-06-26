package com.andiroot.restaurantbook;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.text.Layout;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Toolbar toolbar=(Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


    }
    public  void addtable(View v){
        Intent i = new Intent(this,Second.class);
        i.putExtra("table",1);
        startActivity(i);
    }
    public  void addchair(View v){
        Intent i = new Intent(this,Second.class);
        i.putExtra("chair",1);
        startActivity(i);
    }

    }

