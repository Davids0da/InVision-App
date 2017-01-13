package com.example.david.invision;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper;

/**
 * Created by David on 1/12/17.
 */

public class BaseActivity extends AppCompatActivity {

    @Override
    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(CalligraphyContextWrapper.wrap(newBase));
    }

    public void startOverviewActivity(View view) {
        Intent a = new Intent(this, Overview.class);
        startActivity(a);
    }
    public void startHomeActivity(View view) {
        Intent i = new Intent(this, HomeActivity.class);
        startActivity(i);
    }
    public void startNavigationActivity(View view) {
        Intent c = new Intent(this, Navigation.class);
        startActivity(c);
    }
}