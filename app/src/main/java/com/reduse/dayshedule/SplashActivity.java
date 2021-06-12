package com.reduse.dayshedule;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;

public class SplashActivity extends AppCompatActivity {

   private final int SPLASH_DISPLAY_LENGTH = 5000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.splash_screen);

        new Handler().postDelayed(() -> {
            Intent mainIntent = new Intent(SplashActivity.this, MainActivity.class);
            SplashActivity.this.startActivity(mainIntent);
            SplashActivity.this.finish();
        }, SPLASH_DISPLAY_LENGTH);
    }
}