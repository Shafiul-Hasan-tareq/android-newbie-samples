package com.android.developer;

import android.app.Activity;
import android.os.Bundle;
import android.content.Intent;

import com.android.developer.develop.apiguides.appcomponents.activities.activities.MainActivitySample;


public class LauncherActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launcher);
        gotoNextActivity(MainActivitySample.class);
    }

    //Will rewrite the activity name
    private void gotoNextActivity(Class<?> cls){
        Intent nextActivity = new Intent(this,cls);
        startActivity(nextActivity);
    }

}
