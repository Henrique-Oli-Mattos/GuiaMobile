package com.example.guiasorocaba;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void button (View v){
        Intent intent = new Intent(this, Iguatemi.class);
        startActivity(intent);
    }
    public void button2 (View v){
        Intent intent = new Intent(this, Ciane.class);
        startActivity(intent);
    }
    public void button3 (View v){
        Intent intent = new Intent(this, Sorocaba.class);
        startActivity(intent);
    }
}