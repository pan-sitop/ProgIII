/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.stackestudiantes;

/**
 *
 * @author Jhon Emison Rojas L
 */
public class Estudiante {
    private String nombre;
    private int ci;
    
    public Estudiante(int c,String n){
        nombre=n;
        ci=c;
    }
    
    public void mostrar(){
        System.out.println(nombre+" "+ci);
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
    
    

}
