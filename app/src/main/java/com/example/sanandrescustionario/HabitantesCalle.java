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
        if(findViewById(R.id.eReligionOH).getVisibility()== View.VISIBLE)
        {
            editText = (EditText) findViewById(R.id.eReligionOH);
            hc.h_religion = editText.getText().toString();
        }
        if(findViewById(R.id.eGrupoetnicoH).getVisibility()== View.VISIBLE)
        {
            editText = (EditText) findViewById(R.id.eGrupoetnicoH);
            hc.h_grupoEC = editText.getText().toString();
        }
        editText = (EditText) findViewById(R.id.eProcedenciaH);
        hc.h_LProcedencia = editText.getText().toString();
        editText = (EditText) findViewById(R.id.eViveActualmenteH);
        hc.h_viveActualmente = editText.getText().toString();
        if(findViewById(R.id.eTieneHijoH).getVisibility()== View.VISIBLE)
        {
            editText = (EditText) findViewById(R.id.eTieneHijoH);
            if(editText.getText().toString().equals(""))
            {
                hc.h_CuantosHijos=0;
            }
            else
            {
                hc.h_CuantosHijos =Integer.parseInt(editText.getText().toString()) ;
            }

        }
        Toast.makeText(this, hc.h_CuantosHijos+"", Toast.LENGTH_LONG).show();
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
        spinnerReligion();
    }

    private void spinnerReligion()
    {
        Spinner religion = (Spinner) findViewById(R.id.sReligionH);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.religion,
                android.R.layout.simple_spinner_item);
        religion.setAdapter(adapter);
        religion.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String religionSeleccionado = parent.getItemAtPosition(position).toString();
                if(religionSeleccionado.equals("Otra"))
                {
                    findViewById(R.id.eReligionOH).setVisibility(View.VISIBLE);
                }
                else
                {
                    findViewById(R.id.eReligionOH).setVisibility(View.GONE);
                    hc.h_religion =parent.getItemAtPosition(position).toString();
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                hc.h_religion="";
            }
        });
        spinnerGrupoEtnico();
    }

    private void spinnerGrupoEtnico()
    {
        Spinner grupoEtnico = (Spinner) findViewById(R.id.sGrupoEtnicoH);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.grupoEtnico,
                android.R.layout.simple_spinner_item);
        grupoEtnico.setAdapter(adapter);
        grupoEtnico.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String grupoEtnicoSeleccionado = parent.getItemAtPosition(position).toString();
                if(grupoEtnicoSeleccionado.equals("otro"))
                {
                    findViewById(R.id.eGrupoetnicoH).setVisibility(View.VISIBLE);
                }
                else
                {
                    findViewById(R.id.eGrupoetnicoH).setVisibility(View.GONE);
                    hc.h_grupoEC =parent.getItemAtPosition(position).toString();
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                hc.h_grupoEC ="";
            }
        });
        spinnerTieneHijos();
    }

    private void spinnerTieneHijos()
    {
        Spinner tieneHijos = (Spinner) findViewById(R.id.sTienesHijoH);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.tieneHijos,
                android.R.layout.simple_spinner_item);
        tieneHijos.setAdapter(adapter);
        tieneHijos.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String tieneHijoSeleccionado = parent.getItemAtPosition(position).toString();
                hc.h_tienesHijos= tieneHijoSeleccionado;
                if(tieneHijoSeleccionado.equals("Si"))
                {
                    findViewById(R.id.eTieneHijoH).setVisibility(View.VISIBLE);
                }
                else
                {
                    findViewById(R.id.eTieneHijoH).setVisibility(View.GONE);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }


}