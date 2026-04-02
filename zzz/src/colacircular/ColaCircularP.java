package colacircular;

public class ColaCircularP {
    private int max = 50;
    private Persona V[] = new Persona[max + 1];
    private int ini, fin;

    public ColaCircularP() {
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

    public void adicionar(Persona elem) {
        if (!esllena()) {
            // Avanza 'fin' de forma circular
            if (fin == max) fin = 1;
            else fin = fin + 1;
            
            V[fin] = elem;
        } else {
            System.out.println("Cola llena...");
        }
    }

    public Persona eliminar() {
        Persona elem = null;
        if (!esvacia()) {
            
            // 1. Avanzamos 'ini' de forma circular PRIMERO
            if (ini == max) {
                ini = 1;
            } else {
                ini = ini + 1;
            }
            
            // 2. Extraemos el elemento
            elem = V[ini];
            
            // 3. Si al avanzar 'ini' alcanzó a 'fin', la cola quedó vacía
            if (ini == fin) {
                ini = fin = 0; // Reseteamos
            }
            
        } else {
            System.out.println("Cola Vacia");
        }
        return elem;
    }

    public void mostrar() {
        int n = nroelem();
        for (int i = 1; i <= n; i++) {
            Persona x = eliminar();
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