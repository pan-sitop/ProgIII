/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.stackestudiantes;

/**
 *
 * @author Jhon Emison Rojas L
 */
public class Materia {
    private String sigla, nombre ;
    private int semestre;
    
    public Materia(String si, String no, int se){
        sigla = si;
        nombre= no;
        semestre=se;
    }
    
    public void mostrar()
    {
        System.out.println(sigla+" "+nombre+" "+semestre);
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
    
}
