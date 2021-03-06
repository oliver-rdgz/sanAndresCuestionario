package com.example.sanandrescustionario.Manager;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;

import com.example.sanandrescustionario.SQLITECuestionario;

public class DBmanagerPoblacionLGBTIQ {

    private SQLiteDatabase database;
    private final SQLITECuestionario dbCuestionario;
    private String[] allColumns = {SQLITECuestionario.l_id, SQLITECuestionario.l_nombre, SQLITECuestionario.l_identificacion, SQLITECuestionario.l_edad, SQLITECuestionario.l_sexo,
            SQLITECuestionario.l_estadoCivil, SQLITECuestionario.l_genero, SQLITECuestionario.l_religion,
            SQLITECuestionario.l_grupoEC,
            SQLITECuestionario.l_LProcedencia,
            SQLITECuestionario.l_viveActualmente,
            SQLITECuestionario.l_quienVive,
            SQLITECuestionario.l_tienesHijos,
            SQLITECuestionario.l_cuantosHijos,
            SQLITECuestionario.l_vivenTuHogar,
            SQLITECuestionario.l_nivelEscolaridad,
            SQLITECuestionario.l_actualmenteTrabaja,
            SQLITECuestionario.l_dondeTrabaja,
            SQLITECuestionario.l_sinoTrabaja,
            SQLITECuestionario.l_trabajaArtesania,
            SQLITECuestionario.l_trabajaComercio,
            SQLITECuestionario.l_trabajaTurismo,
            SQLITECuestionario.l_trabajaManejoAlimentos,
            SQLITECuestionario.l_ingresoLaboral,
            SQLITECuestionario.l_ingresoFamiliar,
            SQLITECuestionario.l_orientacionPolitica,
            SQLITECuestionario.l_discapacidad,
            SQLITECuestionario.l_organizacionLGBT,
            SQLITECuestionario.l_derechosLGBT,
            SQLITECuestionario.l_discriminacionLGBT,
            SQLITECuestionario.l_casoSufrido,
            SQLITECuestionario.l_orientacionSexual,
            SQLITECuestionario.l_intersexual,
            SQLITECuestionario.l_noExpresarGenero,
            SQLITECuestionario.l_razonesNoExpresar,
            SQLITECuestionario.l_familiaLGBT,
            SQLITECuestionario.l_quienes,
            SQLITECuestionario.l_reaccionFamiliar,
            SQLITECuestionario.l_violenciaLGBT,
            SQLITECuestionario.l_situacionDescrita,
            SQLITECuestionario.l_actosDiscriminacion,
            SQLITECuestionario.l_denunciasResuelven,
            SQLITECuestionario.l_porQueDenunciasResuelven,
            SQLITECuestionario.l_existenCampanasDiscriminacion,
            SQLITECuestionario.l_sanAndresApoyo,
            SQLITECuestionario.l_politicasPublicas,
            SQLITECuestionario.l_comentar
    };


    public DBmanagerPoblacionLGBTIQ(Context context){this.dbCuestionario = new SQLITECuestionario(context);}

    public void open() throws SQLiteException {
        database = dbCuestionario.getWritableDatabase();
    }

    public void close() {
        dbCuestionario.close();
    }

    public long GuardarCuestionario(String nombre, int identificacion, int edad ,  String sexo ,  String estadoCivil ,  String genero ,
                                  String religion, String grupoEC, String procedencia, String viveActualmente, String quienVive, String tienesHijos,
                                    int cuantosHijos, int vivenEnTuHogar, String nivelEscolaridad, String actualmenteTrabaja, String dondeTrabaja, String sinoTrabaja,
                                  String trabajaArtesania, String trabajaComercio, String trabajaTurismo, String trabajaManejoAlimentos, String ingresoLaboral,
                                  String ingresoFamiliar, String orientacionPolitica, String discapacidad, String organizacionLgbt, String derechosLgbt,
                                  String discriminacionLgbt, String casoSufrido, String orientacionSexual, String intersexual, String noExpresarGenero, String razonesNoExpresar,
                                  String familiaLgbt, String quienes, String reaccionFamiliar, String violenciaLgbt, String situacionDescrita, String actosDiscriminacion,
                                  String denunciasResuelven, String porQueDenunciasResuelven, String existenCampanasDiscriminacion, String sanAndresApoyo, String politicasPublicas, String comentar
    ){
        ContentValues values = new ContentValues();
        values.put(SQLITECuestionario.l_nombre, nombre);
        values.put(SQLITECuestionario.l_identificacion, identificacion);
        values.put(SQLITECuestionario.l_edad, edad);
        values.put(SQLITECuestionario.l_sexo, sexo);
        values.put(SQLITECuestionario.l_estadoCivil, estadoCivil);
        values.put(SQLITECuestionario.l_genero, genero);
        values.put(SQLITECuestionario.l_religion, religion);
        values.put(SQLITECuestionario.l_grupoEC, grupoEC);
        values.put(SQLITECuestionario.l_LProcedencia, procedencia);
        values.put(SQLITECuestionario.l_viveActualmente, viveActualmente);
        values.put(SQLITECuestionario.l_quienVive, quienVive);
        values.put(SQLITECuestionario.l_tienesHijos, tienesHijos);
        values.put(SQLITECuestionario.l_cuantosHijos, cuantosHijos);
        values.put(SQLITECuestionario.l_vivenTuHogar, vivenEnTuHogar);
        values.put(SQLITECuestionario.l_nivelEscolaridad, nivelEscolaridad);
        values.put(SQLITECuestionario.l_actualmenteTrabaja, actualmenteTrabaja);
        values.put(SQLITECuestionario.l_dondeTrabaja, dondeTrabaja);
        values.put(SQLITECuestionario.l_sinoTrabaja, sinoTrabaja);
        values.put(SQLITECuestionario.l_trabajaArtesania, trabajaArtesania);
        values.put(SQLITECuestionario.l_trabajaComercio, trabajaComercio);
        values.put(SQLITECuestionario.l_trabajaTurismo, trabajaTurismo);
        values.put(SQLITECuestionario.l_trabajaManejoAlimentos, trabajaManejoAlimentos);
        values.put(SQLITECuestionario.l_ingresoLaboral, ingresoLaboral);
        values.put(SQLITECuestionario.l_ingresoFamiliar, ingresoFamiliar);
        values.put(SQLITECuestionario.l_orientacionPolitica, orientacionPolitica);
        values.put(SQLITECuestionario.l_discapacidad, discapacidad);
        values.put(SQLITECuestionario.l_organizacionLGBT, organizacionLgbt);
        values.put(SQLITECuestionario.l_derechosLGBT, derechosLgbt);
        values.put(SQLITECuestionario.l_discriminacionLGBT, discriminacionLgbt);
        values.put(SQLITECuestionario.l_casoSufrido, casoSufrido);
        values.put(SQLITECuestionario.l_orientacionSexual, orientacionSexual);
        values.put(SQLITECuestionario.l_intersexual, intersexual);
        values.put(SQLITECuestionario.l_noExpresarGenero, noExpresarGenero);
        values.put(SQLITECuestionario.l_razonesNoExpresar, razonesNoExpresar);
        values.put(SQLITECuestionario.l_familiaLGBT, familiaLgbt);
        values.put(SQLITECuestionario.l_quienes, quienes);
        values.put(SQLITECuestionario.l_reaccionFamiliar, reaccionFamiliar);
        values.put(SQLITECuestionario.l_violenciaLGBT, violenciaLgbt);
        values.put(SQLITECuestionario.l_situacionDescrita, situacionDescrita);
        values.put(SQLITECuestionario.l_actosDiscriminacion, actosDiscriminacion);
        values.put(SQLITECuestionario.l_denunciasResuelven, denunciasResuelven);
        values.put(SQLITECuestionario.l_porQueDenunciasResuelven, porQueDenunciasResuelven);
        values.put(SQLITECuestionario.l_existenCampanasDiscriminacion, existenCampanasDiscriminacion);
        values.put(SQLITECuestionario.l_sanAndresApoyo, sanAndresApoyo);
        values.put(SQLITECuestionario.l_politicasPublicas, politicasPublicas);
        values.put(SQLITECuestionario.l_comentar, comentar);

        long id = database.insert(SQLITECuestionario.T_LGBT, null, values);
        return id;
    }

    public Cursor getLGBT(){
        Cursor cursor=database.query(SQLITECuestionario.T_LGBT, allColumns,null,null,null,null,null);
        return cursor;
    }

}
