package com.example.david.invision;

import android.os.Bundle;
import android.widget.TextView;

import java.text.SimpleDateFormat;


public class Calendar extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendar);

        TextView i = (TextView) findViewById(R.id.calendarTextView);
        long date = System.currentTimeMillis();
        SimpleDateFormat sdf = new SimpleDateFormat("MMM dd yyyy");
        String dateString = sdf.format(date);
        i.setText(dateString);
    }
}

