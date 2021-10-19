package com.example.sanandrescustionario;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;

import com.example.sanandrescustionario.Manager.MGenero;
import com.example.sanandrescustionario.usuarios.GeneroUsuario;

public class Genero extends AppCompatActivity {

    GeneroUsuario gU;
    private MGenero managerGenero;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_genero);
        gU = new GeneroUsuario();
        managerGenero = new MGenero(this);
        spinnerSexo();
    }

    private void objetoGeneroUsuario()
    {
        EditText editText;
        CheckBox checkBox;
        editText = (EditText) findViewById(R.id.editTextNombreG);
        gU.g_nombre = editText.getText().toString();
        editText= (EditText) findViewById(R.id.editTextIdentificacionG);
        if (editText.getText().toString().isEmpty())
        {
            gU.g_identificacion= 0;
        }
        else
        {
            gU.g_identificacion = Integer.parseInt(editText.getText().toString());
        }
        editText = (EditText) findViewById(R.id.editTextEdadG);
        if(editText.getText().toString().isEmpty())
        {
            gU.g_identificacion=0;
        }
        else{
            gU.g_edad = Integer.parseInt(editText.getText().toString());
        }

        if (findViewById(R.id.eGeneroOG).getVisibility() == View.VISIBLE)
        {
            editText = (EditText) findViewById(R.id.eGeneroOG);
            if (editText.getText().toString().isEmpty())
            {
                gU.g_genero = "Otro";
            }
            else
            {
                gU.g_genero=editText.getText().toString();
            }
        }

        if (findViewById(R.id.eReligionOG).getVisibility() == View.VISIBLE)
        {
            editText = (EditText) findViewById(R.id.eReligionOG);
            if (editText.getText().toString().isEmpty())
            {
                gU.g_religion = "Otra";
            }
            else
            {
                gU.g_religion=editText.getText().toString();
            }
        }

        if (findViewById(R.id.eGrupoetnicoG).getVisibility() == View.VISIBLE)
        {
            editText = (EditText) findViewById(R.id.eGrupoetnicoG);
            if (editText.getText().toString().isEmpty())
            {
                gU.g_grupoEC = "Otro";
            }
            else
            {
                gU.g_grupoEC=editText.getText().toString();
            }
        }
        editText = (EditText) findViewById(R.id.eProcedenciaG);
        gU.g_LProcedencia = editText.getText().toString();
        editText = (EditText) findViewById(R.id.eViveActualmenteG);
        gU.g_viveActualmente = editText.getText().toString();
        editText = (EditText) findViewById(R.id.eTieneHijoG);
        if (editText.getText().toString().isEmpty())
        {
            gU.g_cuantosHijos=0;
        }
        else
        {
            gU.g_cuantosHijos= Integer.parseInt(editText.getText().toString());
        }

        checkBox = (CheckBox) findViewById(R.id.esPadreG);
        if (checkBox.isChecked())
        {
            gU.g_esPadre = "Si";
        }
        else {
            gU.g_esPadre = "No";
        }
        checkBox = (CheckBox) findViewById(R.id.esMadreG);
        if (checkBox.isChecked())
        {
            gU.g_esMadre = "Si";
        }
        else {
            gU.g_esMadre = "No";
        }
        checkBox = (CheckBox) findViewById(R.id.esEsposoaG);
        if (checkBox.isChecked())
        {
            gU.g_esEsposoa = "Si";
        }
        else {
            gU.g_esEsposoa = "No";
        }
        checkBox = (CheckBox) findViewById(R.id.esHijoaG);
        if (checkBox.isChecked())
        {
            gU.g_esHijoa = "Si";
        }
        else {
            gU.g_esHijoa = "No";
        }
        checkBox = (CheckBox) findViewById(R.id.esHermanoaG);
        if (checkBox.isChecked())
        {
            gU.g_esHermanoa = "Si";
        }
        else {
            gU.g_esHermanoa = "No";
        }

        if (findViewById(R.id.eRolCualG).getVisibility()== View.VISIBLE)
        {
            editText = (EditText) findViewById(R.id.eRolCualG);
            if (editText.getText().toString().isEmpty())
            {
                gU.g_esOtro= "Otro";
            }
            else
            {
                gU.g_esOtro= editText.getText().toString();
            }
        }
        else
        {
            gU.g_esOtro = "No";
        }

    }

    private void spinnerSexo()
    {
        Spinner sexo = (Spinner) findViewById(R.id.sSexoG);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.sexo,
                android.R.layout.simple_spinner_item);
        sexo.setAdapter(adapter);
        sexo.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                gU.g_sexo= parent.getItemAtPosition(position).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                gU.g_sexo="";
            }
        });
        spinnerEstadoCivil();
    }

    private void spinnerEstadoCivil()
    {
        Spinner estadoCivil = (Spinner) findViewById(R.id.sSexoG);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.estadoCivil,
                android.R.layout.simple_spinner_item);
        estadoCivil.setAdapter(adapter);
        estadoCivil.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                gU.g_estadoCivil= parent.getItemAtPosition(position).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                gU.g_estadoCivil="";
            }
        });
        spinnerGenero();
    }

    private void spinnerGenero()
    {
        Spinner genero = (Spinner) findViewById(R.id.sGeneroG);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.genero,
                android.R.layout.simple_spinner_item);
        genero.setAdapter(adapter);
        genero.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String generoSeleccionado = parent.getItemAtPosition(position).toString();
                gU.g_genero= parent.getItemAtPosition(position).toString();
                if (generoSeleccionado.equals("Otro"))
                {
                    findViewById(R.id.eGeneroOG).setVisibility(View.VISIBLE);
                }
                else
                {
                    findViewById(R.id.eGeneroOG).setVisibility(View.GONE);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                gU.g_genero="";
            }
        });
        spinnerReligion();
    }

    private void spinnerReligion()
    {
        Spinner religion = (Spinner) findViewById(R.id.sReligionG);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.religion,
                android.R.layout.simple_spinner_item);
        religion.setAdapter(adapter);
        religion.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String religionSelecionado = parent.getItemAtPosition(position).toString();
                gU.g_religion= parent.getItemAtPosition(position).toString();
                if (religionSelecionado.equals("Otra"))
                {
                    findViewById(R.id.eReligionOG).setVisibility(View.VISIBLE);
                }
                else
                {
                    findViewById(R.id.eReligionOG).setVisibility(View.GONE);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                gU.g_religion="";
            }
        });
        spinnerGrupoEtnico();
    }

    private void spinnerGrupoEtnico()
    {
        Spinner grupoEtnico = (Spinner) findViewById(R.id.sGrupoEtnicoG);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.grupoEtnico,
                android.R.layout.simple_spinner_item);
        grupoEtnico.setAdapter(adapter);
        grupoEtnico.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String grupoEtnicoSelecionado = parent.getItemAtPosition(position).toString();
                gU.g_grupoEC= parent.getItemAtPosition(position).toString();
                if (grupoEtnicoSelecionado.equals("otro"))
                {
                    findViewById(R.id.eGrupoetnicoG).setVisibility(View.VISIBLE);
                }
                else
                {
                    findViewById(R.id.eGrupoetnicoG).setVisibility(View.GONE);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                gU.g_grupoEC="";
            }
        });
        spinnerQuienVive();
    }

    private void spinnerQuienVive()
    {
        Spinner quienVive = (Spinner) findViewById(R.id.sQuienViveG);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.quienViveG,
                android.R.layout.simple_spinner_item);
        quienVive.setAdapter(adapter);
        quienVive.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                gU.g_quienVive= parent.getItemAtPosition(position).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                gU.g_quienVive="";
            }
        });
        spinnerTieneHijos();
    }

    private void spinnerTieneHijos()
    {
        Spinner tieneHijos = (Spinner) findViewById(R.id.sQuienViveG);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.tieneHijos,
                android.R.layout.simple_spinner_item);
        tieneHijos.setAdapter(adapter);
        tieneHijos.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                gU.g_tienesHijos= parent.getItemAtPosition(position).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                gU.g_tienesHijos="";
            }
        });

    }

    public void mostrarCampoOtroRolFamilia(View view)
    {
        if(view.getId() == R.id.rOtroG)
        {
            CheckBox checkBox =(CheckBox) findViewById(R.id.rOtroG);
            if(checkBox.isChecked())
            {
                findViewById(R.id.eRolCualG).setVisibility(View.VISIBLE);
            }
            else
            {
                findViewById(R.id.eRolCualG).setVisibility(View.GONE);
            }
        }
    }

}