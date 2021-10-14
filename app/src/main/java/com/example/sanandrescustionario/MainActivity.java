package com.example.sanandrescustionario;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {

    private FloatingActionButton agregarCuestionario;
    private AlertDialog.Builder dialogBuilder;
    private AlertDialog dialog;
    private Button cHabitantesCalle, cLgbt, cGenero, cancelar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inicializarComponentes();
        eventoAgregarCuestionario();
    }

    private void inicializarComponentes(){
        agregarCuestionario = findViewById(R.id.agregarCuestionario);
    }

    public void eventoAgregarCuestionario()
    {
        agregarCuestionario.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                alertDialogCrearCuestionario();
            }
        });
    }

    public void alertDialogCrearCuestionario()
    {
        dialogBuilder = new AlertDialog.Builder(this);
        final View crearCuestionarioView = getLayoutInflater().inflate(R.layout.crear_cuestionario, null);
        dialogBuilder.setView(crearCuestionarioView);
        cancelar = (Button) crearCuestionarioView.findViewById(R.id.cancelar_crear_cuestionario);
        dialog = dialogBuilder.create();
        dialog.show();
        cancelarCrearCuestionario(cancelar);
    }

    public void cancelarCrearCuestionario(Button cancelar)
    {
        cancelar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.cancel();
            }
        });
    }

    public void irCuestionarioHCalle(View view)
    {
        Intent hCalle = new Intent(this, HabitantesCalle.class);
        startActivity(hCalle);
        dialog.cancel();
    }
}