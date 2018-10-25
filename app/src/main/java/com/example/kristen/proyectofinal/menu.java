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
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }
}
