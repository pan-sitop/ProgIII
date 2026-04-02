/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

/**
 *
 * @author estudiante
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CCircularM m1=new CCircularM();
        m1.adicionar(new Mascota("gato","char","angora",2));
        m1.adicionar(new Mascota("gato","integer","normal",1));
        m1.adicionar(new Mascota("gato","godines","normal",3));
        m1.adicionar(new Mascota("gato","chavo","angora",2));
        m1.adicionar(new Mascota("gato","kriko","angora",1));
        
        CCircularM m2=new CCircularM();
        m2.adicionar(new Mascota("perro","esponjita","criollo",2));
        m2.adicionar(new Mascota("perro","pelusa","cuaker",1));
        m2.adicionar(new Mascota("perro","princesa","pitbull",3));
        
        CCircularM m3=new CCircularM();
        m3.adicionar(new Mascota("loro","a","zoo",2));
        m3.adicionar(new Mascota("loro","b","zoo",1));
        m3.adicionar(new Mascota("loro","c","zoo",3));
        
        CCircularM m4=new CCircularM();
        m4.adicionar(new Mascota("jamster","a","criollo",2));
        m4.adicionar(new Mascota("jamster","b","cuaker",1));
        m4.adicionar(new Mascota("jamster","c","criollo",3));
        
        CCircularM m5=new CCircularM();
        m5.adicionar(new Mascota("raton","a","criollo",2));
        m5.adicionar(new Mascota("raton","b","cuaker",1));
        m5.adicionar(new Mascota("raton","c","criollo",3));                      
        
        MultiPilaP A=new MultiPilaP();
        A.adicionar(1, new Propietario("Yonti", 123,m1));
        A.adicionar(1, new Propietario("Lucy", 124,m2));
        A.adicionar(2, new Propietario("Jam", 125,m3));
        A.adicionar(3, new Propietario("gael", 126,m4));
        A.adicionar(3, new Propietario("jhojan", 127,m5)); 
        A.mostrar();
        System.out.println();
        solucion1(A,"gato");
    }
    public static void solucion1(MultiPilaP a, String x) {
    int t = 0;  
    for (int i = 1; i <= a.getNp(); i++) {
        PilaP aux = new PilaP(); 
        while (!a.esVacia(i)) {
            Propietario px = a.eliminar(i);
            t = t + contar(px.getCm(), x);
            aux.adicionar(px);
        }
        a.vaciar(i, aux);
    }
    System.out.println("Total: "+t);
}

public static int contar(CCircularM c, String x) {
    int k = 0;
    int n = c.nroelem();    
    for (int j = 1; j <= n; j++) {
        Mascota mx = c.eliminar();
        if (mx.getEspecie().equals(x)) {
            k++;
        }
        c.adicionar(mx);
    }
    return k;
}
}
