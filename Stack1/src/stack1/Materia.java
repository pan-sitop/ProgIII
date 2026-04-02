/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stack1;

/**
 *
 * @author estudiante
 */
public class Materia {
    private String sigla, nombre;
    private int semestre;
    
    public Materia (String a, String b, int c){
        sigla=a;
        nombre=b;
        semestre=c;
    }
    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    void mostrar() {
        System.out.println(sigla+" "+nombre+" "+semestre);
    }
    
}
