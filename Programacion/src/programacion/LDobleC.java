/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacion;

/**
 *
 * @author estudiante
 */
public class LDobleC {
    private NodoDC p;
 
    public LDobleC() {
        p = null;
    }
    public NodoDC getP() {
        return p;
    }
    public void setP(NodoDC p) {
        this.p = p;
    }

    public boolean esVacia() {
        return p == null;
    }

    public int nroNodos() {
        int c = 0;
        NodoDC r = getP();
        while (r != null) {
            c++;
            r = r.getSig();
        }
        return c;
    }

    public void adiprincipio(int a, String b, String c, int d) {
        NodoDC nue = new NodoDC();
        nue.setCi(a);
        nue.setFecha(b);
        nue.setTema(c);
        nue.setNroFirmas(d);
        if (esVacia()) {
            setP(nue);
        } else {
            nue.setSig(getP());   
            getP().setAnt(nue);   
            setP(nue); 
        }
    }
 
    public void adifinal(int a, String b, String c, int d) {
        NodoDC nue = new NodoDC();
        nue.setCi(a);
        nue.setFecha(b);
        nue.setTema(c);
        nue.setNroFirmas(d);
        if (esVacia()) {
            setP(nue);
        } else {
            NodoDC r = getP();
            while (r.getSig() != null)
                r = r.getSig();
            nue.setAnt(r);    
            r.setSig(nue);    
        }
    }
 
    public NodoDC eliPrincipio() {
        NodoDC r = getP();
        setP(r.getSig());
        if (getP() != null)
            getP().setAnt(null);  
        r.setSig(null);
        return r;
    }
 
    public NodoDC eliFinal() {
        NodoDC r = getP();
        if (r.getSig() == null) {
            // Solo hay un nodo
            setP(null);
            return r;
        }
        while (r.getSig() != null)
            r = r.getSig();
        NodoDC q = r.getAnt();
        q.setSig(null);   
        r.setAnt(null);
        return r;
    }
 
    public void mostrar() {
        NodoDC r = getP();
        while (r != null) {
            System.out.println(r.getCi()+" "+r.getFecha());
            r = r.getSig();
        }
    }
 
    
}