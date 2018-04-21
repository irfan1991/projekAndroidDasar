package com.bagicode.www.navigationscreen;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class ScrollingActivityLogin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scrolling_login);
    }

    public void goAktivityRegister (View v){
        Intent goAktivityRegister = new Intent(ScrollingActivityLogin.this, ScrollingActivityRegister.class);
        startActivity(goAktivityRegister);
    }

    public void goAktivityUtama (View v){
        Intent goAktivityUtama = new Intent(ScrollingActivityLogin.this, MainActivity.class);
        startActivity(goAktivityUtama);
        finish();
    }

}
