/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.listabuses;

/**
 *
 * @author Jhon Emison Rojas L
 */
public class Bus {
    private String placa,conductor;
    private int capacidad;
    
    public Bus(String a, int b, String c){
        placa=a;
        capacidad=b;
        conductor=c;
    }
    
    void mostrar(){
        System.out.println(placa+" "+capacidad+" "+conductor);
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getConductor() {
        return conductor;
    }

    public void setConductor(String conductor) {
        this.conductor = conductor;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
    
    
}
