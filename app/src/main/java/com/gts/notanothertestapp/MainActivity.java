package com.gts.notanothertestapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.gts.NotAnotherTestApp.R;
import com.urbanairship.UAirship;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        UAirship.shared().getPushManager().setUserNotificationsEnabled(true);

    }
}
