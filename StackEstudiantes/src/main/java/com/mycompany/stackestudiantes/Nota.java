/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.stackestudiantes;

/**
 *
 * @author Jhon Emison Rojas L
 */
public class Nota {
    private int ci,nota;
    private String materia;
     
   public Nota(int a, String b, int c){
       ci=a;
       materia=b;
       nota=c;
   }
   
   public void mostrar(){
       System.out.println(ci+" "+nota+" "+materia);
   }

    public int getCi() {
        return ci;
    }

    public void setCi(int ci) {
        this.ci = ci;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }
 
}
