package com.sheygam.java_18_22_02_18;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    private static final String TAG = "MY_TAG";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Intent intent = getIntent();
        String name = intent.getStringExtra("NAME");
        Bundle extras = intent.getExtras();
        if(extras != null){
            String email = extras.getString("EMAIL","empty email");
            Log.d(TAG, "onCreate: " + name + " " + email);
        }

        TextView myTxt = findViewById(R.id.my_txt);
        myTxt.setText(name);
    }
}
