package com.example.david.invision;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.text.SimpleDateFormat;

public class HomeActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        TextView tv = (TextView) findViewById(R.id.textViewHome);
        TextView tv1 = (TextView) findViewById(R.id.homeTextView);

        long date = System.currentTimeMillis();
        SimpleDateFormat sdf = new SimpleDateFormat("MMM dd");
        String dateString = sdf.format(date);
        tv1.setText(dateString);
        SimpleDateFormat sdf1 = new SimpleDateFormat("EEEE");
        String dateString1 = sdf1.format(date);
        tv.setText(dateString1);
    }

    public void startCalendarActivity(View view) {
        Intent i = new Intent(this, Calendar.class);
        startActivity(i);
    }
}
