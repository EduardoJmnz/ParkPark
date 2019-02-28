package com.example.eddyh.parkpark;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Registro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);


    }

    public void registrar(){
        String user = ((EditText)findViewById(R.id.user)).getText().toString(); //BOLETA
        String nombre = ((EditText)findViewById(R.id.Nombre)).getText().toString();
        String pass1 = ((EditText)findViewById(R.id.password)).getText().toString();
        String pass2 =  ((EditText)findViewById(R.id.confirmarPass)).getText().toString();

        if(user != ""  && nombre != "" && pass1 == pass2){
            Toast.makeText(this,"Usuario registrado, espera por validación de datos por parte de Subdirección Escolar", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        }else{
            Toast.makeText(this,"Aún faltan campos por llenar", Toast.LENGTH_SHORT).show();

        }

    }
    public void cancelar(View sender){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
