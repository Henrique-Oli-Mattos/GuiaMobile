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

public class Ciane extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ciane);
    }

    public void telefonar2(View v){
        Uri uri = Uri.parse("tel:(1533333333");
        Intent intent;
        intent = new Intent(Intent.ACTION_CALL,uri);

        int permissionCheck = ContextCompat.checkSelfPermission(this, Manifest.permission.CALL_PHONE);

        if (permissionCheck != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(this,new String[]{Manifest.permission.CALL_PHONE},1);
        } else {
            startActivity(intent);
        }
    }

    public void mapa2(View v) {
        Uri uri = Uri.parse("https://www.google.com/maps/place/Multiplex+P%C3%A1tio+Cian%C3%AA/@-23.4966834,-" +
                "47.460744,15z/data=!4m5!3m4!1s0x0:0xaff295d11a7bc0c6!8m2!3d-23.4966834!4d-47.460744");

        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }

    public void site2(View v){
        Uri uri = Uri.parse("https://www.patiociane.com.br/cinema.php");
        Intent intent = new Intent(Intent.ACTION_VIEW,uri);
        startActivity(intent);
    }
}