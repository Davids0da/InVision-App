package com.example.david.invision;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SignIn extends BaseActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
    }
    public void startHomeActivity(View view){
        Intent i = new Intent(this,HomeActivity.class);
        startActivity(i);
    }
}
