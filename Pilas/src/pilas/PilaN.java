/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pilas;

/**
 *
 * @author estudiante
 */
import java.util.Scanner;

public class PilaN {
    private int max = 100;
    // Se inicializa en max + 1 porque la lógica del apunte usa índices desde 1 (V[tope + 1])
    private String[] V = new String[max + 1]; 
    private int tope;

    // Constructor
    public PilaN() {
        tope = 0;
    }

    boolean esVacia() {
        if (tope == 0) {
            return true;
        }
        return false;
    }

    boolean esLlena() {
        return tope==max;
        /*if (tope == max) {
            return true;
        }
        return false;*/
    }

    int nroElem() {
        return tope;
    }

    void adicionar(String elem) {
        if (!esLlena()) {
            V[tope+1] = elem;
            tope=tope + 1;
        } else {
            System.out.println("Pila llena....");
        }
    }

    String eliminar() {
        String d="";
        if (!esVacia()) {
            d = V[tope];
            tope=tope-1;
        } else {
            System.out.println("Pila Vacia....");
        }
        return d;
    }

    public void mostrar() {
        PilaN aux = new PilaN();
        while (!esVacia()) {
            String x=eliminar();
            System.out.println(x);
            aux.adicionar(x);
        }
        vaciar(aux);
    }

    public void vaciar(PilaN z) {
        while (!z.esVacia()) {
            adicionar(z.eliminar());
        }
    }

    /*public static boolean verifica(PilaN Q, String x) {
        PilaN w = new PilaN();
        boolean sw = false;
        while (!Q.esVacia()) {
            String mx = Q.eliminar();
            if (mx.equals(x)) {
                sw = true;
            }
            w.adicionar(mx);
        }
        Q.vaciar(w);
        return sw;
    }*/  
}
