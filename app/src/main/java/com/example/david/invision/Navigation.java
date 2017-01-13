package com.example.david.invision;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Navigation extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigation);
    }
    public void exitApplication(View v) {
        finish();
    }
}
