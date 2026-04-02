package com.mycompany.clasevirtual;
/**
 *
 * @author Arturo
 */
public class Conductor {
    private String nombre,categoria;
    private int ci;
    
    public Conductor(String n,int c, String cat){
        nombre=n;
        ci=c;
        categoria=cat;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCi() {
        return ci;
    }

    public void setCi(int ci) {
        this.ci = ci;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    void mostrar(){
        System.out.println("Conductor: "+nombre+" "+ci+" "+categoria);
    }
}
