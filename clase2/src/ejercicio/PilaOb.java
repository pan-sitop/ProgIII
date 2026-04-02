/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio;

/**
 *
 * @author estudiante
 */


public class PilaOb {
    private int max = 100;
    private Venta[] v;
    private int tope;

    public PilaOb() {
        tope = 0;
        v = new Venta[max + 1]; 
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

    public void adicionar(Venta elem) {
        if (!esLlena()) {
            v[tope + 1] = elem;
            tope = tope + 1;
        } else {
            System.out.println("Pila Llena");
        }
    }

    public Venta eliminar() {
        Venta elem = null;
        if (!esVacia()) {
            elem = v[tope];
            tope = tope - 1;
        } else {
            System.out.println("Pila Vacia");
        }
        return elem;
    }

    public void mostrar() {
        PilaOb aux = new PilaOb();
        while (!esVacia()) {
            Venta elem = eliminar();
            elem.mostrar();
            aux.adicionar(elem);
        }
        vaciar(aux);
    }

    public void vaciar(PilaOb z) {
        while (!z.esVacia()) {
            adicionar(z.eliminar());
        }
    }
}
