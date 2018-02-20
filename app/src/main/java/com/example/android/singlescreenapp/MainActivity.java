package com.example.android.singlescreenapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void contact_menu (View view) {
        Button udacity = findViewById(R.id.udacity);
        LinearLayout contact_menu = findViewById(R.id.contact);

        if (contact_menu.isShown()){
            contact_menu.setVisibility(View.INVISIBLE);
            udacity.setBackgroundResource(R.drawable.udacity_cloud);
        }else{
            contact_menu.setVisibility(View.VISIBLE);
            udacity.setBackgroundResource(R.drawable.udacity_cloud_back);
        }
    }

    public void mail(View view) {

        Intent intent = new Intent(Intent.ACTION_SENDTO);
        intent.setData(Uri.parse("mailto:" + "support@udacity.com"));
        startActivity(intent);

    }

    public void facebook(View view) {
        String url = "https://www.facebook.com/Udacity";
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(url));
        startActivity(intent);

    }

    public void call(View view) {
        String number = "7777777777";
        Uri call = Uri.parse("tel:" + number);
        Intent intent = new Intent(Intent.ACTION_DIAL, call);
        startActivity(intent);

    }
}

