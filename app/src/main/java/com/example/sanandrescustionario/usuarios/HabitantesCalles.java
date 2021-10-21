package com.example.sanandrescustionario.usuarios;

public class HabitantesCalles {

    public  String  h_nombre="";
    public  int     h_identificacion=0;
    public  int     h_edad=0;
    public  String  h_sexo="";
    public  String  h_estadoCivil="";
    public  String  h_genero="";
    public  String  h_religion="";
    public  String  h_grupoEC="";
    public  String  h_LProcedencia="";
    public  String  h_viveActualmente="";
    public  String  h_tienesHijos="";
    public  int   h_CuantosHijos=0;
    public  String  h_nivelEscolaridad="";
    public  String  h_actualmenteTrabaja="";
    public  String  h_dondeTrabaja="";
    public  String  h_sinoTrabaja="";
    public  String  h_trabajaArtesania="";
    public  String  h_trabajaComercio="";
    public  String  h_trabajaTurismo="";
    public  String  h_trabajaManejoAlimentos="";
    public  String  h_orientacionPolitica="";
    public  String  h_parientesSai="";
    public  String  h_conversacionFamiliares="";
    public  String  h_familiaresContacto="";
    public  String  h_razonesCalle="";
    public  String  h_sanAndresAyuda="";
    public  String  h_uniddadesAtencion="";
    public  String  h_programaSocial="";
    public  String  h_cualPrograma="";
    public  String  h_violenciaCalle="";
    public  String  h_tipoViolencia="";
    public  String  h_problemaSalud="";
    public  String  h_tipoEnfermedad="";
    public  String  h_tieneVacuna="";
    public  String  h_razonesVacuna="";
    public  String  h_sanAndresMasAsistencia="";
    public  String  h_embarazada="";
    public  String  h_companeraEmbarazada="";
    public  String  h_alimentosSobrevivir="";
    public  String  h_comentarios="";

    public String h_TrabajaEnEmpresaOrganizacion="";

    public boolean esValidoElFormulario()
    {
        if(!h_nombre.equals("") && !h_tienesHijos.equals("")
            && !(h_edad==0) && !h_sexo.equals("")
            && !h_estadoCivil.equals("") && !h_genero.equals("")
            && !h_religion.equals("") && !h_grupoEC.equals("")
            && !h_LProcedencia.equals("") && !h_viveActualmente.equals("")
            && !h_orientacionPolitica.equals("") && !h_parientesSai.equals("")
            && !h_conversacionFamiliares.equals("") && !h_familiaresContacto.equals("")
            && !h_razonesCalle.equals("") && !h_sanAndresAyuda.equals("")
            && !h_uniddadesAtencion.equals("") && !h_programaSocial.equals("")
            && !h_violenciaCalle.equals("") && !h_problemaSalud.equals("")
            && !h_tieneVacuna.equals("") && !h_sanAndresMasAsistencia.equals("")
            && !h_alimentosSobrevivir.equals("") && !h_nivelEscolaridad.equals("")
            && !h_actualmenteTrabaja.equals(""))
        {
            return cuantosHijos();
        }
        return false;
    }


    private boolean cuantosHijos ()
    {
        if(h_tienesHijos.equals("Si") && h_CuantosHijos==0)
        {
            return false;
        }
        else
        {
            return estaTrabajando();
        }
    }

    private boolean estaTrabajando()
    {
        if (h_actualmenteTrabaja.equals("Si"))
        {
            if (h_TrabajaEnEmpresaOrganizacion.equals("")
                || h_trabajaArtesania.equals("") || h_trabajaComercio.equals("")
                || h_trabajaTurismo.equals("") || h_trabajaManejoAlimentos.equals(""))
            {
                return false;
            }
            else
            {
                if (h_TrabajaEnEmpresaOrganizacion.equals("Si") && h_dondeTrabaja.equals(""))
                {
                    return false;
                }else if (h_TrabajaEnEmpresaOrganizacion.equals("No") && h_sinoTrabaja.equals(""))
                {
                    return false;
                }
                else
                {
                    return cualProgramaSocial();
                }
            }
        }
        else
        {
            return cualProgramaSocial();
        }

    }

    private boolean cualProgramaSocial()
    {
        if(h_programaSocial.equals("Si") && h_cualPrograma.isEmpty())
        {
            return false;
        }
        else
        {
            return tipoViolencia();
        }
    }

    private  boolean tipoViolencia()
    {
        if(h_violenciaCalle.equals("Si") && h_tipoViolencia.isEmpty())
        {
         return false;
        }else {
            return tipoEnfermedad();
        }
    }

    private boolean tipoEnfermedad()
    {
        if (h_problemaSalud.equals("Si") && h_tipoEnfermedad.isEmpty())
        {
            return false;
        }
        else {
            return tieneVanucaCovid();
        }
    }

    private boolean tieneVanucaCovid()
    {
        if (h_tieneVacuna.equals("No") && h_razonesVacuna.isEmpty())
        {
            return false;
        }
        else {
            return true;
        }
    }
}
