package com.example.photofreecropofimage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
    }

    @Override
    protected  void onResume(){
        super.onResume();
        setContentView(new Someview(MainActivity.this));
    }

    private class Someview extends View {
        public Someview(MainActivity mainActivity) {
            super();
        }
    }
}