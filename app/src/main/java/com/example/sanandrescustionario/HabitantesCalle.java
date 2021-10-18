package com.example.sanandrescustionario;

import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
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

    public void objetoHAbitanteCalle()
    {
        EditText editText;
        editText = (EditText) findViewById(R.id.editTextNombreH);
        hc.h_nombre= editText.getText().toString();
        editText = (EditText) findViewById(R.id.editTextIdentificacionH);
        if(editText.getText().toString().equals(""))
        {
            hc.h_identificacion= 0;
        }else
        {
            hc.h_identificacion= Integer.parseInt(editText.getText().toString());
        }
        editText = (EditText) findViewById(R.id.editTextEdadH);
        if(editText.getText().toString().equals(""))
        {
            hc.h_edad =0;
        }else
        {
            hc.h_edad =Integer.parseInt(editText.getText().toString());
        }
        if(findViewById(R.id.eGeneroOH).getVisibility()== View.VISIBLE)
        {
            editText = (EditText) findViewById(R.id.eGeneroOH);
            hc.h_genero = editText.getText().toString();
        }
        Toast.makeText(this, hc.h_genero, Toast.LENGTH_LONG).show();
    }

    public void  crearHabitanteCalles(View view)
    {
        if(view.getId() == R.id.guardarFormH)
        {
            objetoHAbitanteCalle();
            /*managerHabitantes.open();
          long id = managerHabitantes.crearHabitanteCalle(hc);
            String mensaje="";
            if (id!=-1){
                mensaje="Agregado exitosamente";
            } else{
                mensaje="Error al ingresar la persona";
            }
            Toast.makeText(this, mensaje, Toast.LENGTH_LONG).show();
            System.out.println(mensaje);
            System.out.println(id);*/
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
        //Esto se dispara cada vez que detecta un cambio en el spinner
        sexo.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                hc.h_sexo= parent.getItemAtPosition(position).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                hc.h_sexo="";
            }
        });
        spinnerEstadoCivil();
    }

    private void spinnerEstadoCivil()
    {
        Spinner estadoCivil = (Spinner) findViewById(R.id.sEstadoCivilH);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.estadoCivil,
                android.R.layout.simple_spinner_item);
        estadoCivil.setAdapter(adapter);
        estadoCivil.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                hc.h_estadoCivil = parent.getItemAtPosition(position).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                hc.h_estadoCivil ="";
            }
        });
        spinnerGenero();
    }

    private void spinnerGenero()
    {
        Spinner genero = (Spinner) findViewById(R.id.sGeneroH);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.genero,
                android.R.layout.simple_spinner_item);
        genero.setAdapter(adapter);
        genero.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String generoSeleccionado = parent.getItemAtPosition(position).toString();
                if(generoSeleccionado.equals("Otro"))
                {
                    findViewById(R.id.eGeneroOH).setVisibility(View.VISIBLE);
                }
                else
                {
                    findViewById(R.id.eGeneroOH).setVisibility(View.GONE);
                    hc.h_genero =parent.getItemAtPosition(position).toString();
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                hc.h_genero="";
            }
        });
    }

    private void spinnerReligion()
    {
        Spinner religion = (Spinner) findViewById(R.id.sReligionH);
        //El simple_spinner_item es para indicar que es una lista desplegable
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.religion,
                android.R.layout.simple_spinner_item);
        //Esto es para agregarle el adapator al spinner seleccionado arriba
        religion.setAdapter(adapter);
        religion.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }


}