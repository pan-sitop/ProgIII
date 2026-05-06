package com.mycompany.principal;

/**
 *
 * @author Arturo
 */
public class LSimpleE {
    private NodoE p;

    public LSimpleE() {
        p = null;
    }

    public NodoE getP() {
        return p;
    }
    public void setP(NodoE p) {
        this.p = p;
    }

    public boolean esVacia() {
        return p == null;
    }

    public void adiprincipio(int a,String b, String c, String d) {
        NodoE nue = new NodoE();
        nue.setCi(a);
        nue.setNombre(b);
        nue.setPaterno(c);
        nue.setMaterno(d);
       
        nue.setSig(getP());
        setP(nue);
    }

    public void adifinal(int a,String b, String c, String d) {
        NodoE nue = new NodoE();
         nue.setCi(a);
        nue.setNombre(b);
        nue.setPaterno(c);
        nue.setMaterno(d);
        if (esVacia()) {
            setP(nue);
        } else {
            NodoE r = getP();
            while (r.getSig() != null)
                r = r.getSig();
            r.setSig(nue);
        }
    }

    public int nroNodos() {
        int c = 0;
        NodoE r = getP();
        while (r != null) {
            c++;
            r = r.getSig();
        }
        return c;
    }

    public NodoE eliPrincipio() {
        NodoE r = getP();
        setP(r.getSig());
        r.setSig(null);
        return r;
    }

    public NodoE eliFinal() {
        NodoE r = getP();
        NodoE q = getP();
        if (getP().getSig() == null) {
            setP(null);
            return r;
        }
        while (r.getSig() != null) {
            q = r;
            r = r.getSig();
        }
        q.setSig(null);
        return r;
    }

    public void mostrar() {
        NodoE r = getP();
        while (r != null) {
            System.out.println(r.getCi()+" "+r.getNombre());  // llama al mostrar() del objeto
            r = r.getSig();
        }
    }
}
