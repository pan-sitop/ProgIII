package com.mycompany.clasevirtual;
/**
 *
 * @author Arturo
 */
public class CCircularP {
    private int max = 50;
    private Pasajero V[] = new Pasajero[max + 1];
    private int ini, fin;

    public CCircularP() {
        ini = fin = 0;
    }

    public int nroelem() {
        if (ini == 0 && fin == 0) return 0;
        if (fin > ini) return fin - ini;
        return max - ini + fin;
    }

    public boolean esvacia() {
        return nroelem() == 0;
    }

    public boolean esllena() {
        return nroelem() == max;
    }

    public void adicionar(Pasajero elem) {
        if (!esllena()) {
            if (fin == max) fin = 1;
            else fin = fin + 1;
            
            V[fin] = elem;
        } else {
            System.out.println("Cola llena...");
        }
    }

    public Pasajero eliminar() {
        Pasajero elem = null;
        if (!esvacia()) {
            if (ini == max) {
                ini = 1;
            } else {
                ini = ini + 1;
            }
            elem = V[ini];
            if (ini == fin) {
                ini = fin = 0;
            }
            
        } else {
            System.out.println("Cola Vacia");
        }
        return elem;
    }

    public void mostrar() {
        int n = nroelem();
        for (int i = 1; i <= n; i++) {
            Pasajero x = eliminar();
            x.mostrar();
            adicionar(x);
        }
    }

    public void vaciar(CCircularP z) {
        while (!z.esvacia()) {
            adicionar(z.eliminar());
        }
    }
}
