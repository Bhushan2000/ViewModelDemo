package com.android.codelab.viewmodeldemo;

import android.util.Log;

import androidx.lifecycle.ViewModel;

import java.util.Random;



// Generate random no without using viewModel

public class MainActivityDataGenerator {
    private String TAG = "MainActivityDataGenerator";
    private String myRandomNumber;

    public String getNumber() {
        Log.i(TAG, "getNumber: get number");
        if (myRandomNumber == null){
            createdNumber();
        }
        return myRandomNumber;
    }

    public void createdNumber() {
        Log.i(TAG, "createdNumber: created new randomNumber");
        Random random = new Random();
        myRandomNumber = "Number: "+ (random.nextInt(10-1) + 1);
        // give 1 to 10 random no

    }
}



