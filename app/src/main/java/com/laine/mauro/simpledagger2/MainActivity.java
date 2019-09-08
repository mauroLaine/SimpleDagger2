package com.laine.mauro.simpledagger2;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    private static final String LOGGER = "_MainActivity";

    @Inject
    SharedPreferences preferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ((SimpleDagger2Application) getApplication()).getApplicationComponent().inject(this);

        if (preferences != null) {
            Log.d(LOGGER, "preferences is not null");
        }

    }
}
