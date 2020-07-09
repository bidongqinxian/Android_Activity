package com.runoob.act1to2;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class Act1 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act1);
    }
    @Override
    protected void onStart(){
        super.onStart();
        MyPresent myPresent = new MyPresent();

        myPresent.onStart();
    }

    @Override
    protected void onResume(){
        super.onResume();
        MyPresent myPresent = new MyPresent();
        myPresent.onResume();

    }

    @Override
    protected void onPause(){
        super.onPause();
        MyPresent myPresent = new MyPresent();
        myPresent.onPause();
    }
    protected void onStop() {
        super.onStop();
        MyPresent myPresent = new MyPresent();
        myPresent.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        MyPresent myPresent = new MyPresent();
        myPresent.onDestory();
    }
}
