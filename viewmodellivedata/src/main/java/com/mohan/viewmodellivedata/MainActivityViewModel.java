package com.mohan.viewmodellivedata;

import android.util.Log;

import androidx.lifecycle.ViewModel;

import java.util.Random;

public class MainActivityViewModel extends ViewModel {
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

    @Override
    protected void onCleared() {
        super.onCleared();
        Log.i(TAG,"Cleared View Model");
    }
}
