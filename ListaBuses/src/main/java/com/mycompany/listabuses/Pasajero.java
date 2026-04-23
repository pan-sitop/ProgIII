/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.listabuses;

/**
 *
 * @author Jhon Emison Rojas L
 */
public class Pasajero {
    private String placa,nombre;
    private int edad;
    
    public Pasajero(String a, String b, int c){
        placa=a;
        nombre=b;
        edad=c;
    }
    
    void mostrar(){
        System.out.println(placa+" "+nombre+" "+edad);
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
}
