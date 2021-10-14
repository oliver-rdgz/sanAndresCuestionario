package com.example.sanandrescustionario;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class HabitantesCalle extends AppCompatActivity {

    private LinearLayout vistaUno;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_habitantes_calle);
        vistaUno.setVisibility(View.INVISIBLE);
    }

}