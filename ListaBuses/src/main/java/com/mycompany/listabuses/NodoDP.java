/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.listabuses;

/**
 *
 * @author Jhon Emison Rojas L
 */
class NodoDP {
    private Pasajero dato;
    private NodoDP ant;
    private NodoDP sig;
 
    public NodoDP() {
        ant = null;
        sig = null;
    }
 
    public Pasajero getDato() {
        return dato;
    }
    public NodoDP getAnt() {
        return ant;
    }
    public NodoDP getSig() {
        return sig;
    }
 
    public void setDato(Pasajero dato) {
        this.dato = dato;
    }
    public void setAnt(NodoDP ant) {
        this.ant = ant;
    }
    public void setSig(NodoDP sig) {
        this.sig = sig;
    }
}
