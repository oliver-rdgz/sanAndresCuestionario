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
    public String sexoSt, estadoCivilSt, generoSt, religionSt, grupoEtnicoSt, conQuienViveSt, tieneHijosSt,
                  nivelDeEscolaridadSt, estaTrabajandoSt, trabajaArtesaniaSt, trabajaComercioSt, trabajaTurismoSt, trabajaVentaManejoAlimentosSt,
                  ingresoLaboralAproSt, ingresoUnidadFamiliarSt, orientacionPoliticaSt;
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
        sexoSp = (Spinner) findViewById(R.id.sSexoL);
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
        Spinner estadoCivil = (Spinner) findViewById(R.id.sEstadoCivilL);
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
            }

        });
        spinnerGenero();
    }

    private void spinnerGenero()
    {
        Spinner genero = (Spinner) findViewById(R.id.sGeneroL);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.generoL,
                android.R.layout.simple_spinner_item);
        genero.setAdapter(adapter);
        genero.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                generoSt = parent.getItemAtPosition(position).toString();
                if(generoSt.equals("Otro"))
                {
                    findViewById(R.id.eGeneroOL).setVisibility(View.VISIBLE);
                }
                else
                {
                    findViewById(R.id.eGeneroOL).setVisibility(View.GONE);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }

        });
        spinnerReligion();
    }

    private void spinnerReligion()
    {
        Spinner religion = (Spinner) findViewById(R.id.sReligionL);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.religionL,
                android.R.layout.simple_spinner_item);
        religion.setAdapter(adapter);
        religion.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                religionSt = parent.getItemAtPosition(position).toString();
                if(religionSt.equals("Otra"))
                {
                    findViewById(R.id.eReligionOL).setVisibility(View.VISIBLE);
                }
                else
                {
                    findViewById(R.id.eReligionOL).setVisibility(View.GONE);
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });
        spinnerGrupoEtnico();
    }

    private void spinnerGrupoEtnico()
    {
        Spinner grupoEtnico = (Spinner) findViewById(R.id.sGrupoEtnicoL);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.grupoEtnicoL,
                android.R.layout.simple_spinner_item);
        grupoEtnico.setAdapter(adapter);
        grupoEtnico.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                grupoEtnicoSt = parent.getItemAtPosition(position).toString();
                if(grupoEtnicoSt.equals("Otro"))
                {
                    findViewById(R.id.eGrupoetnicoL).setVisibility(View.VISIBLE);
                }
                else
                {
                    findViewById(R.id.eGrupoetnicoL).setVisibility(View.GONE);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }

        });
        spinnerConQuienVive();
    }

    private void spinnerConQuienVive()
    {
        Spinner conQuienVive = (Spinner) findViewById(R.id.sConQuienViveL);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.conQuienViveL,
                android.R.layout.simple_spinner_item);
        conQuienVive.setAdapter(adapter);
        conQuienVive.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                conQuienViveSt = parent.getItemAtPosition(position).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }

        });
        spinnerTieneHijos();
    }

    private void spinnerTieneHijos()
    {
        Spinner tieneHijos = (Spinner) findViewById(R.id.sTieneHijosL);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.tieneHijosL,
                android.R.layout.simple_spinner_item);
        tieneHijos.setAdapter(adapter);
        tieneHijos.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                tieneHijosSt = parent.getItemAtPosition(position).toString();
                if(tieneHijosSt.equals("Si"))
                {
                    findViewById(R.id.eTieneHijoL).setVisibility(View.VISIBLE);
                }
                else
                {
                    findViewById(R.id.eTieneHijoL).setVisibility(View.GONE);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }

        });
        spinnerNivelEscolaridad();
    }

    private void spinnerNivelEscolaridad()
    {
        Spinner nivelEscolaridad = (Spinner) findViewById(R.id.sNivelEscolaridadL);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.nivelEscolaridadL,
                android.R.layout.simple_spinner_item);
        nivelEscolaridad.setAdapter(adapter);
        nivelEscolaridad.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                nivelDeEscolaridadSt = parent.getItemAtPosition(position).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }

        });
        spinnerEstaTrabajando();
    }

    private void spinnerEstaTrabajando()
    {
        Spinner estaTrabajando = (Spinner) findViewById(R.id.sTrabajandoL);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.estaTrabajandoL,
                android.R.layout.simple_spinner_item);
        estaTrabajando.setAdapter(adapter);
        estaTrabajando.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                estaTrabajandoSt = parent.getItemAtPosition(position).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }

        });
        spinnerTieneHijos();
    }
}
