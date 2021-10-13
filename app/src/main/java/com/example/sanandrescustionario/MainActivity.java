package com.example.sanandrescustionario;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {

    private FloatingActionButton agregarCuestionario;
    private AlertDialog.Builder dialogBuilder;
    private AlertDialog dialog;
    private Button cHabitantesCalee, cLgbt, cGenero, cancelar;

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
        dialog = dialogBuilder.create();
        dialog.show();
    }
}