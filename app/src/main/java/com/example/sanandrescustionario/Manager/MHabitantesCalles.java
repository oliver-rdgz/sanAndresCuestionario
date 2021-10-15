package com.example.sanandrescustionario.Manager;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;

import com.example.sanandrescustionario.SQLITECuestionario;
import com.example.sanandrescustionario.usuarios.HabitantesCalles;

public class MHabitantesCalles {
    private SQLiteDatabase database;
    private final SQLITECuestionario dbCuestionario;
    private  String[] all_columns= {SQLITECuestionario.h_id ,SQLITECuestionario.h_nombre};

    public  long crearHabitanteCalle(HabitantesCalles hc){
        ContentValues values= new ContentValues();
        values.put(SQLITECuestionario.h_nombre,hc.h_nombre);
        values.put(SQLITECuestionario.h_identificacion,hc.h_identificacion);
        values.put(SQLITECuestionario.h_edad,hc.h_edad);
        values.put(SQLITECuestionario.h_sexo,hc.h_sexo);
        values.put(SQLITECuestionario.h_estadoCivil,hc.h_estadoCivil);
        values.put(SQLITECuestionario.h_genero,hc.h_genero);
        values.put(SQLITECuestionario.h_religion,hc.h_religion);
        values.put(SQLITECuestionario.h_grupoEC,hc.h_grupoEC);
        values.put(SQLITECuestionario.h_LProcedencia,hc.h_LProcedencia);
        values.put(SQLITECuestionario.h_viveActualmente,hc.h_viveActualmente);
        values.put(SQLITECuestionario.h_tienesHijos,hc.h_tienesHijos);
        values.put(SQLITECuestionario.h_CuantosHijos,hc.h_CuantosHijos);
        values.put(SQLITECuestionario.h_nivelEscolaridad,hc.h_nivelEscolaridad);
        values.put(SQLITECuestionario.h_actualmenteTrabaja,hc.h_actualmenteTrabaja);
        values.put(SQLITECuestionario.h_dondeTrabaja,hc.h_dondeTrabaja);
        values.put(SQLITECuestionario.h_trabajaArtesania,hc.h_trabajaArtesania);
        values.put(SQLITECuestionario.h_trabajaComercio,hc.h_trabajaComercio);
        values.put(SQLITECuestionario.h_trabajaTurismo,hc.h_trabajaTurismo);
        values.put(SQLITECuestionario.h_trabajaManejoAlimentos,hc.h_trabajaManejoAlimentos);
        values.put(SQLITECuestionario.h_orientacionPolitica,hc.h_orientacionPolitica);
        values.put(SQLITECuestionario.h_parientesSai,hc.h_parientesSai);
        values.put(SQLITECuestionario.h_conversacionFamiliares,hc.h_conversacionFamiliares);
        values.put(SQLITECuestionario.h_familiaresContacto,hc.h_familiaresContacto);
        values.put(SQLITECuestionario.h_razonesCalle,hc.h_razonesCalle);
        values.put(SQLITECuestionario.h_sanAndresAyuda,hc.h_sanAndresAyuda);
        values.put(SQLITECuestionario.h_uniddadesAtencion,hc.h_uniddadesAtencion);
        values.put(SQLITECuestionario.h_programaSocial,hc.h_programaSocial);
        values.put(SQLITECuestionario.h_cualPrograma,hc.h_cualPrograma);
        values.put(SQLITECuestionario.h_violenciaCalle,hc.h_violenciaCalle);
        values.put(SQLITECuestionario.h_tipoViolencia,hc.h_tipoViolencia);
        values.put(SQLITECuestionario.h_problemaSalud,hc.h_problemaSalud);
        values.put(SQLITECuestionario.h_tipoEnfermedad,hc.h_tipoEnfermedad);
        values.put(SQLITECuestionario.h_tieneVacuna,hc.h_tieneVacuna);
        values.put(SQLITECuestionario.h_razonesVacuna,hc.h_razonesVacuna);
        values.put(SQLITECuestionario.h_sanAndresMasAsistencia,hc.h_sanAndresMasAsistencia);
        values.put(SQLITECuestionario.h_embarazada,hc.h_embarazada);
        values.put(SQLITECuestionario.h_companeraEmbarazada,hc.h_companeraEmbarazada);
        values.put(SQLITECuestionario.h_alimentosSobrevivir,hc.h_alimentosSobrevivir);
        values.put(SQLITECuestionario.h_comentarios,hc.h_comentarios);
        long id= database.insert(SQLITECuestionario.T_HCalles,null,values);
        return  id ;
    }

    public MHabitantesCalles(Context context){this.dbCuestionario = new SQLITECuestionario(context);}

    public  void  close(){ dbCuestionario.close();}

    public void open() throws SQLException { database=dbCuestionario.getWritableDatabase();}

    public Cursor getHabitante(){
        Cursor cursor=database.query(SQLITECuestionario.T_HCalles, all_columns,null,null,null,null,null);
        return cursor;
    }
}
