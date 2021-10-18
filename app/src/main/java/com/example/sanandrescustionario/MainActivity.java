package com.example.sanandrescustionario;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.sanandrescustionario.Manager.MHabitantesCalles;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {

    private FloatingActionButton agregarCuestionario;
    private AlertDialog.Builder dialogBuilder;
    private AlertDialog dialog;
    private Button cancelar;
    private MHabitantesCalles managerHabitantes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        managerHabitantes = new MHabitantesCalles(this);
        inicializarComponentes();
        eventoAgregarCuestionario();
        obtenerHabitantesEncustados();
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

    public void irCuestionarioGenero(View view)
    {
        Intent genero = new Intent(this, Genero.class);
        startActivity(genero);
        dialog.cancel();
    }

    private void obtenerHabitantesEncustados()
    {

        managerHabitantes.open();
        Cursor cursor = managerHabitantes.getHabitante();
        TextView encuestados = (TextView) findViewById(R.id.numeroHabitantesEncuestadosM);
        encuestados.setText(cursor.getCount()+"");

    }
}