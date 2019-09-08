package com.laine.mauro.simpledagger2;

import android.app.Application;
import android.util.Log;

public class SimpleDagger2Application extends Application {

    private static final String LOGGER = "_SimpleDagger2App";
    private ApplicationComponent applicationComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        Log.d(LOGGER, "onCreate");

        applicationComponent = DaggerApplicationComponent
                .builder()
                .applicationModule(new ApplicationModule(this))
                .build();
    }

    public ApplicationComponent getApplicationComponent() {
        return applicationComponent;
    }
}
