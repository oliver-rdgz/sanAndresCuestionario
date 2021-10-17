package com.example.sanandrescustionario.Manager;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;

import com.example.sanandrescustionario.SQLITECuestionario;

public class DBmanagerPoblacionLGBTIQ {

    private SQLiteDatabase database;
    private final SQLITECuestionario dbCuestionario;
    private String[] allColumns = {SQLITECuestionario.l_id, SQLITECuestionario.l_nombre, SQLITECuestionario.l_identificacion, SQLITECuestionario.l_edad, SQLITECuestionario.l_sexo,
            SQLITECuestionario.l_estadoCivil, SQLITECuestionario.l_genero, SQLITECuestionario.l_religion, SQLITECuestionario.l_grupoEC,
            SQLITECuestionario.l_LProcedencia,
            SQLITECuestionario.l_viveActualmente,
            SQLITECuestionario.l_quienVive,
            SQLITECuestionario.l_tienesHijos,
            SQLITECuestionario.l_cuantosHijos,
            SQLITECuestionario.l_vivenTuHogar,
            SQLITECuestionario.l_nivelEscolaridad,
            SQLITECuestionario.l_actualmenteTrabaja,
            SQLITECuestionario.l_dondeTrabaja,
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

    public long GuardarComentario(String nombre, String identificacion, String edad ,  String sexo ,  String estadoCivil ,  String direccion ,
                                  String correo ,  String nivelEstudio ,  String comentario){
        ContentValues values = new ContentValues();
        values.put(SQLITECuestionario.l_nombre, nombre);
        values.put(SQLITECuestionario.l_identificacion, identificacion);
        values.put(SQLITECuestionario.l_edad, edad);
        values.put(SQLITECuestionario.l_sexo, sexo);
        values.put(SQLITECuestionario.l_estadoCivil, estadoCivil);
        values.put(SQLITECuestionario.l_genero, direccion);
        values.put(SQLITECuestionario.l_religion, correo);
        values.put(SQLITECuestionario.l_grupoEC, nivelEstudio);
        values.put(SQLITECuestionario.l_LProcedencia, comentario);
        values.put(SQLITECuestionario.l_viveActualmente, comentario);
        values.put(SQLITECuestionario.l_quienVive, comentario);
        values.put(SQLITECuestionario.l_tienesHijos, comentario);
        values.put(SQLITECuestionario.l_cuantosHijos, comentario);
        values.put(SQLITECuestionario.l_vivenTuHogar, comentario);
        values.put(SQLITECuestionario.l_nivelEscolaridad, comentario);
        values.put(SQLITECuestionario.l_actualmenteTrabaja, comentario);
        values.put(SQLITECuestionario.l_dondeTrabaja, comentario);
        values.put(SQLITECuestionario.l_trabajaArtesania, comentario);
        values.put(SQLITECuestionario.l_trabajaComercio, comentario);
        values.put(SQLITECuestionario.l_trabajaTurismo, comentario);
        values.put(SQLITECuestionario.l_trabajaManejoAlimentos, comentario);
        values.put(SQLITECuestionario.l_ingresoLaboral, comentario);
        values.put(SQLITECuestionario.l_ingresoFamiliar, comentario);
        values.put(SQLITECuestionario.l_orientacionPolitica, comentario);
        values.put(SQLITECuestionario.l_discapacidad, comentario);
        values.put(SQLITECuestionario.l_organizacionLGBT, comentario);
        values.put(SQLITECuestionario.l_derechosLGBT, comentario);
        values.put(SQLITECuestionario.l_discriminacionLGBT, comentario);
        values.put(SQLITECuestionario.l_casoSufrido, comentario);

        long id = database.insert(SQLITECuestionario.T_LGBT, null, values);
        return id;
    }

}
