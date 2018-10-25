package com.example.kristen.proyectofinal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class introapp extends AppCompatActivity {
    public void logButton() {
        Button log = (Button) findViewById(R.id.log_button);
        log.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent log = new Intent(introapp.this, menu.class);
                startActivity(log);
            }
        });
    }
    public void signButton() {
        Button sign = (Button) findViewById(R.id.sign_button);
        sign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent log = new Intent(introapp.this, signup.class);
                startActivity(log);
            }
        });
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_introapp);
        logButton();
        signButton();
    }
}
