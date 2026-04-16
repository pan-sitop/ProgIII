package main;

class ListaSimpleP {
    private NodoP p;

    public ListaSimpleP() {
        p = null;
    }

    public NodoP getP() {
        return p;
    }

    public void setP(NodoP p) {
        this.p = p;
    }

    public boolean esVacia() {
        return p == null;
    }

    public void adiprincipio(Provincia b) {
        NodoP nue = new NodoP();
        nue.setOp(b);
        nue.setSig(getP());
        setP(nue);
    }

    public void adifinal(Provincia b) {
        NodoP nue = new NodoP();
        nue.setOp(b);
        if (esVacia()) {
            setP(nue);
        } else {
            NodoP r = getP();
            while (r.getSig() != null) {
                r = r.getSig();
            }
            r.setSig(nue);
        }
    }

    public int nroNodos() {
        int c = 0;
        NodoP r = getP();
        while (r != null) {
            c++;
            r = r.getSig();
        }
        return c;
    }

    public NodoP eliPrincipio() {
        if (esVacia()) return null;
        NodoP r = getP();
        setP(r.getSig());
        r.setSig(null);
        return r;
    }

    public NodoP eliFinal() {
        if (esVacia()) return null;

        NodoP r = getP();
        if (r.getSig() == null) {
            setP(null);
            return r;
        }

        NodoP q = getP();
        while (r.getSig() != null) {
            q = r;
            r = r.getSig();
        }
        q.setSig(null);
        return r;
    }

    public void mostrar() {
        NodoP r = getP();
        while (r != null) {
            r.getOp().mostrar(); 
            r = r.getSig();
        }
    }
}