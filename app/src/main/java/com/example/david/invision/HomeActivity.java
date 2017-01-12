package com.example.david.invision;

import android.os.Bundle;
import android.widget.TextView;

public class HomeActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        TextView tv = (TextView) findViewById(R.id.textViewHome);
        tv.setText("THURSDAY");

        TextView tv1 = (TextView) findViewById(R.id.homeTextView);
        tv1.setText("March 12");
    }
}
