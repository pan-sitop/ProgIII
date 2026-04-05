package principal;

/**
 *
 * @author estudiante
 */
public class MultiPilaP {
    private int np;
    private PilaP[] v = new PilaP[100];

    MultiPilaP() {
        np = 50;
        for (int i = 1; i <= 50; i++) {
            v[i] = new PilaP();
        }
    }

    public int getNp() {
        return np;
    }

    public boolean esVacia(int i) {
        return v[i].esvacia();
    }

    public boolean esLlena(int i) {
        return v[i].esllena();
    }

    
    public void adicionar(int i, Propietario elem) {
        v[i].adicionar(elem);
    }

    
    public Propietario eliminar(int i) {
        return v[i].eliminar();
    }

    public void mostrar(int i) {
        v[i].mostrar();
    }

    public void mostrar() {
        for (int i = 1; i <= np; i++) {
            if(!esVacia(i)){
                System.out.println("\n--- Pila " + i + " ---");
                v[i].mostrar();
            }
        }
    }

    
    public void vaciar(int i, PilaP z) {
        v[i].vaciar(z);
    }

    public void vaciar(int i, int j) {
        v[j].vaciar(v[i]);
    }
}