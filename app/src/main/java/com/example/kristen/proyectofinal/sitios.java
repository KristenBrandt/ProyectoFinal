package com.example.kristen.proyectofinal;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;

public class sitios extends AppCompatActivity {
    public void purinaButton() {
        Button website = findViewById(R.id.purina);
        website.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent purina = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.purina-latam.com/cam/gt/homepage.html"));
                startActivity(purina);
            }
        });
    }

    public void marcasButton() {
        Button website = findViewById(R.id.marcascom);
        website.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mar = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.petsmart.com/dog/food/"));
                startActivity(mar);
            }
        });
    }

    public void arcaButton() {
        Button website = findViewById(R.id.arcan);
        website.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent arc = new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.arcadenoe.com.gt/"));
                startActivity(arc);
            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sitios);
        purinaButton();
        marcasButton();
        arcaButton();

    }}


