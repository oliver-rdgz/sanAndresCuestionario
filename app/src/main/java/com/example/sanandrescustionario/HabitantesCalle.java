package com.example.sanandrescustionario;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.KeyEvent;
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
            if (editText.getText().toString().equals(""))
            {
                hc.h_genero = "Otro";
            }
            else
            {
                hc.h_genero = editText.getText().toString();
            }

        }
        if(findViewById(R.id.eReligionOH).getVisibility()== View.VISIBLE)
        {
            editText = (EditText) findViewById(R.id.eReligionOH);
            if (editText.getText().toString().equals(""))
            {
                hc.h_religion="Otra";
            }
            else
            {
                hc.h_religion = editText.getText().toString();
            }
        }
        if(findViewById(R.id.eGrupoetnicoH).getVisibility()== View.VISIBLE)
        {
            editText = (EditText) findViewById(R.id.eGrupoetnicoH);
            if (editText.getText().toString().equals(""))
            {
                hc.h_grupoEC="Otro";
            }
            else {
                hc.h_grupoEC = editText.getText().toString();
            }
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
        editText = (EditText) findViewById(R.id.eETrabajaH);
        hc.h_dondeTrabaja = editText.getText().toString();
        editText = (EditText) findViewById(R.id.eSinoTrabajaH);
        hc.h_sinoTrabaja = editText.getText().toString();
        if(findViewById(R.id.eAlimentosH).getVisibility()== View.VISIBLE)
        {
            editText = (EditText) findViewById(R.id.eAlimentosH);
            if(editText.getText().toString().equals(""))
            {
                hc.h_trabajaManejoAlimentos ="Otro";
            }
            else
            {
                hc.h_trabajaManejoAlimentos = editText.getText().toString();
            }

        }
        editText = (EditText) findViewById(R.id.eRazonesCalleH);
        hc.h_razonesCalle= editText.getText().toString();
        editText= (EditText) findViewById(R.id.eSanandresAyudaH);
        hc.h_sanAndresAyuda= editText.getText().toString();
        if(findViewById(R.id.eBeneficiarioH).getVisibility() == View.VISIBLE)
        {
            editText= (EditText) findViewById(R.id.eBeneficiarioH);
            hc.h_cualPrograma = editText.getText().toString();
        }
        else
        {
            hc.h_cualPrograma = "";
        }
        if(findViewById(R.id.eTipoViolenciaH).getVisibility() == View.VISIBLE)
        {
            editText= (EditText) findViewById(R.id.eTipoViolenciaH);
            hc.h_tipoViolencia = editText.getText().toString();
        }
        else
        {
            hc.h_tipoViolencia = "";
        }
        if(findViewById(R.id.eProblemaSaludH).getVisibility() == View.VISIBLE)
        {
            editText= (EditText) findViewById(R.id.eProblemaSaludH);
            hc.h_tipoEnfermedad = editText.getText().toString();
        }
        else
        {
            hc.h_tipoEnfermedad = "";
        }

        if(findViewById(R.id.eVacunaCovidH).getVisibility() == View.VISIBLE)
        {
            editText= (EditText) findViewById(R.id.eVacunaCovidH);
            hc.h_razonesVacuna = editText.getText().toString();
        }
        else
        {
            hc.h_razonesVacuna = "";
        }
        editText = (EditText) findViewById(R.id.eSanandresAsistenciaH);
        hc.h_sanAndresMasAsistencia = editText.getText().toString();
        editText = (EditText) findViewById(R.id.eSobrevivirH);
        hc.h_alimentosSobrevivir= editText.getText().toString();
        editText= (EditText) findViewById(R.id.eComentariosH);
        hc.h_comentarios= editText.getText().toString();
    }

    public void  crearHabitanteCalles(View view)
    {
        if(view.getId() == R.id.guardarFormH)
        {
            mensajeFinalizarCuestionario();
        }
    }

    private void mensajeFinalizarCuestionario()
    {
        AlertDialog.Builder alertDialog = new AlertDialog.Builder(this);
        alertDialog.setMessage("¿Finalizar el cuestionario?")
        .setPositiveButton("SI", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                objetoHAbitanteCalle();
                managerHabitantes.open();
                long id = managerHabitantes.crearHabitanteCalle(hc);
                if (id!=-1){
                    Toast.makeText(HabitantesCalle.this, "Agregado exitosamente", Toast.LENGTH_LONG).show();
                    Intent intent = new Intent(HabitantesCalle.this, MainActivity.class);
                    startActivity(intent);
                } else{
                    Toast.makeText(HabitantesCalle.this, "Error al ingresar al habitante de la calle", Toast.LENGTH_LONG).show();
                }

            }
        })
        .setNegativeButton("NO", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });
        alertDialog.show();
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
        spinnerReligion();
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
        spinnerNivelEscolaridad();
    }

    private void spinnerNivelEscolaridad()
    {
        Spinner nivelEscolaridad = (Spinner) findViewById(R.id.sNivelEscolaridadH);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.nivelEscolaridad,
                android.R.layout.simple_spinner_item);
        nivelEscolaridad.setAdapter(adapter);
        nivelEscolaridad.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                hc.h_nivelEscolaridad = parent.getItemAtPosition(position).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                hc.h_nivelEscolaridad ="";
            }
        });
        spinnerActualmenteTrabajando();
    }

    private void spinnerActualmenteTrabajando()
    {
        Spinner actualmenteTrabajando = (Spinner) findViewById(R.id.sTrabajandoH);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.siNo,
                android.R.layout.simple_spinner_item);
        actualmenteTrabajando.setAdapter(adapter);
        actualmenteTrabajando.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                hc.h_actualmenteTrabaja = parent.getItemAtPosition(position).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                hc.h_actualmenteTrabaja="";
            }
        });
        spinnerTArtesania();
    }

    private void spinnerTArtesania()
    {
        Spinner tArtesania = (Spinner) findViewById(R.id.sArtesaniaH);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.siNo,
                android.R.layout.simple_spinner_item);
        tArtesania.setAdapter(adapter);
        tArtesania.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                hc.h_trabajaArtesania = parent.getItemAtPosition(position).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                hc.h_trabajaArtesania ="";
            }
        });
        spinnerTComercio();
    }

    private void spinnerTComercio()
    {
        Spinner tComercio = (Spinner) findViewById(R.id.sTComercioH);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.siNo,
                android.R.layout.simple_spinner_item);
        tComercio.setAdapter(adapter);
        tComercio.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                hc.h_trabajaComercio = parent.getItemAtPosition(position).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                hc.h_trabajaComercio ="";
            }
        });
        spinnerTTurismo();
    }

    private void spinnerTTurismo()
    {
        Spinner tTurismo = (Spinner) findViewById(R.id.sTTurismoH);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.siNo,
                android.R.layout.simple_spinner_item);
        tTurismo.setAdapter(adapter);
        tTurismo.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                hc.h_trabajaTurismo = parent.getItemAtPosition(position).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                hc.h_trabajaTurismo ="";
            }
        });
        spinnerTAlimentos();
    }

    private void spinnerTAlimentos()
    {
        Spinner tAlimentos = (Spinner) findViewById(R.id.sAlimentosH);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.siNoOtro,
                android.R.layout.simple_spinner_item);
        tAlimentos.setAdapter(adapter);
        tAlimentos.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String alimentoSeleccionado = parent.getItemAtPosition(position).toString();
                hc.h_trabajaManejoAlimentos= alimentoSeleccionado;
                if (alimentoSeleccionado.equals("OTRO"))
                {
                    findViewById(R.id.eAlimentosH).setVisibility(View.VISIBLE);
                }
                else
                {
                    findViewById(R.id.eAlimentosH).setVisibility(View.GONE);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                hc.h_trabajaManejoAlimentos ="";
            }
        });
        spinnerOrientacionPolitica();
    }

    private void spinnerOrientacionPolitica()
    {
        Spinner orientacionPolitica = (Spinner) findViewById(R.id.sOrientacionPoliticaH);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.orientacionPolitica,
                android.R.layout.simple_spinner_item);
        orientacionPolitica.setAdapter(adapter);
        orientacionPolitica.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                hc.h_orientacionPolitica = parent.getItemAtPosition(position).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                hc.h_orientacionPolitica ="";
            }
        });
        spinnerSai();
    }

    private void spinnerSai()
    {
        Spinner sai = (Spinner) findViewById(R.id.sSaiH);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.sai,
                android.R.layout.simple_spinner_item);
        sai.setAdapter(adapter);
        sai.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                hc.h_parientesSai = parent.getItemAtPosition(position).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                hc.h_parientesSai ="";
            }
        });
        spinnerconversacionFamiliares();
    }

    private void spinnerconversacionFamiliares()
    {
        Spinner cFamiliares = (Spinner) findViewById(R.id.sFCFamiliaresH);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.cFamiliares,
                android.R.layout.simple_spinner_item);
        cFamiliares.setAdapter(adapter);
        cFamiliares.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                hc.h_conversacionFamiliares = parent.getItemAtPosition(position).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                hc.h_conversacionFamiliares ="";
            }
        });
        spinnercontactoFamiliares();
    }

    private void spinnercontactoFamiliares()
    {
        Spinner cFamiliares = (Spinner) findViewById(R.id.sContactoFamiliaresH);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.contactoFamiliares,
                android.R.layout.simple_spinner_item);
        cFamiliares.setAdapter(adapter);
        cFamiliares.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                hc.h_familiaresContacto = parent.getItemAtPosition(position).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                hc.h_familiaresContacto ="";
            }
        });
        spinnerUnidadesAtencion();
    }

    private void spinnerUnidadesAtencion()
    {
        Spinner unidadesAtencion = (Spinner) findViewById(R.id.sUnidadAtencionH);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.siNo,
                android.R.layout.simple_spinner_item);
        unidadesAtencion.setAdapter(adapter);
        unidadesAtencion.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                hc.h_uniddadesAtencion = parent.getItemAtPosition(position).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                hc.h_uniddadesAtencion ="";
            }
        });
        spinnerBeneficiario();
    }

    private  void  spinnerBeneficiario()
    {
        Spinner beneficiario = (Spinner) findViewById(R.id.sBeneficiarioH);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.siNo,
                android.R.layout.simple_spinner_item);
        beneficiario.setAdapter(adapter);
        beneficiario.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String esBeneficiario = parent.getItemAtPosition(position).toString();
                hc.h_programaSocial = esBeneficiario;
                if(esBeneficiario.equals("Si")){
                    findViewById(R.id.eBeneficiarioH).setVisibility(View.VISIBLE);
                }else
                {
                    findViewById(R.id.eBeneficiarioH).setVisibility(View.GONE);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                hc.h_programaSocial ="";
            }
        });
        spinnerTipoViolencia();
    }

    private  void  spinnerTipoViolencia()
    {
        Spinner tipoViolencia = (Spinner) findViewById(R.id.sTipoViolenciaH);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.siNo,
                android.R.layout.simple_spinner_item);
        tipoViolencia.setAdapter(adapter);
        tipoViolencia.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String sufridoTipoViolencia = parent.getItemAtPosition(position).toString();
                hc.h_violenciaCalle = sufridoTipoViolencia;
                if(sufridoTipoViolencia.equals("Si")){
                    findViewById(R.id.eTipoViolenciaH).setVisibility(View.VISIBLE);
                }else
                {
                    findViewById(R.id.eTipoViolenciaH).setVisibility(View.GONE);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                hc.h_violenciaCalle ="";
            }
        });
        spinnerProblemasSalud();
    }

    private  void  spinnerProblemasSalud()
    {
        Spinner problemaSalud = (Spinner) findViewById(R.id.sProblemaSaludH);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.siNo,
                android.R.layout.simple_spinner_item);
        problemaSalud.setAdapter(adapter);
        problemaSalud.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String tieneProblemaSalud = parent.getItemAtPosition(position).toString();
                hc.h_problemaSalud = tieneProblemaSalud;
                if(tieneProblemaSalud.equals("Si")){
                    findViewById(R.id.eProblemaSaludH).setVisibility(View.VISIBLE);
                }else
                {
                    findViewById(R.id.eProblemaSaludH).setVisibility(View.GONE);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                hc.h_problemaSalud ="";
            }
        });
        spinnerVacunaCovid();
    }

    private  void  spinnerVacunaCovid()
    {
        Spinner vacunaCovid = (Spinner) findViewById(R.id.sVacunaCovidH);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.siNo,
                android.R.layout.simple_spinner_item);
        vacunaCovid.setAdapter(adapter);
        vacunaCovid.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String tieneVacunaCovid = parent.getItemAtPosition(position).toString();
                hc.h_tieneVacuna = tieneVacunaCovid;
                if(tieneVacunaCovid.equals("No")){
                    findViewById(R.id.eVacunaCovidH).setVisibility(View.VISIBLE);
                }else
                {
                    findViewById(R.id.eVacunaCovidH).setVisibility(View.GONE);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                hc.h_tieneVacuna ="";
            }
        });
        spinnerEmbarazada();
    }

    private  void  spinnerEmbarazada()
    {
        Spinner embarazada = (Spinner) findViewById(R.id.sEmbarazadaH);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.siNo,
                android.R.layout.simple_spinner_item);
        embarazada.setAdapter(adapter);
        embarazada.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String estasEmbarazada = parent.getItemAtPosition(position).toString();
                hc.h_embarazada = estasEmbarazada;
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                hc.h_embarazada ="";
            }
        });
        spinnerCompaneraEmbarazada();
    }

    private  void  spinnerCompaneraEmbarazada()
    {
        Spinner companeraEmbarazada = (Spinner) findViewById(R.id.sCompaneraEmbarazadaH);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.siNo,
                android.R.layout.simple_spinner_item);
        companeraEmbarazada.setAdapter(adapter);
        companeraEmbarazada.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String companeraEstaEmbarazada = parent.getItemAtPosition(position).toString();
                hc.h_companeraEmbarazada = companeraEstaEmbarazada;
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                hc.h_companeraEmbarazada ="";
            }
        });
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == event.KEYCODE_BACK){
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("¿Desea cancelar la creación del cuestionario?")
            .setPositiveButton("Si", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    Intent intent = new Intent(HabitantesCalle.this, MainActivity.class);
                    startActivity(intent);
                }
            })
            .setNegativeButton("Cancelar", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    dialog.dismiss();
                }
            });
            builder.show();
        }
        return super.onKeyDown(keyCode, event);

    }
}