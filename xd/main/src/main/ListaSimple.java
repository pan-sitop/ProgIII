package main;

class ListaSimple {
    private Nodo p;

    public ListaSimple() {
        p = null;
    }

    public Nodo getP() {
        return p;
    }

    public void setP(Nodo p) {
        this.p = p;
    }

    public boolean esVacia() {
        return p == null;
    }  
    public void adiprincipio(String n, String c) {
        Nodo nue = new Nodo();
        nue.setNombre(n);
        nue.setCapital(c);
        nue.setSig(getP());
        setP(nue);
    }
 
    public void adifinal(String n, String c) {
        Nodo nue = new Nodo();
        nue.setNombre(n);
        nue.setCapital(c);
        if (esVacia()) {
            setP(nue);
        } else {
            Nodo r = getP();
            while (r.getSig() != null) {
                r = r.getSig();
            }
            r.setSig(nue);
        }
    }

    public int nroNodos() {
        int c = 0;
        Nodo r = getP();
        while (r != null) {
            c++;
            r = r.getSig();
        }
        return c;
    }

    public Nodo eliPrincipio() {
        if (esVacia()) return null; 
        Nodo r = getP();
        setP(r.getSig());
        r.setSig(null);
        return r;
    }

    public Nodo eliFinal() {
        if (esVacia()) return null;
        
        Nodo r = getP();
        if (r.getSig() == null) {
            setP(null);
            return r;
        }
        
        Nodo q = getP();
        while (r.getSig() != null) {
            q = r;
            r = r.getSig();
        }
        q.setSig(null);
        return r;
    }

    public void mostrar() {
        Nodo r = getP();
        while (r != null) {
            System.out.println("[" + r.getNombre() + " - " + r.getCapital() + "]");
            r = r.getSig();
        }
    }
}