package com.example.sanandrescustionario;

import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.sanandrescustionario.Manager.MHabitantesCalles;
import com.example.sanandrescustionario.usuarios.HabitantesCalles;

public class HabitantesCalle extends AppCompatActivity {

    private MHabitantesCalles managerHabitantes;
    public Button agregarHabitante;
    public Spinner sexo;
    HabitantesCalles hc = new HabitantesCalles();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_habitantes_calle);

        managerHabitantes = new MHabitantesCalles(this);
        agregarHabitante = (Button) findViewById(R.id.guardarFormH);
        spinnerSexo();
    }

    public void  crearHabitanteCalles(View view)
    {
        HabitantesCalles hc = new HabitantesCalles();
        if(view.getId() == R.id.guardarFormH)
        {
            managerHabitantes.open();
          long id = managerHabitantes.crearHabitanteCalle(hc);
            String mensaje="";
            if (id!=-1){
                mensaje="Agregado exitosamente";
            } else{
                mensaje="Error al ingresar la persona";
            }
            Toast.makeText(this, mensaje, Toast.LENGTH_LONG).show();
            System.out.println(mensaje);
            System.out.println(id);
           /* Cursor cursor = managerHabitantes.getHabitante();
            cursor.moveToFirst();
            System.out.println(cursor.getInt(0));
            System.out.println(cursor.getString(1));*/
        }
    }

    private void spinnerSexo()
    {
        sexo = (Spinner) findViewById(R.id.sSexoH);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.sexo,
                android.R.layout.simple_spinner_item);
        sexo.setAdapter(adapter);
        sexo.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }

}