package com.example.sanandrescustionario;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.sanandrescustionario.Manager.DBmanagerPoblacionLGBTIQ;

public class poblacionLGBTIQ extends AppCompatActivity {

    private DBmanagerPoblacionLGBTIQ dbManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cuestionario_poblacion_lgbtiq);
        //dbManager = new DBManagerComunidadLgbt(getApplicationContext(), "Cuestionario_SanAndres", null, 1);
        dbManager = new DBmanagerPoblacionLGBTIQ(this);
    }
}
