package colasimple;

public class CSimpleP {
    private int max = 50;
    private Persona v[] = new Persona[max + 1];
    private int ini, fin;

    public CSimpleP() {
        ini = fin = 0;
    }

    public boolean esvacia() {
        // Se puede retornar la condición directamente
        return ini == 0 && fin == 0;
    }

    public boolean esllena() {
        // En una cola simple, se llena cuando fin alcanza el tope
        return fin == max;
    }

    public int nroelem() {
        return fin - ini;
    }

    public void adicionar(Persona elem) {
        if (!esllena()) {
            fin = fin + 1;
            v[fin] = elem; 
        } else {
            System.out.println("Cola llena...");
        }
    }

    public Persona eliminar() {
        Persona elem = null;
        if (!esvacia()) {
            ini = ini + 1;
            elem = v[ini];
            
            // Excelente: Si se vació, reseteamos los punteros
            // para recuperar el espacio perdido al inicio.
            if (ini == fin) {
                ini = fin = 0; 
            }
        } else {
            System.out.println("Cola Vacia...");
        }
        return elem;
    }

    public void mostrar() {
        CSimpleP aux = new CSimpleP();
        
        while (!esvacia()) {
            Persona px = eliminar();
            px.mostrar();
            aux.adicionar(px);
        }
        
        vaciar(aux);
    }

    public void vaciar(CSimpleP z) {
        while (!z.esvacia()) {
            adicionar(z.eliminar());
        }
    }
}