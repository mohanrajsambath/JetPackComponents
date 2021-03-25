package com.mohan.viewmodellivedata;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

public class MainActivity extends AppCompatActivity {
    private String TAG =this.getClass().getSimpleName();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView mTVrandom = findViewById(R.id.tV_Number);
        //MainActivityViewModel mDataGenrator = new MainActivityViewModel();
        MainActivityViewModel mModelObj= new ViewModelProvider(this).get(MainActivityViewModel.class);
        String mRandomNumber = mModelObj.getRandomNumber();
        mTVrandom.setText(mRandomNumber);
        Log.i(TAG,"Random Number Set");
    }
}