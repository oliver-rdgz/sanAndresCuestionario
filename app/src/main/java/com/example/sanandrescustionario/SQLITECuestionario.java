package com.example.sanandrescustionario;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import androidx.annotation.Nullable;

public class SQLITECuestionario extends SQLiteOpenHelper {

    private  static  String nombre_BD="Cuestionario_SanAndres";
    private  static final int version_BD=1;

    //tabla habitantes de la calle variables
    public  static  final String T_HCalles="habitantescalle";
    public  static  final String  h_id="_id";
    public  static  final String  h_nombre="nombre";
    public  static  final String  h_identificacion="identificacion";
    public  static  final String  h_edad="edad";
    public  static  final String  h_sexo="sexo";
    public  static  final String  h_estadoCivil="estadoCivil";
    public  static  final String  h_genero="genero";
    public  static  final String  h_religion="religion";
    public  static  final String  h_grupoEC="grupoEC";
    public  static  final String  h_LProcedencia="LProcedencia";
    public  static  final String  h_viveActualmente="viveActualmente";
    public  static  final String  h_tienesHijos="tienesHijos";
    public  static  final String  h_CuantosHijos="cuantosHijos";
    public  static  final String  h_nivelEscolaridad="nivelEscolaridad";
    public  static  final String  h_actualmenteTrabaja="actualmenteTrabaja";
    public  static  final String  h_dondeTrabaja="dondeTrabaja";
    public  static  final String  h_trabajaArtesania="trabajaArtesania";
    public  static  final String  h_sinoTrabaja="sinoTrabaja";
    public  static  final String  h_trabajaComercio="trabajaComercio";
    public  static  final String  h_trabajaTurismo="trabajaTurismo";
    public  static  final String  h_trabajaManejoAlimentos="trabajaManejoAlimentos";
    public  static  final String  h_orientacionPolitica="orientacionPolitica";
    public  static  final String  h_parientesSai="parientesSai";
    public  static  final String  h_conversacionFamiliares="conversacionFamiliares";
    public  static  final String  h_familiaresContacto="familiaresContacto";
    public  static  final String  h_razonesCalle="razonesCalle";
    public  static  final String  h_sanAndresAyuda="sanAndresAyuda";
    public  static  final String  h_uniddadesAtencion="unidadesAtencion";
    public  static  final String  h_programaSocial="programaSocial";
    public  static  final String  h_cualPrograma="cualPrograma";
    public  static  final String  h_violenciaCalle="violenciaCalle";
    public  static  final String  h_tipoViolencia="tipoViolencia";
    public  static  final String  h_problemaSalud="problemaSalud";
    public  static  final String  h_tipoEnfermedad="tipoEnfermedad";
    public  static  final String  h_tieneVacuna="tieneVacuna";
    public  static  final String  h_razonesVacuna="razonesVacuna";
    public  static  final String  h_sanAndresMasAsistencia="sanAndresMasAsistencia";
    public  static  final String  h_embarazada="embarazada";
    public  static  final String  h_companeraEmbarazada="companeraEmbarazada";
    public  static  final String  h_alimentosSobrevivir="alimentosSobrevivir";
    public  static  final String  h_comentarios="comentarios";

    //tabla LGBTQI de la calle variables
    public  static  final String T_LGBT="lgbt";
    public  static  final String  l_id="_id";
    public  static  final String  l_nombre="nombre";
    public  static  final String  l_identificacion="identificacion";
    public  static  final String  l_edad="edad";
    public  static  final String  l_sexo="sexo";
    public  static  final String  l_estadoCivil="estadoCivil";
    public  static  final String  l_genero="genero";
    public  static  final String  l_religion="religion";
    public  static  final String  l_grupoEC="grupoEC";
    public  static  final String  l_LProcedencia="LProcedencia";
    public  static  final String  l_viveActualmente="viveActualmente";
    public  static  final String  l_quienVive="quienVive";
    public  static  final String  l_tienesHijos="tienesHijos";
    public  static  final String  l_cuantosHijos="cuantosHijos";
    public  static  final String  l_vivenTuHogar="vivenTuHogar";
    public  static  final String  l_nivelEscolaridad="nivelEscolaridad";
    public  static  final String  l_actualmenteTrabaja="actualmenteTrabaja";
    public  static  final String  l_dondeTrabaja="dondeTrabaja";
    public  static  final String  l_sinoTrabaja="sinoTrabaja";
    public  static  final String  l_trabajaArtesania="trabajaArtesania";
    public  static  final String  l_trabajaComercio="trabajaComercio";
    public  static  final String  l_trabajaTurismo="trabajaTurismo";
    public  static  final String  l_trabajaManejoAlimentos="trabajaManejoAlimentos";
    public  static  final String  l_ingresoLaboral="ingresoLaboral";
    public  static  final String  l_ingresoFamiliar="ingresoFamiliar";
    public  static  final String  l_orientacionPolitica="orientacionPolitica";
    public  static  final String  l_discapacidad="discapacidad";
    public  static  final String  l_organizacionLGBT="organizacionLGBT";
    public  static  final String  l_derechosLGBT="derechosLGBT";
    public  static  final String  l_discriminacionLGBT="discriminacionLGBT";
    public  static  final String  l_casoSufrido="casoSufrido";
    public  static  final String  l_orientacionSexual="orientacionSexual";
    public  static  final String  l_intersexual="intersexual";
    public  static  final String  l_noExpresarGenero="noExpresarGenero";
    public  static  final String  l_razonesNoExpresar="razonesNoExpresar";
    public  static  final String  l_familiaLGBT="familiaLGBT";
    public  static  final String  l_quienes="quienes";
    public  static  final String  l_reaccionFamiliar="reaccionFamiliar";
    public  static  final String  l_violenciaLGBT="violenciaLGBT";
    public  static  final String  l_situacionDescrita="situacionDescrita";
    public  static  final String  l_actosDiscriminacion="actosDiscriminacion";
    public  static  final String  l_denunciasResuelven="denunciasResuelven";
    public  static  final String  l_porQueDenunciasResuelven="porQueDenunciasResuelven";
    public  static  final String  l_existenCampanasDiscriminacion="existenCampanasDiscriminacion";
    public  static  final String  l_sanAndresApoyo="sanAndresApoyo";
    public  static  final String  l_politicasPublicas="politicasPublicas";
    public  static  final String  l_comentar="Comentar";

    //tabla Genero de la calle variables
    public  static  final String T_genero="genero";
    public  static  final String  g_id="_id";
    public  static  final String  g_nombre="nombre";
    public  static  final String  g_identificacion="identificacion";
    public  static  final String  g_edad="edad";
    public  static  final String  g_sexo="sexo";
    public  static  final String  g_estadoCivil="estadoCivil";
    public  static  final String  g_genero="genero";
    public  static  final String  g_religion="religion";
    public  static  final String  g_grupoEC="grupoEC";
    public  static  final String  g_LProcedencia="LProcedencia";
    public  static  final String  g_viveActualmente="viveActualmente";
    public  static  final String  g_quienVive="quienVive";
    public  static  final String  g_tienesHijos="tienesHijos";
    public  static  final String  g_cuantosHijos="cuantosHijos";
    public  static  final String  g_rolFamilia="rolFamilia";
    public  static  final String  g_vivenTuHogar="vivenTuHogar";
    public  static  final String  g_nivelEscolaridad="nivelEscolaridad";
    public  static  final String  g_actualmenteTrabaja="actualmenteTrabaja";
    public  static  final String  g_dondeTrabaja="dondeTrabaja";
    public  static  final String  g_sinoTrabaja="sinoTrabaja";
    public  static  final String  g_trabajaArtesania="trabajaArtesania";
    public  static  final String  g_trabajaComercio="trabajaComercio";
    public  static  final String  g_trabajaTurismo="trabajaTurismo";
    public  static  final String  g_trabajaManejoAlimentos="trabajaManejoAlimentos";
    public  static  final String  g_ingresoLaboral="ingresoLaboral";
    public  static  final String  g_ingresoFamiliar="ingresoFamiliar";
    public  static  final String  g_orientacionPolitica="orientacionPolitica";
    public  static  final String  g_temaGenero="temaGenero";
    public  static  final String  g_violenciaMujer="violenciaMujer";
    public  static  final String  g_situacionViolencia="situacionViolencia";
    public  static  final String  g_quePiropo="quePiropo";
    public  static  final String  g_opinionAcoso="opinionAcoso";
    public  static  final String  g_funcionarioPublico="funcionarioPublico";
    public  static  final String  g_acosoSexual="acosoSexual";
    public  static  final String  g_mujerResponsable="mujerResponsable";
    public  static  final String  g_asedioSexual="asedioSexual";
    public  static  final String  g_actitudesVida="actitudesVida";
    public  static  final String  g_mecanismoLegal="mecanismoLegal";
    public  static  final String  g_victimaAcoso="victimaAcoso";
    public  static  final String  g_victimaPorque="victimaPorque";
    public  static  final String  g_experienciaComerciante="experiencaComerciante";
    public  static  final String  g_violenciaGenero="violenciaGenero";
    public  static  final String  g_porqueViolenciaGenero="porqueViolenciaGenero";
    public  static  final String  g_experienciaViolenciaGenero="experienciaViolenciaGenero";
    public  static  final String  g_votariaMujer="votariaMujer";
    public  static  final String  g_desistioDenuncia="desistioDenuncia";
    public  static  final String  g_violenciaFamiliar="violenciaFamiliar";
    public  static  final String  g_violenciaPareja="violenciaPareja";
    public  static  final String  g_mismoTrato="mismoTrato";
    public  static  final String  g_comentarios="comentarios";



    public  static  final String CREATE_TABLE_HABITANTES= "create table "+T_HCalles+"("+
            h_id+" integer primary key autoincrement,"+
            h_nombre+" text not null,"+
            h_identificacion+" integer not null,"+
            h_edad+" integer not null,"+
            h_sexo +" text not null,"+
            h_estadoCivil+" text not null,"+
            h_genero+" text not null,"+
            h_religion+" text not null,"+
            h_grupoEC+" text not null,"+
            h_LProcedencia+" text not null,"+
            h_viveActualmente+" text not null,"+
            h_tienesHijos+" text not null,"+
            h_CuantosHijos+" integer not null,"+
            h_nivelEscolaridad+" text not null,"+
            h_actualmenteTrabaja+" text not null,"+
            h_dondeTrabaja+" text not null,"+
            h_sinoTrabaja+" text not null,"+
            h_trabajaArtesania+" text not null,"+
            h_trabajaComercio+" text not null,"+
            h_trabajaTurismo+" text not null,"+
            h_trabajaManejoAlimentos+" text not null,"+
            h_orientacionPolitica+" text not null,"+
            h_parientesSai+" text not null,"+
            h_conversacionFamiliares+" text not null,"+
            h_familiaresContacto+" text not null,"+
            h_razonesCalle+" text not null,"+
            h_sanAndresAyuda+" text not null,"+
            h_uniddadesAtencion+" text not null,"+
            h_programaSocial+" text not null,"+
            h_cualPrograma+" text not null,"+
            h_violenciaCalle+" text not null,"+
            h_tipoViolencia+" text not null,"+
            h_problemaSalud+" text not null,"+
            h_tipoEnfermedad+" text not null,"+
            h_tieneVacuna+" text not null,"+
            h_razonesVacuna+" text not null,"+
            h_sanAndresMasAsistencia+" text not null,"+
            h_embarazada+" text not null,"+
            h_companeraEmbarazada+" text not null,"+
            h_alimentosSobrevivir+" text not null,"+
            h_comentarios+" text not null);";


    public  static  final String CREATE_TABLE_LGBT= "create table "+T_LGBT+"("+
            l_id+" integer primary key autoincrement,"+
            l_nombre+" text not null,"+
            l_identificacion+" integer not null,"+
            l_edad+" integer not null,"+
            l_sexo+" text not null,"+
            l_estadoCivil+" text not null,"+
            l_genero+" text not null,"+
            l_religion+" text not null,"+
            l_grupoEC+" text not null,"+
            l_LProcedencia+" text not null,"+
            l_viveActualmente+" text not null,"+
            l_quienVive+" text not null,"+
            l_tienesHijos+" text not null,"+
            l_cuantosHijos+" integer not null,"+
            l_vivenTuHogar+" integer not null,"+
            l_nivelEscolaridad+" text not null,"+
            l_actualmenteTrabaja+" text not null,"+
            l_dondeTrabaja+" text not null,"+
            l_sinoTrabaja+" text not null,"+
            l_trabajaArtesania+" text not null,"+
            l_trabajaComercio+" text not null,"+
            l_trabajaTurismo+" text not null,"+
            l_trabajaManejoAlimentos+" text not null,"+
            l_ingresoLaboral+" text not null,"+
            l_ingresoFamiliar+" text not null,"+
            l_orientacionPolitica+" text not null,"+
            l_discapacidad+" text not null,"+
            l_organizacionLGBT+" text not null,"+
            l_derechosLGBT+" text not null,"+
            l_discriminacionLGBT+" text not null,"+
            l_casoSufrido+" text not null,"+
            l_orientacionSexual+" text not null,"+
            l_intersexual+" text not null,"+
            l_noExpresarGenero+" text not null,"+
            l_razonesNoExpresar+" text not null,"+
            l_familiaLGBT+" text not null,"+
            l_quienes+" text not null,"+
            l_reaccionFamiliar+" text not null,"+
            l_violenciaLGBT+" text not null,"+
            l_situacionDescrita+" text not null,"+
            l_actosDiscriminacion+" text not null,"+
            l_denunciasResuelven+" text not null,"+
            l_porQueDenunciasResuelven+" text not null,"+
            l_existenCampanasDiscriminacion+" text not null,"+
            l_sanAndresApoyo+" text not null,"+
            l_politicasPublicas+" text not null,"+
            l_comentar+" text not null);";


    public  static  final String CREATE_TABLE_GENERO= "create table "+T_genero+"("+
            g_id+" integer primary key autoincrement,"+
            g_nombre+" text not null,"+
            g_identificacion+" integer not null,"+
            g_edad+" text not null,"+
            g_sexo+" text not null,"+
            g_estadoCivil+" text not null,"+
            g_genero+" text not null,"+
            g_religion+" text not null,"+
            g_grupoEC+" text not null,"+
            g_LProcedencia+" text not null,"+
            g_viveActualmente+" text not null,"+
            g_quienVive+" text not null,"+
            g_tienesHijos+" text not null,"+
            g_cuantosHijos+" integer not null,"+
            g_rolFamilia+" text not null,"+
            g_vivenTuHogar+" integer not null,"+
            g_nivelEscolaridad+" text not null,"+
            g_actualmenteTrabaja+" text not null,"+
            g_dondeTrabaja+" text not null,"+
            g_sinoTrabaja+" text not null,"+
            g_trabajaArtesania+" text not null,"+
            g_trabajaComercio+" text not null,"+
            g_trabajaTurismo+" text not null,"+
            g_trabajaManejoAlimentos+" text not null,"+
            g_ingresoLaboral+" text not null,"+
            g_ingresoFamiliar+" text not null,"+
            g_orientacionPolitica+" text not null,"+
            g_temaGenero+" text not null,"+
            g_violenciaMujer+" text not null,"+
            g_situacionViolencia+" text not null,"+
            g_quePiropo+" text not null,"+
            g_opinionAcoso+" text not null,"+
            g_funcionarioPublico+" text not null,"+
            g_acosoSexual+" text not null,"+
            g_mujerResponsable+" text not null,"+
            g_asedioSexual+" text not null,"+
            g_actitudesVida+" text not null,"+
            g_mecanismoLegal+" text not null,"+
            g_victimaAcoso+" text not null,"+
            g_victimaPorque+" text not null,"+
            g_experienciaComerciante+" text not null,"+
            g_violenciaGenero+" text not null,"+
            g_porqueViolenciaGenero+" text not null,"+
            g_experienciaViolenciaGenero+" text not null,"+
            g_votariaMujer+" text not null,"+
            g_desistioDenuncia+" text not null,"+
            g_violenciaFamiliar+" text not null,"+
            g_violenciaPareja+" text not null,"+
            g_mismoTrato+" text not null,"+
            g_comentarios+" text not null);";



    public SQLITECuestionario(@Nullable Context context) {
        super(context, nombre_BD, null, version_BD);

    }

    @Override
    public void onCreate(SQLiteDatabase db) {
     db.execSQL(CREATE_TABLE_HABITANTES);
     db.execSQL(CREATE_TABLE_LGBT);
     db.execSQL(CREATE_TABLE_GENERO);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        Log.w(SQLITECuestionario.class.getName(),"Ha sido actualizada vieja "+ oldVersion+" a la nueva "+newVersion+" Destruyendose la version vieja");
        db.execSQL("drop table if exists "+ T_HCalles);
        db.execSQL("drop table if exists "+ T_LGBT);
        db.execSQL("drop table if exists "+ T_genero);
        onCreate(db);
    }
}
