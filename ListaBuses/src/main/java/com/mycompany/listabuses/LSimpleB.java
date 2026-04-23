/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.listabuses;

/**
 *
 * @author Jhon Emison Rojas L
 */
class LSimpleB {
    private NodoB p;

    public LSimpleB() {
        p = null;
    }

    public NodoB getP() {
        return p;
    }
    public void setP(NodoB p) {
        this.p = p;
    }

    public boolean esVacia() {
        return p == null;
    }

    public void adiprincipio(Bus x) {
        NodoB nue = new NodoB();
        nue.setProv(x);
        nue.setSig(getP());
        setP(nue);
    }

    public void adifinal(Bus x) {
        NodoB nue = new NodoB();
        nue.setProv(x);
        if (esVacia()) {
            setP(nue);
        } else {
            NodoB r = getP();
            while (r.getSig() != null)
                r = r.getSig();
            r.setSig(nue);
        }
    }

    public int nroNodos() {
        int c = 0;
        NodoB r = getP();
        while (r != null) {
            c++;
            r = r.getSig();
        }
        return c;
    }

    public NodoB eliPrincipio() {
        NodoB r = getP();
        setP(r.getSig());
        r.setSig(null);
        return r;
    }

    public NodoB eliFinal() {
        NodoB r = getP();
        NodoB q = getP();
        if (getP().getSig() == null) {
            setP(null);
            return r;
        }
        while (r.getSig() != null) {
            q = r;
            r = r.getSig();
        }
        q.setSig(null);
        return r;
    }

    public void mostrar() {
        NodoB r = getP();
        while (r != null) {
            r.getBus().mostrar();  // llama al mostrar() del objeto
            r = r.getSig();
        }
    }
}
