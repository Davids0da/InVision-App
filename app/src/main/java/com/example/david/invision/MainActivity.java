package com.example.david.invision;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tv = (TextView) findViewById(R.id.TextView01);
        tv.setText("Welcome, Paul!");
    }

    public void startNewAccountActivity(View view) {
        Intent intent = new Intent(this, NewAccount.class);
        startActivity(intent);
    }

    public void startSignInActivity(View view) {
        Intent intent = new Intent(this, SignIn.class);
        startActivity(intent);
    }
}
