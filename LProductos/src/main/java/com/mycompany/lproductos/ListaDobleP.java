/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lproductos;

/**
 *
 * @author Jhon Emison Rojas L
 */
class ListaDobleP {
    private NodoDP p;
 
    public ListaDobleP() {
        p = null;
    }
    public NodoDP getP() {
        return p;
    }
    public void setP(NodoDP p) {
        this.p = p;
    }

    public boolean esVacia() {
        return p == null;
    }

    public int nroNodos() {
        int c = 0;
        NodoDP r = getP();
        while (r != null) {
            c++;
            r = r.getSig();
        }
        return c;
    }

    public void adiprincipio(Producto x) {
        NodoDP nue = new NodoDP();
        nue.setDato(x);
        if (esVacia()) {
            setP(nue);
        } else {
            nue.setSig(getP());   
            getP().setAnt(nue);   
            setP(nue); 
        }
    }
 
    public void adifinal(Producto x) {
        NodoDP nue = new NodoDP();
        nue.setDato(x);
        if (esVacia()) {
            setP(nue);
        } else {
            NodoDP r = getP();
            while (r.getSig() != null)
                r = r.getSig();
            nue.setAnt(r);    
            r.setSig(nue);    
        }
    }
 
    public NodoDP eliPrincipio() {
        NodoDP r = getP();
        setP(r.getSig());
        if (getP() != null)
            getP().setAnt(null);  
        r.setSig(null);
        return r;
    }
 
    public NodoDP eliFinal() {
        NodoDP r = getP();
        if (r.getSig() == null) {
            // Solo hay un nodo
            setP(null);
            return r;
        }
        while (r.getSig() != null)
            r = r.getSig();
        NodoDP q = r.getAnt();
        q.setSig(null);   
        r.setAnt(null);
        return r;
    }
 
    public void mostrar() {
        NodoDP r = getP();
        while (r != null) {
            r.getDato().mostrar();   
            r = r.getSig();
        }
    }
 
    public void mostrarInverso() {
        NodoDP r = getP();
        while (r.getSig() != null)
            r = r.getSig();
        while (r != null) {
            r.getDato().mostrar();
            r = r.getAnt();
        }
    }
}