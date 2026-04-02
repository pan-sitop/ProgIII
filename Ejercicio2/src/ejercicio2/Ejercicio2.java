/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2;
//Nombre: Arturo Saul Espinoza Carita
/**
 *
 * @author Arturo
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PilaObj P = new PilaObj();
        P.adicionar(new Calzado(38, "negro", "cuero", "formal"));
        P.adicionar(new Calzado(40, "blanco", "tela", "deportivo"));
        P.adicionar(new Calzado(35, "rojo", "sintetico", "casual"));
        P.adicionar(new Calzado(42, "negro", "cuero", "formal"));
        System.out.println("Pila:");
        P.mostrar();
        System.out.println("------- SOLUCION (A) -------");
        System.out.println(contColor(P, "negro"));
        System.out.println("----- SOLUCION (B) -----");
        llevarPrin(P, "deportivo");
        P.mostrar();
        System.out.println("----- SOLUCION (C) -----");
        interExt(P);        
        P.mostrar();
        System.out.println("----- SOLUCION (D) -----");
        iEsimoAlFin(P, 2);     
        P.mostrar();
    }
    public static int contColor(PilaObj p, String x) {
        int c=0;
        PilaObj aux=new PilaObj();
        while (!p.esVacia()){
            Calzado item=p.eliminar();
            if (item.getColor().equals(x)) 
                c++;
            aux.adicionar(item);
        }
        p.vaciar(aux);
        return c;
    }
    public static void llevarPrin(PilaObj p, String x) {
        PilaObj tx=new PilaObj();
        PilaObj o=new PilaObj();
        while (!p.esVacia()){
            Calzado item=p.eliminar();
            if (item.getTipo().equals(x)) 
                tx.adicionar(item);
            else 
                o.adicionar(item);
        }
        p.vaciar(tx);
        p.vaciar(o);
    }
    public static void interExt(PilaObj p) {
        if (!p.esVacia()){
            Calzado u=p.eliminar();
            PilaObj aux=new PilaObj();
            while (!p.esVacia()) 
                aux.adicionar(p.eliminar());
            if (!aux.esVacia()){
                Calzado f=aux.eliminar();
                p.adicionar(u);
                while (!aux.esVacia()) 
                    p.adicionar(aux.eliminar());
                p.adicionar(f);
            }else{
                p.adicionar(u);
            }
        }
    }
    public static void iEsimoAlFin(PilaObj p, int i) {
        PilaObj aux1=new PilaObj();
        PilaObj aux2=new PilaObj();
        int n=0;
        while (!p.esVacia()) {
            aux1.adicionar(p.eliminar());
            n++;
        }
        p.vaciar(aux1);
        for (int k=1;k<i;k++){
            aux1.adicionar(p.eliminar());
        }
        Calzado obj=p.eliminar();
        aux2.vaciar(p);
        p.vaciar(aux2);
        p.vaciar(aux1);
        p.adicionar(obj);
    }
}
