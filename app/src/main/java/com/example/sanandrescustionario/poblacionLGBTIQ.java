package com.example.sanandrescustionario;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.sanandrescustionario.Manager.DBmanagerPoblacionLGBTIQ;

public class poblacionLGBTIQ extends AppCompatActivity {

    private DBmanagerPoblacionLGBTIQ dbManager;
    public String sexoSt, estadoCivilSt, generoSt, religionSt, grupoEtnicoSt, tieneHijosSt;
    public Spinner sexoSp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cuestionario_poblacion_lgbtiq);
        //dbManager = new DBManagerComunidadLgbt(getApplicationContext(), "Cuestionario_SanAndres", null, 1);
        dbManager = new DBmanagerPoblacionLGBTIQ(this);
        spinnerSexo();
    }

    private void spinnerSexo()
    {
        sexoSp = (Spinner) findViewById(R.id.sSexoH);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.sexoL,
                android.R.layout.simple_spinner_item);
        sexoSp.setAdapter(adapter);
        //Esto se dispara cada vez que detecta un cambio en el spinner
        sexoSp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                sexoSt = parent.getItemAtPosition(position).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                //hc.h_sexo="";
            }
        });
        spinnerEstadoCivil();
    }

    public void Enviar(View view){
        if(sexoSt.equals("Sin especificar")){
            Toast.makeText(this,"LLene todos los campos antes de enviar el formulario", Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(this,"El valor seleccionado es: " + grupoEtnicoSt, Toast.LENGTH_SHORT).show();
        }
    }

    private void spinnerEstadoCivil()
    {
        Spinner estadoCivil = (Spinner) findViewById(R.id.sEstadoCivilH);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.estadoCivilL,
                android.R.layout.simple_spinner_item);
        estadoCivil.setAdapter(adapter);
        estadoCivil.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                estadoCivilSt = parent.getItemAtPosition(position).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                //hc.h_sexo="";
            }

        });
        spinnerGenero();
    }

    private void spinnerGenero()
    {
        Spinner genero = (Spinner) findViewById(R.id.sGeneroH);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.generoL,
                android.R.layout.simple_spinner_item);
        genero.setAdapter(adapter);
        genero.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                generoSt = parent.getItemAtPosition(position).toString();
                if(generoSt.equals("Otro"))
                {
                    findViewById(R.id.eGeneroOH).setVisibility(View.VISIBLE);
                }
                else
                {
                    findViewById(R.id.eGeneroOH).setVisibility(View.GONE);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                //hc.h_sexo="";
            }

        });
        spinnerReligion();
    }

    private void spinnerReligion()
    {
        Spinner religion = (Spinner) findViewById(R.id.sReligionH);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.religionL,
                android.R.layout.simple_spinner_item);
        religion.setAdapter(adapter);
        religion.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                religionSt = parent.getItemAtPosition(position).toString();
                if(religionSt.equals("Otra"))
                {
                    findViewById(R.id.eReligionOH).setVisibility(View.VISIBLE);
                }
                else
                {
                    findViewById(R.id.eReligionOH).setVisibility(View.GONE);
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                //hc.h_sexo="";
            }
        });
        spinnerGrupoEtnico();
    }

    private void spinnerGrupoEtnico()
    {
        Spinner grupoEtnico = (Spinner) findViewById(R.id.sGrupoEtnico);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.grupoEtnicoL,
                android.R.layout.simple_spinner_item);
        grupoEtnico.setAdapter(adapter);
        grupoEtnico.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                grupoEtnicoSt = parent.getItemAtPosition(position).toString();
                if(grupoEtnicoSt.equals("Otro"))
                {
                    findViewById(R.id.eGrupoetnico).setVisibility(View.VISIBLE);
                }
                else
                {
                    findViewById(R.id.eGrupoetnico).setVisibility(View.GONE);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                //hc.h_sexo="";
            }

        });
        spinnerTieneHijos();
    }

    private void spinnerTieneHijos()
    {
        Spinner tieneHijos = (Spinner) findViewById(R.id.sTieneHijos);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.tieneHijosL,
                android.R.layout.simple_spinner_item);
        tieneHijos.setAdapter(adapter);
        tieneHijos.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                tieneHijosSt = parent.getItemAtPosition(position).toString();
                //hc.h_tienesHijos = tieneHijoSeleccionado;
                if(tieneHijosSt.equals("Si"))
                {
                    findViewById(R.id.eTieneHijo).setVisibility(View.VISIBLE);
                }
                else
                {
                    findViewById(R.id.eTieneHijo).setVisibility(View.GONE);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                //hc.h_sexo="";
            }

        });
        //spinnerNivelEscolaridad();
    }
}
