/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio;

/**
 *
 * @author estudiante
 */
public class Ejercicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ColaP A=new ColaP();
        System.out.println("cola Prendas");
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
        //1. Determinar la cantidad total
        //vendida de cada prenda
        totalVentas(A,B);
        //2. Mostrar el nombre de las prendas
        //que no se vendieron
        //3. Determinar las prendas con mayor venta.
        //4. Ordenar las prendas por el precio y segun ese
        //orden ordenar sus ventas
    }
    public static void totalVentas(ColaP a, PilaV b)
    {
        PilaV bb=new PilaV();
        int n=a.nroelem();
        for(int i=1;i<=n;i++)
        {
            Prenda p=a.eliminar();
            a.adicionar(p);
            System.out.print(p.getNombre());
            int c=0;
            while(!b.esvacia())
            {
                Venta v=b.eliminar();
                if(v.getCodigo()==p.getCodigo())
                    c=c+v.getCantidad();
                bb.adicionar(v);
            }
            System.out.println(" --> "+c);
            b.vaciar(bb);
        }
    }
    
}
