package com.mohan.viewmodellivedata;

import android.util.Log;

import java.util.Random;

public class MainActivityDataGenerator {
    private String TAG =this.getClass().getSimpleName();
    private String RandomNumber;

    public String getRandomNumber(){
        Log.i(TAG,"Get Number");
        if(RandomNumber==null){
            createNumber();
        }
        return RandomNumber;
    }

    private void createNumber() {
        Log.i(TAG,"Create New number");
        Random mRandom=new Random();
        RandomNumber = "Number:" + (mRandom.nextInt(100-1)+1);
    }


}
