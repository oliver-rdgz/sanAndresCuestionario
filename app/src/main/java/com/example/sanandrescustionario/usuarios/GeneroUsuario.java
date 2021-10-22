package com.example.sanandrescustionario.usuarios;

public class GeneroUsuario {
    public   String  g_nombre="";
    public   int  g_identificacion=0;
    public   int  g_edad=0;
    public   String  g_sexo="";
    public   String  g_estadoCivil="";
    public   String  g_genero="";
    public   String  g_religion="";
    public   String  g_grupoEC="";
    public   String  g_LProcedencia="";
    public   String  g_viveActualmente="";
    public   String  g_quienVive="";
    public   String  g_tienesHijos="";
    public   int  g_cuantosHijos=0;
    public   String  g_esPadre="";
    public   String  g_esMadre="";
    public   String  g_esEsposoa="";
    public   String  g_esHijoa="";
    public   String  g_esHermanoa="";
    public   String  g_esOtro="";
    public   int  g_vivenTuHogar=0;
    public   String  g_nivelEscolaridad="";
    public   String  g_actualmenteTrabaja="";
    public   String  g_dondeTrabaja="";
    public   String  g_sinoTrabaja="";
    public   String  g_trabajaArtesania="";
    public   String  g_trabajaComercio="";
    public   String  g_trabajaTurismo="";
    public   String  g_trabajaManejoAlimentos="";
    public   String  g_ingresoLaboral="";
    public   String  g_ingresoFamiliar="";
    public   String  g_orientacionPolitica="";
    public   String  g_temaGenero="";
    public   String  g_violenciaMujer="";
    public   String  g_situacionViolencia="";
    public   String  g_quePiropo="";
    public   String  g_opinionAcoso="";
    public   String  g_fComentarioApariencia="";
    public   String  g_fComentarioAparienciaCuerpo="";
    public   String  g_fComentarioVestirme="";
    public   String  g_fSilbidos="";
    public   String  g_fMiradasSexuales="";
    public   String  g_fPalabrasObsenas="";
    public   String  g_fGestoSexual="";
    public   String  g_fTocamientos="";
    public   String  g_fFavorSexual="";
    public   String  g_fCitaFuera="";
    public   String  g_fInsultoSexual="";
    public   String  g_fMiradaOfensiva="";
    public   String  g_fAmenazaSexual="";
    public   String  g_acosoSexual="";
    public   String  g_mujerResponsable="";
    public   String  g_asedioSexual="";
    public   String  g_actitudesVida="";
    public   String  g_mecanismoLegal="";
    public   String  g_victimaAcoso="";
    public   String  g_victimaPorque="";
    public   String  g_cComentarioApariencia="";
    public   String  g_cComentarioAparienciaCuerpo="";
    public   String  g_cComentarioVestirme="";
    public   String  g_cSilbidos="";
    public   String  g_cMiradasSexuales="";
    public   String  g_cPalabrasObsenas="";
    public   String  g_cGestoSexual="";
    public   String  g_cTocamientos="";
    public   String  g_cFavorSexual="";
    public   String  g_cCitaFuera="";
    public   String  g_cInsultoSexual="";
    public   String  g_cMiradaOfensiva="";
    public   String  g_cAmenazaSexual="";
    public   String  g_violenciaGenero="";
    public   String  g_porqueViolenciaGenero="";
    public   String  g_experienciaViolenciaGenero="";
    public   String  g_votariaMujer="";
    public   String  g_desistioDenuncia="";
    public   String  g_violenciaFamiliar="";
    public   String  g_violenciaPareja="";
    public   String  g_mismoTrato="";
    public   String  g_miedoMujer="";
    public   String  g_comentarios="";

    public String g_TrabajaEnEmpresaOrganizacion="";

    public boolean esValidoElFormulario()
    {
        if(!g_nombre.equals("") && !g_tienesHijos.equals("")
        && !(g_edad==0) && !g_sexo.equals("")
        && !g_estadoCivil.equals("") && !g_genero.equals("")
        && !g_religion.equals("") && !g_grupoEC.equals("")
        && !g_LProcedencia.equals("") && !g_viveActualmente.equals("")
        && !g_orientacionPolitica.equals("") && !(g_identificacion==0)
        && !g_quienVive.equals("") && !(g_vivenTuHogar==-1) && !g_nivelEscolaridad.equals("")
        && !g_actualmenteTrabaja.equals("") && !g_ingresoFamiliar.equals("")
        && !g_temaGenero.equals("") && !g_violenciaMujer.equals("")
        && !g_quePiropo.equals("") && !g_opinionAcoso.equals("")
        && !g_acosoSexual.equals("") && !g_mujerResponsable.equals("")
        && !g_asedioSexual.equals("")
        && !g_actitudesVida.equals("") && !g_mecanismoLegal.equals("")
        && !g_victimaAcoso.equals("") && !g_violenciaGenero.equals("")
        && !g_porqueViolenciaGenero.equals("") && !g_experienciaViolenciaGenero.equals("")
        && !g_votariaMujer.equals("") && !g_desistioDenuncia.equals("")
        && !g_violenciaFamiliar.equals("") && !g_violenciaPareja.equals("")
        && !g_mismoTrato.equals("") && !g_miedoMujer.equals(""))
        {
            return cuantosHijos();
        }
        return false;
    }

    private boolean cuantosHijos ()
    {
        if(g_tienesHijos.equals("Si") && g_cuantosHijos==0)
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
        if (g_actualmenteTrabaja.equals("Si"))
        {
            if (g_TrabajaEnEmpresaOrganizacion.equals("") || g_ingresoLaboral.equals("")
                    || g_trabajaArtesania.equals("") || g_trabajaComercio.equals("")
                    || g_trabajaTurismo.equals("") || g_trabajaManejoAlimentos.equals(""))
            {
                return false;
            }
            else
            {
                if (g_TrabajaEnEmpresaOrganizacion.equals("Si") && g_dondeTrabaja.equals(""))
                {
                    return false;
                }else if (g_TrabajaEnEmpresaOrganizacion.equals("No") && g_sinoTrabaja.equals(""))
                {
                    return false;
                }
                else
                {
                    return violenciaSerMujer();
                }
            }
        }
        else
        {
            return violenciaSerMujer();
        }

    }

    private boolean violenciaSerMujer ()
    {
        if(g_violenciaMujer.equals("Si") && g_situacionViolencia.equals(""))
        {
            return false;
        }
        else
        {
            return victimaAcosoSexual();
        }
    }

    private boolean victimaAcosoSexual()
    {
        if(g_victimaAcoso.equals("No") && g_victimaPorque.equals(""))
        {
            return false;
        }
        else
        {
            return rolFamiliar();
        }
    }

    private boolean rolFamiliar()
    {
        if (g_esPadre.equals("No") && g_esMadre.equals("No")
            && g_esEsposoa.equals("No") && g_esHijoa.equals("No")
            && g_esHermanoa.equals("No") && g_esOtro.equals("No"))
        {
            return false;
        }
        return true;
    }
}
