package com.mohan.viewmodellivedata;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

public class MainActivity extends AppCompatActivity {
    private String TAG =this.getClass().getSimpleName();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView mTVrandom = findViewById(R.id.tV_Number);
        Button mBtnRandom =findViewById(R.id.button);
        //MainActivityViewModel mDataGenrator = new MainActivityViewModel();
        MainActivityViewModel mModelObj= new ViewModelProvider(this).get(MainActivityViewModel.class);
        LiveData<String> mRandomNumber = mModelObj.getRandomNumber();
        mRandomNumber.observe(this, new Observer<String>() {
            @Override
            public void onChanged(String s) {

                mTVrandom.setText(s);
            }
        });
        mBtnRandom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mModelObj.createNumber();
            }
        });
        Log.i(TAG,"Random Number Set");
    }
}