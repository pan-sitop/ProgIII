/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.listabuses;

/**
 *
 * @author Jhon Emison Rojas L
 */
class NodoB {
    private Bus bus;
    private NodoB sig;

    public NodoB() {
        sig = null;
    }

    public Bus  getBus() {
        return bus;
    }
    
    
    public NodoB getSig() {
        return sig;
    }

    public void setProv(Bus dato) {
        this.bus = dato;
    }
    
    
    public void setSig(NodoB sig) {
        this.sig = sig;
    }
}