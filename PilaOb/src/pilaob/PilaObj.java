/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pilaob;

/**
 *
 * @author estudiante
 */
import java.util.Scanner;

public class PilaObj {
    private int max = 100;
    private Pais[] v;
    private int tope;

    public PilaObj() {
        tope = 0;
        v = new Pais[max + 1]; 
    }

    public boolean esVacia() {
        if (tope == 0) {
            return true;
        }
        return false;
    }

    public boolean esLlena() {
        if (tope == max) {
            return true;
        }
        return false;
    }

    public void adicionar(Pais elem) {
        if (!esLlena()) {
            v[tope + 1] = elem;
            tope = tope + 1;
        } else {
            System.out.println("Pila Llena");
        }
    }

    public Pais eliminar() {
        Pais elem = null;
        if (!esVacia()) {
            elem = v[tope];
            tope = tope - 1;
        } else {
            System.out.println("Pila Vacia");
        }
        return elem;
    }

    public void mostrar() {
        PilaObj aux = new PilaObj();
        while (!esVacia()) {
            Pais elem = eliminar();
            elem.mostrar();
            aux.adicionar(elem);
        }
        vaciar(aux);
    }

    public void vaciar(PilaObj z) {
        while (!z.esVacia()) {
            adicionar(z.eliminar());
        }
    }
}