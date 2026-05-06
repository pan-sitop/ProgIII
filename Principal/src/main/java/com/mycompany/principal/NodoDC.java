package com.mycompany.principal;
/**
 *
 * @author Arturo
 */
public class NodoDC {
    private int ci,nroFirmas;
    private String fecha,tema;
    private NodoDC ant;
    private NodoDC sig;
 
    public NodoDC() {
        ant = null;
        sig = null;
    }
 
   
    public NodoDC getAnt() {
        return ant;
    }
    public NodoDC getSig() {
        return sig;
    }
 
    public int getCi() {
        return ci;
    }

    public void setCi(int ci) {
        this.ci = ci;
    }

    public int getNroFirmas() {
        return nroFirmas;
    }

    public void setNroFirmas(int nroFirmas) {
        this.nroFirmas = nroFirmas;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

  

    public void setAnt(NodoDC ant) {
        this.ant = ant;
    }

    public void setSig(NodoDC sig) {
        this.sig = sig;
    }
 
}
