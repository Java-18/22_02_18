package com.sheygam.java_18_22_02_18;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    private static final String TAG = "MY_TAG";
    private Button mySecondBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mySecondBtn = findViewById(R.id.my_second_btn);
        mySecondBtn.setOnClickListener(this);
    }

    public void myBtnClick(View v){
        Log.d("MY_TAG","My btn clicked!");
    }

    @Override
    public void onClick(View v) {
        EditText inputName = findViewById(R.id.input_name);
//        String name = String.valueOf(inputName.getText());
        String name = inputName.getText().toString();
        Intent intent = new Intent(this,SecondActivity.class);
        intent.putExtra("NAME",name);
        intent.putExtra("EMAIL","greg@mail.com");
        startActivity(intent);
        Log.d(TAG, "onClick: ");
    }
}
