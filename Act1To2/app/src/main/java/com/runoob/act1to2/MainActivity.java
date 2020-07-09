package com.runoob.act1to2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        MyPresent myPresent = new MyPresent();
        myPresent.onCreate();
        setContentView(R.layout.activity_main);
        Button button1 = (Button) findViewById(R.id.bt1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Act1.class);
                startActivity(intent);
            }
    });
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
