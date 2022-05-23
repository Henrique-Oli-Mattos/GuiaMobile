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

public class Iguatemi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iguatemi);
    }

    public void telefonar1(View v){
        Uri uri = Uri.parse("tel:(1530421400");
        Intent intent;
        intent = new Intent(Intent.ACTION_CALL,uri);

        int permissionCheck = ContextCompat.checkSelfPermission(this, Manifest.permission.CALL_PHONE);

        if (permissionCheck != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(this,new String[]{Manifest.permission.CALL_PHONE},1);
        } else {
            startActivity(intent);
        }
    }

    public void mapa1(View v) {
        Uri uri = Uri.parse("https://www.google.com/search?q=cinema%20iguatemi%20sorocaba&oq=cinema+iguatemi+sorocaba&aqs=chrome.0.69i59j0i512l2j46i175i199i512j0i512l6." +
                "1623j0j7&sourceid=chrome&ie=UTF-8&tbs=lf:1,lf_ui:2&tbm=lcl&rflfq=1&num=10&rldimm=14363539732172244806&lqi=ChhjaW5lbWEgaWd1YXRlbWkgc29yb2NhYmFIqOjl_fqVg" +
                "IAIWigQABgAGAEYAiIYY2luZW1hIGlndWF0ZW1pIHNvcm9jYWJhKgQIAxAAkgENbW92aWVfdGhlYXRlcpoBI0NoWkRTVWhOTUc5blMwVkpRMEZuU1VSSk0wNTZRMDFSRUFF&ved=2ahUKEwiH3_Hevf" +
                "T3AhWLCbkGHfiQBWwQvS56BAgOEAE&sa=X&rlst=f#rlfi=hd:;si:14363539732172244806,l,ChhjaW5lbWEgaWd1YXRlbWkgc29yb2NhYmFIqOjl_fqVgIAIWigQABgAGAEYAiIYY2luZW1hIG" +
                "lndWF0ZW1pIHNvcm9jYWJhKgQIAxAAkgENbW92aWVfdGhlYXRlcpoBI0NoWkRTVWhOTUc5blMwVkpRMEZuU1VSSk0wNTZRMDFSRUFF;mv:[[-23.533550200000004,-47.463429],[-23.5356223" +
                "99999998,-47.4636979]];tbs:lrf:!1m4!1u2!2m2!2m1!1e1!2m1!1e2!3sIAE,lf:1,lf_ui:2");

        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }

    public void site1(View v){
        Uri uri = Uri.parse("https://www.cinepolis.com.br/programacao/sorocaba/36.html");
        Intent intent = new Intent(Intent.ACTION_VIEW,uri);
        startActivity(intent);
    }


}