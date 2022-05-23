package com.example.guiasorocaba;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class Sorocaba extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sorocaba);
    }

    public void telefonar3(View v){
        Uri uri = Uri.parse("tel:(1532322757");
        Intent intent;
        intent = new Intent(Intent.ACTION_CALL,uri);

        int permissionCheck = ContextCompat.checkSelfPermission(this, Manifest.permission.CALL_PHONE);

        if (permissionCheck != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(this,new String[]{Manifest.permission.CALL_PHONE},1);
        } else {
            startActivity(intent);
        }
    }

    public void mapa3(View v) {
        Uri uri = Uri.parse("https://www.google.com/maps/place/Sorocaba+Shopping/@-23.4965079,-47.4675713,15z/data=!4m2!3m1!1s0x0:0xfada" +
                "374de9d20940?sa=X&ved=2ahUKEwi6gaOm1PT3AhVsvJUCHXeEBq8Q_BJ6BAhpEAU");


        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }

    public void site3(View v){
        Uri uri = Uri.parse("https://sorocabashopping.com.br/cinema/");
        Intent intent = new Intent(Intent.ACTION_VIEW,uri);
        startActivity(intent);
    }
}