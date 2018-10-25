package com.example.kristen.proyectofinal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class menu extends AppCompatActivity {
    public void perfilButton() {
        Button perfil = (Button) findViewById(R.id.perfil_button);
        perfil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent log = new Intent(menu.this, Perfil.class);
                startActivity(log);
            }
        });
    }
    public void websiteButton() {
        Button website = (Button) findViewById(R.id.sitios_button);
        website.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent log = new Intent(menu.this, sitios.class);
                startActivity(log);
            }
        });
    }
    public void saludButton() {
        Button salud = (Button) findViewById(R.id.salud_button);
        salud.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent log = new Intent(menu.this, health.class);
                startActivity(log);
            }
        });
    }
    public void notificationButton() {
        Button notification = (Button) findViewById(R.id.notificaciones_button);
        notification.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent log = new Intent(menu.this, notificacion.class);
                startActivity(log);
            }
        });
    }
    public void creditsButton() {
        Button credits = (Button) findViewById(R.id.creditos_button);
        credits.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent log = new Intent(menu.this, creditos.class);
                startActivity(log);
            }
        });
    }
    public void logoffButton() {
        Button logg = (Button) findViewById(R.id.logoff_button);
        logg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent log = new Intent(menu.this,MainActivity.class);
                startActivity(log);
            }
        });
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        perfilButton();
        websiteButton();
        saludButton();
        notificationButton();
        creditsButton();
        logoffButton();
    }
}
