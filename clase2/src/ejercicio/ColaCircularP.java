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

public class ColaCircularP {
    private int max = 50;
    private Prenda V[] = new Prenda[max + 1];
    private int ini, fin;

    public ColaCircularP() {
        ini = fin = 0;
    }

    public int nroelem() {
        if (ini == 0 && fin == 0) 
            return 0;
        if (fin > ini) 
            return fin - ini;
        return max - ini + fin;
    }

    public boolean esvacia() {
        return nroelem() == 0;
    }

    public boolean esllena() {
        return nroelem() == max;
    }

    public void adicionar(Prenda elem) {
        if (!esllena()) {
            if (fin == max) 
                fin = 1;
            else 
                fin = fin + 1;
            V[fin] = elem;
        } else {
            System.out.println("Cola llena...");
        }
    }

    public Prenda eliminar() {
        Prenda elem = null;
        if (!esvacia()) {
            ini = ini + 1;
            elem = V[ini];
            if (ini == max) 
                ini = 0;
            if (ini == max) 
                ini = fin = 0;
        } else {
            System.out.println("Cola Vacia");
        }
        return elem;
    }

    public void mostrar() {
        int n = nroelem();
        for (int i = 1; i <= n; i++) {
            Prenda x = eliminar();
            x.mostrar();
            adicionar(x);
        }
    }

    public void vaciar(ColaCircularP z) {
        while (!z.esvacia()) {
            adicionar(z.eliminar());
        }
    }
}