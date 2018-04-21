package com.bagicode.www.navigationscreen;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainSplash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_splash);
    }

    public void goAktivityLogin (View v){
        Intent goAktivityLogin = new Intent(MainSplash.this, ScrollingActivityLogin.class);
        startActivity(goAktivityLogin);
        finish();
    }
}
