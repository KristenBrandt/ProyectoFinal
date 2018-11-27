package com.example.kristen.proyectofinal;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;

public class signup extends AppCompatActivity {
    // variables
    public Boolean yay = true;
    EditText et_username, et_Password;
    String username, password;
    Controlador db;

    //funciones
    private void checkLogin(){
        if (db.getInstance().getArray()!= null){
            for (Usuario usuario: db.getInstance().getArray()){
                System.out.println("HOLA");
                if (username.equals(usuario.getNombre())) {
                    showResult("Este usuario ya existe");
                    yay = false;
                }else yay =true;
            }
        }else yay = true;
    }

    public void showResult(String msg){
        AlertDialog alertDialog = new AlertDialog.Builder(this)
                .setTitle("Signup Status")
                .setMessage(msg)
                .setPositiveButton("", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                })
                .show();

    }

    public void createButton() {
        Button create = (Button) findViewById(R.id.create_button);
        create.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et_username = (EditText)findViewById(R.id.editText);
                et_Password = (EditText)findViewById(R.id.editText2);
                username = et_username.getText().toString();
                password = et_Password.getText().toString();
                System.out.println("Hola");
                checkLogin();
                if (yay == true){
                    Usuario usuario = new Usuario(username,password);
                    db.getInstance().addToArray(usuario);
                    Intent log = new Intent(signup.this, introapp.class);
                    startActivity(log);
                }
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

    //hace
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        createButton();
        existentButton();
    }
}
