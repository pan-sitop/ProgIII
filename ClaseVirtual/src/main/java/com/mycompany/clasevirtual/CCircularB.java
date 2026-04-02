package com.mycompany.clasevirtual;
/**
 *
 * @author Arturo
 */
public class CCircularB {
  private int max = 50;
    private Bus V[] = new Bus[max + 1];
    private int ini, fin;

    public CCircularB() {
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

    public void adicionar(Bus elem) {
        if (!esllena()) {
            if (fin == max) fin = 1;
            else fin = fin + 1;
            
            V[fin] = elem;
        } else {
            System.out.println("Cola llena...");
        }
    }

    public Bus eliminar() {
        Bus elem = null;
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
            Bus x = eliminar();
            x.mostrar();
            adicionar(x);
        }
    }

    public void vaciar(CCircularB z) {
        while (!z.esvacia()) {
            adicionar(z.eliminar());
        }
    }
}