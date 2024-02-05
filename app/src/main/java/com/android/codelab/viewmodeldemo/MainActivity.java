package com.android.codelab.viewmodeldemo;

import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.util.Log;
import android.view.View;
import android.widget.TextView;

import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.android.codelab.viewmodeldemo.databinding.ActivityMainBinding;

import static android.content.ContentValues.TAG;

public class MainActivity extends AppCompatActivity {

     private ActivityMainBinding binding;
    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setSupportActionBar(binding.toolbar);


        binding.fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        TextView randomNoTextView = findViewById(R.id.tvNumber);

        // not using viewModel
//        MainActivityDataGenerator generator = new MainActivityDataGenerator();
//        randomNoTextView.setText(generator.getNumber());
//        Log.i(TAG, "onCreate: random no set");


        // using viewModel
        MainActivityViewModel modelProvider = new ViewModelProvider(MainActivity.this).get(MainActivityViewModel.class);
        // while we create object of MainActivityDataGenerator class we will do this using ViewModelProvider
        randomNoTextView.setText(modelProvider.getNumber());
        Log.i(TAG, "onCreate: random no set");


    }


}