package com.example.marion.streamingapi;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{


    private String TAG = "MainActivity";
    private Button start;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        start =(Button) findViewById(R.id.buttonStart);
        start.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        if(v==start){
            startActivity(new Intent(MainActivity.this,StreamingActivity.class));
        }
    }

    public void share(){

    }





}
