package com.example.sanandrescustionario;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.sanandrescustionario.Manager.DBmanagerPoblacionLGBTIQ;

public class poblacionLGBTIQ extends AppCompatActivity {

    private DBmanagerPoblacionLGBTIQ dbManager;

    private EditText et_nombre, et_identificacion, et_edad, et_otroGenero, et_otraReligion, et_otroGrupoEC, et_procedencia, et_dondeVive, et_cuantosHijos,
                     et_cuantasVivenHogar, et_dondeTrabaja, et_sinoTrabaja, et_otroTrabajoManejoAlimentos, et_organizacionLGBT, et_casosSufridos,
                     et_orientacionSexual, et_razonesNoExpresar, et_quienesFamiliares, et_reaccionFamiliar, et_situacionesDescritas, et_porQueDenunciasResuelven,
                     et_sanAndresApoyo, et_politicasPublicas, et_comentar;

    //private int etCuantosHijos;

    public String sexoSt, estadoCivilSt, generoSt, religionSt, grupoEtnicoSt, conQuienViveSt, tieneHijosSt,
                  nivelDeEscolaridadSt, estaTrabajandoSt, trabajaArtesaniaSt, trabajaComercioSt, trabajaTurismoSt, trabajaVentaManejoAlimentosSt,
                  ingresoLaboralAproSt, ingresoUnidadFamiliarSt, orientacionPoliticaSt, pregunta1St, pregunta3St, pregunta4St, pregunta7St, pregunta8St,
                  pregunta9St, pregunta11St, pregunta13St, pregunta14St, pregunta15St;

    public Spinner sexoSp;

    //boolean generoBoo, religionBoo, grupoEtnicoBoo, tieneHijosBoo, trabajaManevoVentaAliBoo, pregunta5Boo, pregunta8Boo, pregunta9Boo, pregunta14Boo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cuestionario_poblacion_lgbtiq);
        //dbManager = new DBManagerComunidadLgbt(getApplicationContext(), "Cuestionario_SanAndres", null, 1);
        dbManager = new DBmanagerPoblacionLGBTIQ(this);

        et_nombre = (EditText)findViewById(R.id.editTextNombreL);
        et_identificacion = (EditText)findViewById(R.id.editTextIdentificacionL);
        et_edad = (EditText)findViewById(R.id.editTextEdadL);
        et_otroGenero = (EditText)findViewById(R.id.eGeneroOL);
        et_otraReligion = (EditText)findViewById(R.id.eReligionOL);
        et_otroGrupoEC = (EditText)findViewById(R.id.eGrupoetnicoL);
        et_procedencia = (EditText)findViewById(R.id.eProcedenciaL);
        et_dondeVive = (EditText)findViewById(R.id.eViveActualmenteL);
        et_cuantosHijos = (EditText)findViewById(R.id.eTieneHijoL);
        et_cuantasVivenHogar = (EditText)findViewById(R.id.eCuantasPersonasVivenHogarL);
        et_dondeTrabaja = (EditText)findViewById(R.id.eETrabajaL);
        et_sinoTrabaja = (EditText)findViewById(R.id.eSinoTrabajaL);
        et_otroTrabajoManejoAlimentos = (EditText)findViewById(R.id.eAlimentosL);
        et_organizacionLGBT = (EditText)findViewById(R.id.ePregunta2L);
        et_casosSufridos = (EditText)findViewById(R.id.ePregunta5L);
        et_orientacionSexual = (EditText)findViewById(R.id.ePregunta6L);
        et_razonesNoExpresar = (EditText)findViewById(R.id.eExtra1Pregunta8L);
        et_quienesFamiliares = (EditText)findViewById(R.id.eExtra1Pregunta9L);
        et_reaccionFamiliar = (EditText)findViewById(R.id.ePregunta10L);
        et_situacionesDescritas = (EditText)findViewById(R.id.ePregunta12L);
        et_porQueDenunciasResuelven = (EditText)findViewById(R.id.eExtra1Pregunta14L);
        et_sanAndresApoyo = (EditText)findViewById(R.id.ePregunta16L);
        et_politicasPublicas = (EditText)findViewById(R.id.ePregunta17L);
        et_comentar = (EditText)findViewById(R.id.ePregunta18L);

        spinnerSexo();
    }

    public void Enviar(View view){
        String nombre = et_nombre.getText().toString();
        String identificacion = et_identificacion.getText().toString();
        String edad = et_edad.getText().toString();
        String otroGenero = et_otroGenero.getText().toString();
        String otraReligion = et_otraReligion.getText().toString();
        String otroGrupoEC = et_otroGrupoEC.getText().toString();
        String procedencia = et_procedencia.getText().toString();
        String dondeVive = et_dondeVive.getText().toString();
        String cuantosHijos = et_cuantosHijos.getText().toString();
        String cuantasVivenHogar = et_cuantasVivenHogar.getText().toString();
        String dondeTrabaja = et_dondeTrabaja.getText().toString();
        String sinoTrabaja = et_sinoTrabaja.getText().toString();
        String otroTrabajoManejoAlimentos = et_otroTrabajoManejoAlimentos.getText().toString();
        String organizacionLGBTQI = et_organizacionLGBT.getText().toString();
        String casosSufridos = et_casosSufridos.getText().toString();
        String orientacionSexual = et_orientacionSexual.getText().toString();
        String razonesNoExpresar = et_razonesNoExpresar.getText().toString();
        String quienesFamiliares = et_quienesFamiliares.getText().toString();
        String reaccionFamiliar = et_reaccionFamiliar.getText().toString();
        String situacionesDescritas = et_situacionesDescritas.getText().toString();
        String porQueDenunciasResuelven = et_porQueDenunciasResuelven.getText().toString();
        String sanAndresApoyo = et_sanAndresApoyo.getText().toString();
        String politicasPublicas = et_politicasPublicas.getText().toString();
        String comentar = et_comentar.getText().toString();

        if(identificacion.equals("")){
            identificacion = "0";
        }

        if(edad.equals("")){
            edad = "0";
        }

        if(cuantosHijos.equals("")){
            cuantosHijos = "0";
        }

        if(cuantasVivenHogar.equals("")){
            cuantasVivenHogar = "0";
        }

        int idInt = Integer.parseInt(identificacion);
        int edadInt = Integer.parseInt(edad);
        int cuantosHijosInt = Integer.parseInt(cuantosHijos);
        int cuantasVivenHogarInt = Integer.parseInt(cuantasVivenHogar);

        dbManager.open();
        dbManager.GuardarCuestionario(nombre, idInt, edadInt, sexoSt, estadoCivilSt, generoSt, otroGenero, religionSt, otraReligion, grupoEtnicoSt, otroGrupoEC,
                                      procedencia, dondeVive, conQuienViveSt, tieneHijosSt, cuantosHijosInt, cuantasVivenHogarInt, nivelDeEscolaridadSt, estaTrabajandoSt,
                                      dondeTrabaja, sinoTrabaja, trabajaArtesaniaSt, trabajaComercioSt, trabajaTurismoSt, trabajaVentaManejoAlimentosSt, otroTrabajoManejoAlimentos,
                                      ingresoLaboralAproSt, ingresoUnidadFamiliarSt, orientacionPoliticaSt, pregunta1St, organizacionLGBTQI, pregunta3St, pregunta4St, casosSufridos,
                                      orientacionSexual, pregunta7St, pregunta8St, razonesNoExpresar, pregunta9St, quienesFamiliares, reaccionFamiliar, pregunta11St, situacionesDescritas,
                                      pregunta13St, pregunta14St, porQueDenunciasResuelven, pregunta15St, sanAndresApoyo, politicasPublicas, comentar);

        Toast.makeText(this,"Guardado correctamente", Toast.LENGTH_SHORT).show();
    }

    public void validarEnvio(){
        //if(generoBoo == false){
        //    String genero = et_otroGenero.getText().toString();
        //    generoSt = genero;
        //}
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
                    et_otroGenero.setText("");
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
                    et_otraReligion.setText("");
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
                    et_otroGrupoEC.setText("");
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
                    et_cuantosHijos.setText("0");
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
        spinnerTrabajaArtesania();
    }

    private void spinnerTrabajaArtesania()
    {
        Spinner trabajaArtesania = (Spinner) findViewById(R.id.sArtesaniaL);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.trabajaConArtesaniaL,
                android.R.layout.simple_spinner_item);
        trabajaArtesania.setAdapter(adapter);
        trabajaArtesania.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                trabajaArtesaniaSt = parent.getItemAtPosition(position).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }

        });
        spinnerTrabajaComercio();
    }

    private void spinnerTrabajaComercio()
    {
        Spinner trabajaComercio = (Spinner) findViewById(R.id.sTComercioL);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.trabajaConComercioL,
                android.R.layout.simple_spinner_item);
        trabajaComercio.setAdapter(adapter);
        trabajaComercio.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                trabajaComercioSt = parent.getItemAtPosition(position).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }

        });
        spinnerTrabajaTurismo();
    }

    private void spinnerTrabajaTurismo()
    {
        Spinner trabajaTurismo = (Spinner) findViewById(R.id.sTurismoL);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.trabajaConTurismoL,
                android.R.layout.simple_spinner_item);
        trabajaTurismo.setAdapter(adapter);
        trabajaTurismo.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                trabajaTurismoSt = parent.getItemAtPosition(position).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }

        });
        spinnerTrabajaManejoVentaAlimentos();
    }

    private void spinnerTrabajaManejoVentaAlimentos()
    {
        Spinner trabajaManejoVentaAlimentos = (Spinner) findViewById(R.id.sAlimentosL);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.trabajaConActManejoVentaAlimentosL,
                android.R.layout.simple_spinner_item);
        trabajaManejoVentaAlimentos.setAdapter(adapter);
        trabajaManejoVentaAlimentos.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                trabajaVentaManejoAlimentosSt = parent.getItemAtPosition(position).toString();
                if(trabajaVentaManejoAlimentosSt.equals("Otro"))
                {
                    findViewById(R.id.eAlimentosL).setVisibility(View.VISIBLE);
                }
                else
                {
                    findViewById(R.id.eAlimentosL).setVisibility(View.GONE);
                    et_otroTrabajoManejoAlimentos.setText("");
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }

        });
        spinnerIngresoLaboralAproximado();
    }

    private void spinnerIngresoLaboralAproximado()
    {
        Spinner ingresoLaboralAproximado = (Spinner) findViewById(R.id.sIngresoLaboralL);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.ingresoLaboralAproximadoL,
                android.R.layout.simple_spinner_item);
        ingresoLaboralAproximado.setAdapter(adapter);
        ingresoLaboralAproximado.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                ingresoLaboralAproSt = parent.getItemAtPosition(position).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }

        });
        spinnerIngresoUnidadFamiliar();
    }

    private void spinnerIngresoUnidadFamiliar()
    {
        Spinner ingresoUnidadFamiliar = (Spinner) findViewById(R.id.sIngresoUnidadFamiliarL);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.ingresoUnidadFamiliarL,
                android.R.layout.simple_spinner_item);
        ingresoUnidadFamiliar.setAdapter(adapter);
        ingresoUnidadFamiliar.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                ingresoUnidadFamiliarSt = parent.getItemAtPosition(position).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }

        });
        spinnerOrientacionPolitica();
    }

    private void spinnerOrientacionPolitica()
    {
        Spinner orientacionPolitica = (Spinner) findViewById(R.id.sOrientacionPoliticaL);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.orientacionPoliticaL,
                android.R.layout.simple_spinner_item);
        orientacionPolitica.setAdapter(adapter);
        orientacionPolitica.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                orientacionPoliticaSt = parent.getItemAtPosition(position).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }

        });
        spinnerPregunta1();
    }

    private void spinnerPregunta1()
    {
        Spinner pregunta1 = (Spinner) findViewById(R.id.sPregunta1);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.valoresPregunta1L,
                android.R.layout.simple_spinner_item);
        pregunta1.setAdapter(adapter);
        pregunta1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                pregunta1St = parent.getItemAtPosition(position).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }

        });
        spinnerPregunta3();
    }

    private void spinnerPregunta3()
    {
        Spinner pregunta3 = (Spinner) findViewById(R.id.sPregunta3);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.valoresPregunta3L,
                android.R.layout.simple_spinner_item);
        pregunta3.setAdapter(adapter);
        pregunta3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                pregunta3St = parent.getItemAtPosition(position).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }

        });
        spinnerPregunta4();
    }

    private void spinnerPregunta4()
    {
        Spinner pregunta4 = (Spinner) findViewById(R.id.sPregunta4);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.valoresPregunta4L,
                android.R.layout.simple_spinner_item);
        pregunta4.setAdapter(adapter);
        pregunta4.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                pregunta4St = parent.getItemAtPosition(position).toString();
                if(pregunta4St.equals("Si"))
                {
                    findViewById(R.id.ePregunta5L).setVisibility(View.VISIBLE);
                }
                else
                {
                    findViewById(R.id.ePregunta5L).setVisibility(View.GONE);
                    et_casosSufridos.setText("");

                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }

        });
        spinnerPregunta7();
    }

    private void spinnerPregunta7()
    {
        Spinner pregunta7 = (Spinner) findViewById(R.id.sPregunta7);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.valoresPregunta7L,
                android.R.layout.simple_spinner_item);
        pregunta7.setAdapter(adapter);
        pregunta7.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                pregunta7St = parent.getItemAtPosition(position).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }

        });
        spinnerPregunta8();
    }

    private void spinnerPregunta8()
    {
        Spinner pregunta8 = (Spinner) findViewById(R.id.sPregunta8);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.valoresPregunta8L,
                android.R.layout.simple_spinner_item);
        pregunta8.setAdapter(adapter);
        pregunta8.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                pregunta8St = parent.getItemAtPosition(position).toString();
                if(pregunta8St.equals("Si"))
                {
                    findViewById(R.id.eExtra1Pregunta8L).setVisibility(View.VISIBLE);
                }
                else
                {
                    findViewById(R.id.eExtra1Pregunta8L).setVisibility(View.GONE);
                    et_razonesNoExpresar.setText("");
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }

        });
        spinnerPregunta9();
    }

    private void spinnerPregunta9()
    {
        Spinner pregunta9 = (Spinner) findViewById(R.id.sPregunta9);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.valoresPregunta9L,
                android.R.layout.simple_spinner_item);
        pregunta9.setAdapter(adapter);
        pregunta9.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                pregunta9St = parent.getItemAtPosition(position).toString();
                if(pregunta9St.equals("Si"))
                {
                    findViewById(R.id.eExtra1Pregunta9L).setVisibility(View.VISIBLE);
                }
                else
                {
                    findViewById(R.id.eExtra1Pregunta9L).setVisibility(View.GONE);
                    et_quienesFamiliares.setText("");
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }

        });
        spinnerPregunta11();
    }

    private void spinnerPregunta11()
    {
        Spinner pregunta11 = (Spinner) findViewById(R.id.sPregunta11);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.valoresPregunta11L,
                android.R.layout.simple_spinner_item);
        pregunta11.setAdapter(adapter);
        pregunta11.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                pregunta11St = parent.getItemAtPosition(position).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }

        });
        spinnerPregunta13();
    }

    private void spinnerPregunta13()
    {
        Spinner pregunta13 = (Spinner) findViewById(R.id.sPregunta13);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.valoresPregunta13L,
                android.R.layout.simple_spinner_item);
        pregunta13.setAdapter(adapter);
        pregunta13.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                pregunta13St = parent.getItemAtPosition(position).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }

        });
        spinnerPregunta14();
    }

    private void spinnerPregunta14()
    {
        Spinner pregunta14 = (Spinner) findViewById(R.id.sPregunta14);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.valoresPregunta14L,
                android.R.layout.simple_spinner_item);
        pregunta14.setAdapter(adapter);
        pregunta14.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                pregunta14St = parent.getItemAtPosition(position).toString();
                if(pregunta14St.equals("Si"))
                {
                    findViewById(R.id.eExtra1Pregunta14L).setVisibility(View.VISIBLE);
                }
                else
                {
                    findViewById(R.id.eExtra1Pregunta14L).setVisibility(View.GONE);
                    et_porQueDenunciasResuelven.setText("");
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }

        });
        spinnerPregunta15();
    }

    private void spinnerPregunta15()
    {
        Spinner pregunta15 = (Spinner) findViewById(R.id.sPregunta15);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.valoresPregunta15L,
                android.R.layout.simple_spinner_item);
        pregunta15.setAdapter(adapter);
        pregunta15.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                pregunta15St = parent.getItemAtPosition(position).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }

        });
    }

}
