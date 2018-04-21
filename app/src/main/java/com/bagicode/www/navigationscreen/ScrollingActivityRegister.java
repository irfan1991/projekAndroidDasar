package com.bagicode.www.navigationscreen;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class ScrollingActivityRegister extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scrolling_register);
    }

    public void goAktivityUtamaReg (View v){
        Intent goAktivityUtama = new Intent(ScrollingActivityRegister.this, MainActivity.class);
        startActivity(goAktivityUtama);
        finish();
    }

}
