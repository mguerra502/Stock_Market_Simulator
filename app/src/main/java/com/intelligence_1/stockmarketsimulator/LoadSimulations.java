package com.intelligence_1.stockmarketsimulator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class LoadSimulations extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_load_simulations);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}