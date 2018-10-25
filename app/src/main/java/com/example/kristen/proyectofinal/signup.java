package com.example.kristen.proyectofinal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class signup extends AppCompatActivity {
    public void createButton() {
        Button create = (Button) findViewById(R.id.create_button);
        create.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent log = new Intent(signup.this, introapp.class);
                startActivity(log);
            }
        });
    }
    public void existentButton() {
        Button existent = (Button) findViewById(R.id.account_button);
        existent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent log = new Intent(signup.this, introapp.class);
                startActivity(log);
            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        createButton();
        existentButton();
    }
}
