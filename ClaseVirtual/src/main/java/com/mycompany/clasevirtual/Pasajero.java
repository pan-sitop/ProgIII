package com.mycompany.clasevirtual;
/**
 *
 * @author Arturo
 */
public class Pasajero {
    private String nombre, tipo;
    private int ci;
    public Pasajero(int c, String n, String t){
       ci=c;
       nombre=n;
       tipo=t;
    }      

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getCi() {
        return ci;
    }

    public void setCi(int ci) {
        this.ci = ci;
    }
    void mostrar(){
        System.out.println(" <"+nombre+" "+ci+" "+tipo+"> ");
        System.out.println();
    }
}
