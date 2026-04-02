/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej1pilas;

/**
 *
 * @author Arturo
 */
public class PilaM {
    private int max=100;
    private Mueble v[]=new Mueble[max+1];
    private int tope;

    public PilaM() {
        tope=0;
    }

    public boolean esvacia() {
        return tope==0;
    }

    public boolean esllena() {
        return tope==max;
    }

    public int nroelem() {
        return tope;
    }

    public void adicionar(Mueble elem) {
        if(!esllena()) {
            v[tope+1]=elem;
            tope=tope+1;
        }
    }

    public Mueble eliminar() {
        Mueble elem=new Mueble();
        if(!esvacia()) {
            elem=v[tope];
            tope=tope-1;
        }
        return elem;
    }

    public void llenar(int n) {
        for(int i=1;i<=n;i++) {
            Mueble m=new Mueble();
            m.leer();
            adicionar(m);
        }
    }

    public void mostrar() {
        PilaM aux=new PilaM();
        while(!esvacia()) {
            Mueble m=eliminar();
            m.mostrar();
            aux.adicionar(m);
        }
        vaciar(aux);
    }

    public void vaciar(PilaM z) {
        while(!z.esvacia()) {
            adicionar(z.eliminar());
        }
    }
}
