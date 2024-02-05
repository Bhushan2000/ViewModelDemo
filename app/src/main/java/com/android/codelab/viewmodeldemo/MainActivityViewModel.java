package com.android.codelab.viewmodeldemo;

import android.util.Log;

import androidx.lifecycle.ViewModel;

import java.util.Random;






// Generate random using viewModel

public class MainActivityViewModel extends ViewModel {
    private String TAG = "MainActivityDataGenerator";
    private String myRandomNumber;

    public String getNumber() {
        Log.i(TAG, "getNumber: get number");
        if (myRandomNumber == null) {
            createdNumber();
        }
        return myRandomNumber;
    }

    public void createdNumber() {
        Log.i(TAG, "createdNumber: created new randomNumber");
        Random random = new Random();
        myRandomNumber = "Number: " + (random.nextInt(10 - 1) + 1);
        // give 1 to 10 random no

    }

    // We have seen viewModel is destroyed in onCleared method
    // It is destroyed when the created activity is completely destroyed


    @Override
    protected void onCleared() {
        super.onCleared();
        Log.i(TAG, "onCleared: ViewModel Destroyed");
    }
}