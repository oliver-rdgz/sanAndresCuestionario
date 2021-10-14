package com.example.sanandrescustionario;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class SQLITECuestionario extends SQLiteOpenHelper {

    private  static  String nombre_BD="Cuestionario_SanAndres";
    private  static final int version_BD=1;

    //tabla habitantes de la calle variables
    public  static  final String T_HCalles="habitantesCalle";
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
    public  static  final String T_LGBT="habitantesCalle";
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

    //tabla Genero de la calle variables
    public  static  final String T_genero="habitantesCalle";
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



    /*public  static  final String CREATE_TABLE_HABITANTES= "create table "+T_HCalles+"("+
            h_id+" integer pimary key autoincrement,"+
            h_nombre*/





    public SQLITECuestionario(@Nullable Context context) {
        super(context, nombre_BD, null, version_BD);

    }

    @Override
    public void onCreate(SQLiteDatabase db) {
     //db.execSQL(CREATE_TABLE_HABITANTES);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
