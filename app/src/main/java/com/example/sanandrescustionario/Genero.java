package com.example.sanandrescustionario;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

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
            gU.g_genero=editText.getText().toString();
        }

        if (findViewById(R.id.eReligionOG).getVisibility() == View.VISIBLE)
        {
            editText = (EditText) findViewById(R.id.eReligionOG);
            gU.g_religion=editText.getText().toString();

        }

        if (findViewById(R.id.eGrupoetnicoG).getVisibility() == View.VISIBLE)
        {
            editText = (EditText) findViewById(R.id.eGrupoetnicoG);
            gU.g_grupoEC=editText.getText().toString();

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
            gU.g_esOtro= editText.getText().toString();
        }
        else
        {
            gU.g_esOtro = "No";
        }

        editText = (EditText) findViewById(R.id.eCuantasVivenTuHogarG);
        if(editText.getText().toString().isEmpty())
        {
            gU.g_vivenTuHogar=-1;
        }
        else
        {
            gU.g_vivenTuHogar= Integer.parseInt(editText.getText().toString());
        }
        editText = (EditText) findViewById(R.id.eETrabajaG);
        gU.g_dondeTrabaja = editText.getText().toString();
        editText = (EditText) findViewById(R.id.eSinoTrabajaG);
        gU.g_sinoTrabaja = editText.getText().toString();
        if (findViewById(R.id.eAlimentosG).getVisibility()== View.VISIBLE)
        {
            editText = (EditText) findViewById(R.id.eAlimentosG);
            if (editText.getText().toString().isEmpty())
            {
                gU.g_trabajaManejoAlimentos= "Otro";
            }
            else
            {
                gU.g_trabajaManejoAlimentos= editText.getText().toString();
            }
        }
        editText =(EditText) findViewById(R.id.eTemaGeneroG);
        gU.g_temaGenero= editText.getText().toString();

        if (findViewById(R.id.eViolenciaMujerG).getVisibility()== View.VISIBLE)
        {
            editText = (EditText) findViewById(R.id.eViolenciaMujerG);
            gU.g_situacionViolencia=editText.getText().toString();
        }

        if (findViewById(R.id.eOpinionPiropoG).getVisibility()== View.VISIBLE)
        {
            editText = (EditText) findViewById(R.id.eOpinionPiropoG);
            gU.g_quePiropo= editText.getText().toString();
        }

        checkBox=(CheckBox) findViewById(R.id.fComentarioAparienciaG);
        if (checkBox.isChecked())
        {
            gU.g_fComentarioApariencia="Si";
        }
        else
        {
            gU.g_fComentarioApariencia="No";
        }

        checkBox= (CheckBox) findViewById((R.id.fComentarioAparienciaCuerpoG));
        if (checkBox.isChecked())
        {
            gU.g_fComentarioAparienciaCuerpo="Si";
        }
        else
        {
            gU.g_fComentarioAparienciaCuerpo="No";
        }

        checkBox= (CheckBox) findViewById((R.id.fComentarioVestirmeG));
        if (checkBox.isChecked())
        {
            gU.g_fComentarioVestirme="Si";
        }
        else
        {
            gU.g_fComentarioVestirme="No";
        }

        checkBox= (CheckBox) findViewById((R.id.fSilbidosG));
        if (checkBox.isChecked())
        {
            gU.g_fSilbidos="Si";
        }
        else
        {
            gU.g_fSilbidos="No";
        }

        checkBox= (CheckBox) findViewById((R.id.fMiradasSexualesG));
        if (checkBox.isChecked())
        {
            gU.g_fMiradasSexuales="Si";
        }
        else
        {
            gU.g_fMiradasSexuales="No";
        }

        checkBox= (CheckBox) findViewById((R.id.fPalabrasObsenasG));
        if (checkBox.isChecked())
        {
            gU.g_fPalabrasObsenas="Si";
        }
        else
        {
            gU.g_fPalabrasObsenas="No";
        }

        checkBox= (CheckBox) findViewById((R.id.fGestosSexualG));
        if (checkBox.isChecked())
        {
            gU.g_fGestoSexual="Si";
        }
        else
        {
            gU.g_fGestoSexual="No";
        }

        checkBox= (CheckBox) findViewById((R.id.fTocamientosG));
        if (checkBox.isChecked())
        {
            gU.g_fTocamientos="Si";
        }
        else
        {
            gU.g_fTocamientos="No";
        }

        checkBox= (CheckBox) findViewById((R.id.fFavorSexualG));
        if (checkBox.isChecked())
        {
            gU.g_fFavorSexual="Si";
        }
        else
        {
            gU.g_fFavorSexual="No";
        }

        checkBox= (CheckBox) findViewById((R.id.fCitaAfueraG));
        if (checkBox.isChecked())
        {
            gU.g_fCitaFuera="Si";
        }
        else
        {
            gU.g_fCitaFuera="No";
        }

        checkBox= (CheckBox) findViewById((R.id.fInsultoSexualG));
        if (checkBox.isChecked())
        {
            gU.g_fInsultoSexual="Si";
        }
        else
        {
            gU.g_fInsultoSexual="No";
        }

        checkBox= (CheckBox) findViewById((R.id.fMiradasOfensivasG));
        if (checkBox.isChecked())
        {
            gU.g_fMiradaOfensiva="Si";
        }
        else
        {
            gU.g_fMiradaOfensiva="No";
        }

        checkBox= (CheckBox) findViewById((R.id.fAmenzaSexualG));
        if (checkBox.isChecked())
        {
            gU.g_fAmenazaSexual="Si";
        }
        else
        {
            gU.g_fAmenazaSexual="No";
        }

        if(findViewById(R.id.eDenunciariaAcosoSexualG).getVisibility()== View.VISIBLE)
        {
            editText= (EditText) findViewById(R.id.eDenunciariaAcosoSexualG);
            gU.g_victimaPorque= editText.getText().toString();
        }
        else
        {
            gU.g_victimaPorque="";
        }

        checkBox= (CheckBox) findViewById((R.id.cComentarioAparienciaG));
        if (checkBox.isChecked())
        {
            gU.g_cComentarioApariencia="Si";
        }
        else
        {
            gU.g_cComentarioApariencia="No";
        }

        checkBox= (CheckBox) findViewById((R.id.cComentarioAparienciaCuerpoG));
        if (checkBox.isChecked())
        {
            gU.g_cComentarioAparienciaCuerpo="Si";
        }
        else
        {
            gU.g_cComentarioAparienciaCuerpo="No";
        }

        checkBox= (CheckBox) findViewById((R.id.cComentarioVestirmeG));
        if (checkBox.isChecked())
        {
            gU.g_cComentarioVestirme="Si";
        }
        else
        {
            gU.g_cComentarioVestirme="No";
        }

        checkBox= (CheckBox) findViewById((R.id.cSilbidosG));
        if (checkBox.isChecked())
        {
            gU.g_cSilbidos="Si";
        }
        else
        {
            gU.g_cSilbidos="No";
        }

        checkBox= (CheckBox) findViewById((R.id.cMiradasSexualesG));
        if (checkBox.isChecked())
        {
            gU.g_cMiradasSexuales="Si";
        }
        else
        {
            gU.g_cMiradasSexuales="No";
        }

        checkBox= (CheckBox) findViewById((R.id.cPalabrasObsenasG));
        if (checkBox.isChecked())
        {
            gU.g_cPalabrasObsenas="Si";
        }
        else
        {
            gU.g_cPalabrasObsenas="No";
        }

        checkBox= (CheckBox) findViewById((R.id.cGestosSexualG));
        if (checkBox.isChecked())
        {
            gU.g_cGestoSexual="Si";
        }
        else
        {
            gU.g_cGestoSexual="No";
        }

        checkBox= (CheckBox) findViewById((R.id.cTocamientosG));
        if (checkBox.isChecked())
        {
            gU.g_cTocamientos="Si";
        }
        else
        {
            gU.g_cTocamientos="No";
        }

        checkBox= (CheckBox) findViewById((R.id.cFavorSexualG));
        if (checkBox.isChecked())
        {
            gU.g_cFavorSexual="Si";
        }
        else
        {
            gU.g_cFavorSexual="No";
        }

        checkBox= (CheckBox) findViewById((R.id.cCitaAfueraG));
        if (checkBox.isChecked())
        {
            gU.g_cCitaFuera="Si";
        }
        else
        {
            gU.g_cCitaFuera="No";
        }

        checkBox= (CheckBox) findViewById((R.id.cInsultoSexualG));
        if (checkBox.isChecked())
        {
            gU.g_cInsultoSexual="Si";
        }
        else
        {
            gU.g_cInsultoSexual="No";
        }

        checkBox= (CheckBox) findViewById((R.id.cMiradasOfensivasG));
        if (checkBox.isChecked())
        {
            gU.g_cMiradaOfensiva="Si";
        }
        else
        {
            gU.g_cMiradaOfensiva="No";
        }

        checkBox= (CheckBox) findViewById((R.id.cAmenzaSexualG));
        if (checkBox.isChecked())
        {
            gU.g_cAmenazaSexual="Si";
        }
        else
        {
            gU.g_cAmenazaSexual="No";
        }

        editText = (EditText) findViewById(R.id.eMujerViolenciaGeneroG);
        gU.g_porqueViolenciaGenero=editText.getText().toString();

        editText = (EditText) findViewById(R.id.eMiedoMujerG);
        gU.g_miedoMujer= editText.getText().toString();

        editText = (EditText) findViewById(R.id.eComentarioG);
        gU.g_comentarios=editText.getText().toString();
    }

    public void crearGenero(View view)
    {
        if (view.getId() == R.id.guardarFormG)
        {
            objetoGeneroUsuario();
            Boolean cuestionarioValido = gU.esValidoElFormulario();
            if(cuestionarioValido)
            {
                mensajeFinalizarCuestionario();
            }
            else
            {
                Toast.makeText(this, "Debe llenar todos los campos", Toast.LENGTH_LONG).show();
            }
        }
    }

    private void mensajeFinalizarCuestionario()
    {
        AlertDialog.Builder alertDialog = new AlertDialog.Builder(this);
        alertDialog.setMessage("¿Finalizar el cuestionario?")
                .setPositiveButton("Si", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        managerGenero.open();
                        long id = managerGenero.crearGenero(gU);
                        if (id!=-1){
                            Toast.makeText(Genero.this, "Agregado exitosamente", Toast.LENGTH_LONG).show();
                            Intent intent = new Intent(Genero.this, MainActivity.class);
                            startActivity(intent);
                        } else{
                            Toast.makeText(Genero.this, "Error al ingresar al habitante de la calle", Toast.LENGTH_LONG).show();
                        }
                    }
                })
        .setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });
        alertDialog.show();
    }

    private void spinnerSexo()
    {
        Spinner sexo = (Spinner) findViewById(R.id.sSexoG);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.sexo,
                R.layout.spinner_con_estilos);
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
        Spinner estadoCivil = (Spinner) findViewById(R.id.sEstadoCivilG);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.estadoCivil,
                R.layout.spinner_con_estilos);
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
                R.layout.spinner_con_estilos);
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
                R.layout.spinner_con_estilos);
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
                R.layout.spinner_con_estilos);
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
                R.layout.spinner_con_estilos);
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
        Spinner tieneHijos = (Spinner) findViewById(R.id.sTienesHijoG);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.tieneHijos,
                R.layout.spinner_con_estilos);
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
        spinnerNivelEscolaridad();
    }

    private void spinnerNivelEscolaridad()
    {
        Spinner nivelEscolaridad = (Spinner) findViewById(R.id.sNivelEscolaridadG);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.nivelEscolaridad,
                R.layout.spinner_con_estilos);
        nivelEscolaridad.setAdapter(adapter);
        nivelEscolaridad.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                gU.g_nivelEscolaridad= parent.getItemAtPosition(position).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                gU.g_nivelEscolaridad="";
            }
        });
        spinnerEstaTrabajando();
    }

    private void spinnerEstaTrabajando()
    {
        Spinner estaTrabajando = (Spinner) findViewById(R.id.sTrabajandoG);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.siNo,
                R.layout.spinner_con_estilos);
        estaTrabajando.setAdapter(adapter);
        estaTrabajando.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String estaTrabajando = parent.getItemAtPosition(position).toString();
                gU.g_actualmenteTrabaja= estaTrabajando;
                if (estaTrabajando.equals("Si"))
                {
                    findViewById(R.id.lTrabajandoEmpresaOrganizacionG).setVisibility(View.VISIBLE);
                    findViewById(R.id.sTrabajandoEmpresaOrganizacionG).setVisibility(View.VISIBLE);
                    findViewById(R.id.lArtesaniaG).setVisibility(View.VISIBLE);
                    findViewById(R.id.sArtesaniaG).setVisibility(View.VISIBLE);
                    findViewById(R.id.lTComercioG).setVisibility(View.VISIBLE);
                    findViewById(R.id.sTComercioG).setVisibility(View.VISIBLE);
                    findViewById(R.id.lTTurismoG).setVisibility(View.VISIBLE);
                    findViewById(R.id.sTTurismoG).setVisibility(View.VISIBLE);
                    findViewById(R.id.lAlimentosG).setVisibility(View.VISIBLE);
                    findViewById(R.id.sAlimentosG).setVisibility(View.VISIBLE);
                    findViewById(R.id.lIngresoLaboralG).setVisibility(View.VISIBLE);
                    findViewById(R.id.sIngresoLaboralG).setVisibility(View.VISIBLE);
                }
                else
                {
                    //Ocultando todos los campos relacionados al trabajo

                    findViewById(R.id.lTrabajandoEmpresaOrganizacionG).setVisibility(View.GONE);
                    Spinner spinner = (Spinner) findViewById(R.id.sTrabajandoEmpresaOrganizacionG);
                    spinner.setSelection(0);
                    spinner.setVisibility(View.GONE);

                    findViewById(R.id.lArtesaniaG).setVisibility(View.GONE);
                    spinner = (Spinner) findViewById(R.id.sArtesaniaG);
                    spinner.setSelection(0);
                    spinner.setVisibility(View.GONE);

                    findViewById(R.id.lTComercioG).setVisibility(View.GONE);
                    spinner = (Spinner) findViewById(R.id.sTComercioG);
                    spinner.setSelection(0);
                    spinner.setVisibility(View.GONE);

                    findViewById(R.id.lTTurismoG).setVisibility(View.GONE);
                    spinner = (Spinner) findViewById(R.id.sTTurismoG);
                    spinner.setSelection(0);
                    spinner.setVisibility(View.GONE);

                    findViewById(R.id.lAlimentosG).setVisibility(View.GONE);
                    spinner = (Spinner) findViewById(R.id.sAlimentosG);
                    spinner.setSelection(0);
                    spinner.setVisibility(View.GONE);

                    findViewById(R.id.lTrabajandoEmpresaOrganizacionG).setVisibility(View.GONE);
                    spinner= (Spinner) findViewById(R.id.sTrabajandoEmpresaOrganizacionG);
                    spinner.setSelection(0);
                    spinner.setVisibility(View.GONE);

                    findViewById(R.id.lETrabajaG).setVisibility(View.GONE);
                    EditText editText = (EditText) findViewById(R.id.eETrabajaG);
                    editText.setText("");
                    editText.setVisibility(View.GONE);

                    findViewById(R.id.lSinoTrabajaG).setVisibility(View.GONE);
                    editText = (EditText) findViewById(R.id.eSinoTrabajaG);
                    editText.setText("");
                    editText.setVisibility(View.GONE);

                    editText = (EditText) findViewById(R.id.eAlimentosG);
                    editText.setText("");
                    editText.setVisibility(View.GONE);

                    findViewById(R.id.lIngresoLaboralG).setVisibility(View.GONE);
                    spinner= (Spinner) findViewById(R.id.sIngresoLaboralG);
                    spinner.setSelection(0);
                    spinner.setVisibility(View.GONE);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                gU.g_actualmenteTrabaja="";
            }
        });
        spinnerEmpresaOrganizacion();
    }

    private void spinnerEmpresaOrganizacion()
    {
        Spinner trabajaEmpresaOrganizacion = (Spinner) findViewById(R.id.sTrabajandoEmpresaOrganizacionG);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.siNo,
                R.layout.spinner_con_estilos);
        trabajaEmpresaOrganizacion.setAdapter(adapter);
        trabajaEmpresaOrganizacion.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String estaEmpresaOrganizacion = parent.getItemAtPosition(position).toString();
                gU.g_TrabajaEnEmpresaOrganizacion= estaEmpresaOrganizacion;
                if (estaEmpresaOrganizacion.equals("Si"))
                {
                    findViewById(R.id.lETrabajaG).setVisibility(View.VISIBLE);
                    findViewById(R.id.eETrabajaG).setVisibility(View.VISIBLE);
                    findViewById(R.id.lSinoTrabajaG).setVisibility(View.GONE);
                    EditText editText = (EditText) findViewById(R.id.eSinoTrabajaG);
                    editText.setText("");
                    editText.setVisibility(View.GONE);
                }
                else if (estaEmpresaOrganizacion.equals("No"))
                {
                    findViewById(R.id.lETrabajaG).setVisibility(View.GONE);
                    EditText editText = (EditText) findViewById(R.id.eETrabajaG);
                    editText.setText("");
                    editText.setVisibility(View.GONE);
                    findViewById(R.id.lSinoTrabajaG).setVisibility(View.VISIBLE);
                    findViewById(R.id.eSinoTrabajaG).setVisibility(View.VISIBLE);

                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                gU.g_actualmenteTrabaja="";
            }
        });
        spinnerTrabajaArtesania();
    }

    private void spinnerTrabajaArtesania()
    {
        Spinner artesania = (Spinner) findViewById(R.id.sArtesaniaG);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.siNo,
                R.layout.spinner_con_estilos);
        artesania.setAdapter(adapter);
        artesania.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                gU.g_trabajaArtesania= parent.getItemAtPosition(position).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                gU.g_trabajaArtesania="";
            }
        });
        spinnerTrabajaComercio();
    }

    private void spinnerTrabajaComercio()
    {
        Spinner comercio = (Spinner) findViewById(R.id.sTComercioG);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.siNo,
                R.layout.spinner_con_estilos);
        comercio.setAdapter(adapter);
        comercio.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                gU.g_trabajaComercio= parent.getItemAtPosition(position).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                gU.g_trabajaComercio="";
            }
        });
        spinnerTrabajaTurismo();
    }

    private void spinnerTrabajaTurismo()
    {
        Spinner turismo = (Spinner) findViewById(R.id.sTTurismoG);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.siNo,
                R.layout.spinner_con_estilos);
        turismo.setAdapter(adapter);
        turismo.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                gU.g_trabajaTurismo= parent.getItemAtPosition(position).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                gU.g_trabajaTurismo="";
            }
        });
        spinnerManejoAlimento();
    }

    private void spinnerManejoAlimento()
    {
        Spinner manejoAlimento = (Spinner) findViewById(R.id.sAlimentosG);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.siNoOtro,
                R.layout.spinner_con_estilos);
        manejoAlimento.setAdapter(adapter);
        manejoAlimento.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String manejoAlimentoSeleccionado = parent.getItemAtPosition(position).toString();
                gU.g_trabajaManejoAlimentos= parent.getItemAtPosition(position).toString();
                if (manejoAlimentoSeleccionado.equals("OTRO"))
                {
                    findViewById(R.id.eAlimentosG).setVisibility(View.VISIBLE);
                }
                else
                {
                    findViewById(R.id.eAlimentosG).setVisibility(View.GONE);

                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                gU.g_trabajaManejoAlimentos="";
            }
        });
        spinnerIngresoLaboral();
    }

    private void spinnerIngresoLaboral()
    {
        Spinner ingresoLaboral = (Spinner) findViewById(R.id.sIngresoLaboralG);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.ingresoLaboralAproximadoG,
                R.layout.spinner_con_estilos);
        ingresoLaboral.setAdapter(adapter);
        ingresoLaboral.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                gU.g_ingresoLaboral= parent.getItemAtPosition(position).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                gU.g_ingresoLaboral="";
            }
        });
        spinnerIngresoLaboralFamiliar();
    }

    private void spinnerIngresoLaboralFamiliar()
    {
        Spinner spinnerIngresoLaboralFamiliar = (Spinner) findViewById(R.id.sIngresoLaboraFamiliarlG);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.ingresoUnidadFamiliarG,
                R.layout.spinner_con_estilos);
        spinnerIngresoLaboralFamiliar.setAdapter(adapter);
        spinnerIngresoLaboralFamiliar.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                gU.g_ingresoFamiliar= parent.getItemAtPosition(position).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                gU.g_ingresoFamiliar="";
            }
        });
        spinnerOrientacionPolitica();
    }

    private void spinnerOrientacionPolitica()
    {
        Spinner orientacionPolitica = (Spinner) findViewById(R.id.sOrientacionPoliticaG);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.orientacionPolitica,
                R.layout.spinner_con_estilos);
        orientacionPolitica.setAdapter(adapter);
        orientacionPolitica.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                gU.g_orientacionPolitica= parent.getItemAtPosition(position).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                gU.g_orientacionPolitica="";
            }
        });
        spinnerViolenciaSerMujer();
    }

    private void spinnerViolenciaSerMujer()
    {
        Spinner violenciaMujer = (Spinner) findViewById(R.id.sViolenciaMujerG);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.siNo,
                R.layout.spinner_con_estilos);
        violenciaMujer.setAdapter(adapter);
        violenciaMujer.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String seleccionViolenciaMujer = parent.getItemAtPosition(position).toString();
                gU.g_violenciaMujer= parent.getItemAtPosition(position).toString();
                if (seleccionViolenciaMujer.equals("Si"))
                {
                    findViewById(R.id.eViolenciaMujerG).setVisibility(View.VISIBLE);
                }
                else
                {
                    findViewById(R.id.eViolenciaMujerG).setVisibility(View.GONE);
                    gU.g_situacionViolencia="";
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                gU.g_violenciaMujer="";
            }
        });
        spinnerOpinionPiropo();
    }

    private void spinnerOpinionPiropo()
    {
        Spinner opinionPiropo = (Spinner) findViewById(R.id.sOpinionPiropoG);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.quePiropo,
                R.layout.spinner_con_estilos);
        opinionPiropo.setAdapter(adapter);
        opinionPiropo.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String quePiropo = parent.getItemAtPosition(position).toString();
                gU.g_quePiropo= parent.getItemAtPosition(position).toString();
                if (quePiropo.equals("Otro"))
                {
                    findViewById(R.id.eOpinionPiropoG).setVisibility(View.VISIBLE);
                }
                else
                {
                    findViewById(R.id.eOpinionPiropoG).setVisibility(View.GONE);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                gU.g_quePiropo="";
            }
        });
        spinnerOpinionAcoso();
    }

    private void spinnerOpinionAcoso()
    {
        Spinner acoso = (Spinner) findViewById(R.id.sOpinionAcosoG);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.opinionAcoso,
                R.layout.spinner_con_estilos);
        acoso.setAdapter(adapter);
        acoso.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                gU.g_opinionAcoso= parent.getItemAtPosition(position).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                gU.g_opinionAcoso="";
            }
        });
        spinnerMujerAcoso();
    }

    private void spinnerMujerAcoso()
    {
        Spinner acoso = (Spinner) findViewById(R.id.sAcosoContraMujerG);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.acosoMujerG,
                R.layout.spinner_con_estilos);
        acoso.setAdapter(adapter);
        acoso.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                gU.g_acosoSexual= parent.getItemAtPosition(position).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                gU.g_acosoSexual="";
            }
        });
        spinnerMujeResponsablerAcoso();
    }

    private void spinnerMujeResponsablerAcoso()
    {
        Spinner responsable = (Spinner) findViewById(R.id.sMujerResponsableAcosoG);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.acosoMujerResponsableG,
                R.layout.spinner_con_estilos);
        responsable.setAdapter(adapter);
        responsable.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                gU.g_mujerResponsable= parent.getItemAtPosition(position).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                gU.g_mujerResponsable="";
            }
        });
        spinnerAsedioSexual();
    }

    private void spinnerAsedioSexual()
    {
        Spinner asedio = (Spinner) findViewById(R.id.sAsedioSexualG);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.asedioSexualG,
                R.layout.spinner_con_estilos);
        asedio.setAdapter(adapter);
        asedio.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                gU.g_asedioSexual= parent.getItemAtPosition(position).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                gU.g_asedioSexual="";
            }
        });
        spinnerActitudVida();
    }

    private void spinnerActitudVida()
    {
        Spinner actitud = (Spinner) findViewById(R.id.sActitudesVidaG);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.actitudesVidaG,
                R.layout.spinner_con_estilos);
        actitud.setAdapter(adapter);
        actitud.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                gU.g_actitudesVida= parent.getItemAtPosition(position).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                gU.g_actitudesVida="";
            }
        });
        spinnerMecanismoLegal();
    }

    private void spinnerMecanismoLegal()
    {
        Spinner legal = (Spinner) findViewById(R.id.sMecanismoLegalG);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.mecanismoLegalG,
                R.layout.spinner_con_estilos);
        legal.setAdapter(adapter);
        legal.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                gU.g_mecanismoLegal= parent.getItemAtPosition(position).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                gU.g_mecanismoLegal="";
            }
        });
        spinnerDenunciaAcoso();
    }

    private void spinnerDenunciaAcoso()
    {
        Spinner denuncia = (Spinner) findViewById(R.id.sDenunciariaAcosoSexualG);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.siNo,
                R.layout.spinner_con_estilos);
        denuncia.setAdapter(adapter);
        denuncia.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String eleccionDenuncia= parent.getItemAtPosition(position).toString();
                gU.g_victimaAcoso= eleccionDenuncia;
                if(eleccionDenuncia.equals("No"))
                {
                    findViewById(R.id.eDenunciariaAcosoSexualG).setVisibility(View.VISIBLE);
                }else
                {
                    findViewById(R.id.eDenunciariaAcosoSexualG).setVisibility(View.GONE);
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                gU.g_victimaAcoso="";
            }
        });
        spinnerViolenciaGeneroMujer();
    }

    private void spinnerViolenciaGeneroMujer()
    {
        Spinner genero = (Spinner) findViewById(R.id.sMujerViolenciaGeneroG);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.acosoMujerResponsableG,
                R.layout.spinner_con_estilos);
        genero.setAdapter(adapter);
        genero.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                gU.g_violenciaGenero= parent.getItemAtPosition(position).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                gU.g_violenciaGenero="";
            }
        });
        spinnerExperienciaViolenciaGenero();
    }

    private void spinnerExperienciaViolenciaGenero()
    {
        Spinner experiencia = (Spinner) findViewById(R.id.sExperienciaViolenciaGeneroG);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.asedioSexualG,
                R.layout.spinner_con_estilos);
        experiencia.setAdapter(adapter);
        experiencia.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                gU.g_experienciaViolenciaGenero= parent.getItemAtPosition(position).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                gU.g_experienciaViolenciaGenero="";
            }
        });
        spinnerVotariaMujer();
    }

    private void spinnerVotariaMujer()
    {
        Spinner votaria = (Spinner) findViewById(R.id.sVotariaMujerG);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.siNo,
                R.layout.spinner_con_estilos);
        votaria.setAdapter(adapter);
        votaria.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                gU.g_votariaMujer= parent.getItemAtPosition(position).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                gU.g_votariaMujer="";
            }
        });
        spinnerDesistioDenuncia();
    }

    private void spinnerDesistioDenuncia()
    {
        Spinner desistio = (Spinner) findViewById(R.id.sDesistioDenunciaG);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.siNo,
                R.layout.spinner_con_estilos);
        desistio.setAdapter(adapter);
        desistio.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                gU.g_desistioDenuncia= parent.getItemAtPosition(position).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                gU.g_desistioDenuncia="";
            }
        });
        spinnerViolenciaFamiliar();
    }

    private void spinnerViolenciaFamiliar()
    {
        Spinner familiar = (Spinner) findViewById(R.id.sViolenciaGeneroFamiliarG);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.siNo,
                R.layout.spinner_con_estilos);
        familiar.setAdapter(adapter);
        familiar.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                gU.g_violenciaFamiliar= parent.getItemAtPosition(position).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                gU.g_violenciaFamiliar="";
            }
        });
        spinnerViolenciaPareja();
    }

    private void spinnerViolenciaPareja()
    {
        Spinner pareja = (Spinner) findViewById(R.id.sViolenciaGeneroParejaG);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.siNo,
                R.layout.spinner_con_estilos);
        pareja.setAdapter(adapter);
        pareja.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                gU.g_violenciaPareja= parent.getItemAtPosition(position).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                gU.g_violenciaPareja="";
            }
        });
        spinnerTratoIgualHombre();
    }

    private void spinnerTratoIgualHombre()
    {
        Spinner igual = (Spinner) findViewById(R.id.sTratoIgualHombreG);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.siNoInformacion,
                R.layout.spinner_con_estilos);
        igual.setAdapter(adapter);
        igual.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                gU.g_mismoTrato= parent.getItemAtPosition(position).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                gU.g_mismoTrato="";
            }
        });

    }

    public void onBackPressed() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage("¿Desea cancelar la creación del cuestionario?")
                .setPositiveButton("Si", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Intent intent = new Intent(Genero.this, MainActivity.class);
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