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

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

//heellll
    private ArrayList<String> mSelecetdItems = new ArrayList<>();

    public static final String SELECETD_ITEMS = "SELECETD_ITEMS";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


    public  void addtable(View v){
        this.mSelecetdItems.add("table");
        showSecondActivity();
    }
    public  void addchair(View v){
        this.mSelecetdItems.add("chair");
        showSecondActivity();
    }


    private void showSecondActivity()
    {
        Intent i = new Intent(this,Second.class);
        i.putStringArrayListExtra(SELECETD_ITEMS,this.mSelecetdItems);
        startActivity(i);
    }


    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        super.onSaveInstanceState(savedInstanceState);
        savedInstanceState.putStringArrayList(SELECETD_ITEMS , mSelecetdItems);
    }

    @Override
    public void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        this.mSelecetdItems = savedInstanceState.getStringArrayList(SELECETD_ITEMS);
    }


}