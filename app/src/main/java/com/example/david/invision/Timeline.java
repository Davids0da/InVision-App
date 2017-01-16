package com.example.david.invision;

import android.os.Bundle;
import android.widget.TextView;

import java.text.SimpleDateFormat;

public class Timeline extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_timeline);

        TextView a = (TextView) findViewById(R.id.timeline_textview);
        long date = System.currentTimeMillis();
        SimpleDateFormat sdf = new SimpleDateFormat("MMMM");
        String dateString = sdf.format(date);
        a.setText(dateString);
    }
}
