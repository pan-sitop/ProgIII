package com.mycompany.principal;

/**
 *
 * @author Arturo
 */
public class NodoE {
    private int ci;
    private String nombre,paterno,materno;
    private NodoE sig;

    public NodoE() {
        sig = null;
    }

    
    public NodoE getSig() {
        return sig;
    }
    public void setSig(NodoE sig) {
        this.sig = sig;
    }

    public int getCi() {
        return ci;
    }

    public void setCi(int ci) {
        this.ci = ci;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPaterno() {
        return paterno;
    }

    public void setPaterno(String paterno) {
        this.paterno = paterno;
    }

    public String getMaterno() {
        return materno;
    }

    public void setMaterno(String materno) {
        this.materno = materno;
    }
    
    
}
