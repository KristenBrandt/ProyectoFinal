package com.example.kristen.proyectofinal;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import android.widget.EditText;

import java.io.IOException;

//Botton para hacer log in
public class MainActivity extends AppCompatActivity {
    public void firstButton() {
        Button login = (Button) findViewById(R.id.login_button);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent log = new Intent(MainActivity.this, LoginActivity.class);
                startActivity(log);
            }
        });
    }
// Botton para hacer sign in
    public void secondButton() {
        Button sign = (Button) findViewById(R.id.signin_button);
        sign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent log = new Intent(MainActivity.this, SignInActivity.class);
                startActivity(log);
            }
        });
    }


    @Override
        protected void onCreate (Bundle savedInstanceState){
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            firstButton();
            secondButton();
        }
}





