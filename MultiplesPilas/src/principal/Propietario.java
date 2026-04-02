/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

/**
 *
 * @author estudiante
 */
public class Propietario {
    private String nombre;
    private int ci;
    private CCircularM cm;
    
    public Propietario(String n, int z, CCircularM c){
        nombre=n;
        ci=z;
        cm=c;
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

    public CCircularM getCm() {
        return cm;
    }

    public void setCm(CCircularM cm) {
        this.cm = cm;
    }
    void mostrar(){
        System.out.println("Propietario: "+nombre+" "+ci);
        cm.mostrar();
    }
}
