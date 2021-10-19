package com.example.sanandrescustionario.Manager;

import android.content.ContentValues;
import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;

import com.example.sanandrescustionario.SQLITECuestionario;
import com.example.sanandrescustionario.usuarios.GeneroUsuario;

public class MGenero {
    private SQLiteDatabase database;
    private final SQLITECuestionario dbCuestionario;
    private  String[] all_columns= {SQLITECuestionario.g_id ,SQLITECuestionario.g_nombre};

    public long crearGenero(GeneroUsuario genero)
    {
        ContentValues values= new ContentValues();
        values.put(SQLITECuestionario.g_nombre, genero.g_nombre);
        values.put(SQLITECuestionario.g_identificacion, genero.g_identificacion);
        values.put(SQLITECuestionario.g_edad, genero.g_edad);
        values.put(SQLITECuestionario.g_sexo, genero.g_sexo);
        values.put(SQLITECuestionario.g_estadoCivil, genero.g_estadoCivil);
        values.put(SQLITECuestionario.g_genero, genero.g_genero);
        values.put(SQLITECuestionario.g_religion, genero.g_religion);
        values.put(SQLITECuestionario.g_grupoEC, genero.g_grupoEC);
        values.put(SQLITECuestionario.g_LProcedencia, genero.g_LProcedencia);
        values.put(SQLITECuestionario.g_viveActualmente, genero.g_viveActualmente);
        values.put(SQLITECuestionario.g_quienVive, genero.g_quienVive);
        values.put(SQLITECuestionario.g_tienesHijos, genero.g_tienesHijos);
        values.put(SQLITECuestionario.g_cuantosHijos, genero.g_cuantosHijos);
        values.put(SQLITECuestionario.g_esPadre, genero.g_esPadre);
        values.put(SQLITECuestionario.g_esMadre, genero.g_esMadre);
        values.put(SQLITECuestionario.g_esEsposoa, genero.g_esEsposoa);
        values.put(SQLITECuestionario.g_esHijoa, genero.g_esHijoa);
        values.put(SQLITECuestionario.g_esHermanoa, genero.g_esHermanoa);
        values.put(SQLITECuestionario.g_esOtro, genero.g_esOtro);
        values.put(SQLITECuestionario.g_vivenTuHogar, genero.g_vivenTuHogar);
        values.put(SQLITECuestionario.g_nivelEscolaridad, genero.g_nivelEscolaridad);
        values.put(SQLITECuestionario.g_actualmenteTrabaja, genero.g_actualmenteTrabaja);
        values.put(SQLITECuestionario.g_dondeTrabaja, genero.g_dondeTrabaja);
        values.put(SQLITECuestionario.g_sinoTrabaja, genero.g_sinoTrabaja);
        values.put(SQLITECuestionario.g_trabajaArtesania, genero.g_trabajaArtesania);
        values.put(SQLITECuestionario.g_trabajaComercio, genero.g_trabajaComercio);
        values.put(SQLITECuestionario.g_trabajaTurismo, genero.g_trabajaTurismo);
        values.put(SQLITECuestionario.g_trabajaManejoAlimentos, genero.g_trabajaManejoAlimentos);
        values.put(SQLITECuestionario.g_ingresoLaboral, genero.g_ingresoLaboral);
        values.put(SQLITECuestionario.g_ingresoFamiliar, genero.g_ingresoFamiliar);
        values.put(SQLITECuestionario.g_orientacionPolitica, genero.g_orientacionPolitica);
        values.put(SQLITECuestionario.g_temaGenero, genero.g_temaGenero);
        values.put(SQLITECuestionario.g_violenciaMujer, genero.g_violenciaMujer);
        values.put(SQLITECuestionario.g_situacionViolencia, genero.g_situacionViolencia);
        values.put(SQLITECuestionario.g_quePiropo, genero.g_quePiropo);
        values.put(SQLITECuestionario.g_opinionAcoso, genero.g_opinionAcoso);
        values.put(SQLITECuestionario.g_fComentarioApariencia, genero.g_fComentarioApariencia);
        values.put(SQLITECuestionario.g_fComentarioAparienciaCuerpo, genero.g_fComentarioAparienciaCuerpo);
        values.put(SQLITECuestionario.g_fComentarioVestirme, genero.g_fComentarioVestirme);
        values.put(SQLITECuestionario.g_fSilbidos, genero.g_fSilbidos);
        values.put(SQLITECuestionario.g_fMiradasSexuales, genero.g_fMiradasSexuales);
        values.put(SQLITECuestionario.g_fPalabrasObsenas, genero.g_fPalabrasObsenas);
        values.put(SQLITECuestionario.g_fGestoSexual, genero.g_fGestoSexual);
        values.put(SQLITECuestionario.g_fTocamientos, genero.g_fTocamientos);
        values.put(SQLITECuestionario.g_fFavorSexual, genero.g_fFavorSexual);
        values.put(SQLITECuestionario.g_fCitaFuera, genero.g_fCitaFuera);
        values.put(SQLITECuestionario.g_fInsultoSexual, genero.g_fInsultoSexual);
        values.put(SQLITECuestionario.g_fMiradaOfensiva, genero.g_fMiradaOfensiva);
        values.put(SQLITECuestionario.g_fAmenazaSexual, genero.g_fAmenazaSexual);
        values.put(SQLITECuestionario.g_acosoSexual, genero.g_acosoSexual);
        values.put(SQLITECuestionario.g_mujerResponsable, genero.g_mujerResponsable);
        values.put(SQLITECuestionario.g_asedioSexual, genero.g_asedioSexual);
        values.put(SQLITECuestionario.g_actitudesVida, genero.g_actitudesVida);
        values.put(SQLITECuestionario.g_mecanismoLegal, genero.g_mecanismoLegal);
        values.put(SQLITECuestionario.g_victimaAcoso, genero.g_victimaAcoso);
        values.put(SQLITECuestionario.g_victimaPorque, genero.g_victimaPorque);
        values.put(SQLITECuestionario.g_cComentarioApariencia, genero.g_cComentarioApariencia);
        values.put(SQLITECuestionario.g_cComentarioAparienciaCuerpo, genero.g_cComentarioAparienciaCuerpo);
        values.put(SQLITECuestionario.g_cComentarioVestirme, genero.g_cComentarioVestirme);
        values.put(SQLITECuestionario.g_cSilbidos, genero.g_cSilbidos);
        values.put(SQLITECuestionario.g_cMiradasSexuales, genero.g_cMiradasSexuales);
        values.put(SQLITECuestionario.g_cPalabrasObsenas, genero.g_cPalabrasObsenas);
        values.put(SQLITECuestionario.g_cGestoSexual, genero.g_cGestoSexual);
        values.put(SQLITECuestionario.g_cTocamientos, genero.g_cTocamientos);
        values.put(SQLITECuestionario.g_cFavorSexual, genero.g_cFavorSexual);
        values.put(SQLITECuestionario.g_cCitaFuera, genero.g_cCitaFuera);
        values.put(SQLITECuestionario.g_cInsultoSexual, genero.g_cInsultoSexual);
        values.put(SQLITECuestionario.g_cMiradaOfensiva, genero.g_cMiradaOfensiva);
        values.put(SQLITECuestionario.g_cAmenazaSexual, genero.g_cAmenazaSexual);
        values.put(SQLITECuestionario.g_violenciaGenero, genero.g_violenciaGenero);
        values.put(SQLITECuestionario.g_porqueViolenciaGenero, genero.g_porqueViolenciaGenero);
        values.put(SQLITECuestionario.g_experienciaViolenciaGenero, genero.g_experienciaViolenciaGenero);
        values.put(SQLITECuestionario.g_votariaMujer, genero.g_votariaMujer);
        values.put(SQLITECuestionario.g_desistioDenuncia, genero.g_desistioDenuncia);
        values.put(SQLITECuestionario.g_violenciaFamiliar, genero.g_violenciaFamiliar);
        values.put(SQLITECuestionario.g_violenciaPareja, genero.g_violenciaPareja);
        values.put(SQLITECuestionario.g_mismoTrato, genero.g_mismoTrato);
        values.put(SQLITECuestionario.g_miedoMujer, genero.g_miedoMujer);
        values.put(SQLITECuestionario.g_comentarios, genero.g_comentarios);

        long id= database.insert(SQLITECuestionario.T_genero,null,values);
        return  id ;
    }

    public MGenero (Context context){this.dbCuestionario = new SQLITECuestionario(context);}

    public  void  close(){ dbCuestionario.close();}
    public void open() throws SQLException { database=dbCuestionario.getWritableDatabase();}

}
