package com.example.eddyh.parkpark;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Registro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);


    }

    public void registrar(){

    }
    public void cancelar(View sender){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
