package main;

class NodoP {
    private Provincia op;
    private NodoP sig; 

    public NodoP() {
        sig = null;
    }

    public Provincia getOp() {
        return op;
    }

    public void setOp(Provincia op) {
        this.op = op;
    }

    public NodoP getSig() { 
        return sig;
    }

    public void setSig(NodoP sig) {
        this.sig = sig;
    }
}