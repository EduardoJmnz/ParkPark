package com.example.eddyh.parkpark;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText boleta;
    EditText contra;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void ingresar(){
       boleta = (EditText)findViewById(R.id.boleta);
       contra= (EditText)findViewById(R.id.password);
        String bol = boleta.getText().toString();
        String pass = contra.getText().toString();
        validaciones(bol, pass);
    }

    public void validaciones(String bol, String pass){
        if(bol =="2016601595" && pass == "123456"){
                Toast.makeText(this, "Bienvenido a UPIICSApark", Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(this, "Usuario y contrasea incorrectos", Toast.LENGTH_LONG).show();
        }
    }
    public void registrarse(View sender){
        Intent intent = new Intent(this, Registro.class);
        startActivity(intent);
    }
}
