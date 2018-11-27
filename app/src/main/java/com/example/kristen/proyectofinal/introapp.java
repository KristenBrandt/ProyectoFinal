package com.example.kristen.proyectofinal;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class introapp extends AppCompatActivity {
    public Boolean yay = false;
    EditText et_username, et_Password;
    String username, password;
    Controlador db;

    private void checkLogin(){
        if (db.getInstance().getArray()!= null){
            for (Usuario usuario: db.getInstance().getArray()){
                System.out.println("HOLA");
                if (username.equals(usuario.getNombre()) && password.equals(usuario.getContrasena())) {
                    db.getInstance().setUsuario(usuario);
                    yay = true;
                }
            }
        }
    }

    public void showResult(String msg){
        AlertDialog alertDialog = new AlertDialog.Builder(this)
                .setTitle("Login Status")
                .setMessage(msg)
                .setPositiveButton("", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                })
                .show();

    }

    public void logButton() {
        Button log = (Button) findViewById(R.id.log_button);
        log.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et_username = (EditText)findViewById(R.id.username_button);
                et_Password = (EditText)findViewById(R.id.password_button);
                username = et_username.getText().toString();
                password = et_Password.getText().toString();
                System.out.println("Hola");
                checkLogin();
                System.out.println("pony");
                if (yay == true){
                    Intent doit = new Intent(introapp.this, menu.class);
                    startActivity(doit);
                }
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
