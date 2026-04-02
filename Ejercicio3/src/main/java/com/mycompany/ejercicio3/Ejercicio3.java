/*Estudiante: Arturo Saul Espinoza Carita*/
package com.mycompany.ejercicio3;

/**
 *
 * @author Arturo
 */
public class Ejercicio3 {
    public static void main(String[] args) {
        ColaP A=new ColaP();
        System.out.println("Cola de Prendas");
        A.adicionar(new Prenda("chalina","lana","azul",100,15,20));
        A.adicionar(new Prenda("poncho","polar","blanco",105,5,35));
        A.adicionar(new Prenda("guantes","cuero","negro",110,20,50));
        A.adicionar(new Prenda("chompa","hilo","amarillo",102,3,25));
        A.adicionar(new Prenda("vestido","tela","azul",104,1,35));
        A.mostrar();
        System.out.println("");
        System.out.println("Pila de Ventas");
        PilaV B=new PilaV();
        B.adicionar(new Venta(110,"1/1/2026",1));
        B.adicionar(new Venta(100,"1/1/2026",2));
        B.adicionar(new Venta(105,"2/1/2026",3));
        B.adicionar(new Venta(110,"2/1/2026",2));
        B.adicionar(new Venta(103,"2/1/2026",1));
        B.adicionar(new Venta(110,"3/1/2026",2));
        B.adicionar(new Venta(105,"3/1/2026",2));
        B.adicionar(new Venta(104,"4/1/2026",1));
        B.mostrar();

        System.out.println("--- Prendas no vendidas ---");
        prendNoVend(A, B);
        System.out.println("");
        
        System.out.println("--- Resultados del ordenamiento (por Precio) ---");
        ordGen(A, B);
        
        System.out.println("Cola de Prendas Ordenada:");
        A.mostrar();
        System.out.println("Pila de Ventas Ordenada (segun precio de prenda):");
        B.mostrar();
    }
    public static void prendNoVend(ColaP A, PilaV B) {
        int n=A.nroelem();
        for (int i=1;i<=n; i++) {
            Prenda p=A.eliminar();
            boolean vend=false;
            PilaV auxB=new PilaV();

            while (!B.esvacia()) {
                Venta v=B.eliminar();
                if (v.getCodigo()==p.getCodigo()) {
                    vend=true;
                }
                auxB.adicionar(v);
            }
            B.vaciar(auxB);
            if (!vend) {
                System.out.println(p.getNombre());
            }

            A.adicionar(p);
        }
    }
    public static void ordGen(ColaP A, PilaV B) {
        ColaP auxA=new ColaP();
        int totA=A.nroelem();
        for (int i=1;i<=totA;i++) {
            Prenda min=A.eliminar();
            int lim=A.nroelem();    
            for (int j=1;j<=lim;j++) {
                Prenda a=A.eliminar();
                if(a.getPrecio()<min.getPrecio()) {
                    A.adicionar(min);
                    min=a;
                }else{
                    A.adicionar(a);
                }
            }
            auxA.adicionar(min);
        }
        A.vaciar(auxA);
        PilaV auxB=new PilaV(); 
        int n=A.nroelem();
        
        for (int i=1;i<=n;i++) {
            Prenda p=A.eliminar();
            PilaV res=new PilaV();
            PilaV temp=new PilaV(); 
            while (!B.esvacia()){
                Venta v=B.eliminar();
                if (v.getCodigo()==p.getCodigo()) {
                    temp.adicionar(v);
                } else {
                    res.adicionar(v);
                }
            }
            B.vaciar(res);
            while (!temp.esvacia()) {
                auxB.adicionar(temp.eliminar());
            }
            
            A.adicionar(p);
        }      
        B.vaciar(auxB);
    }
}