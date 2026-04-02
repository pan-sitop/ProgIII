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
public class Clase2{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ColaCircularP A=new ColaCircularP();
        A.adicionar(new Prenda("Chalina","lana","Azul",109,25,30));
        A.adicionar(new Prenda("Gorra","Plumas","Plomo",245,10,50));
        A.adicionar(new Prenda("Chompa","Polar","Verde",777,7,70));
        A.adicionar(new Prenda("Polera","Algodon","Negro",010,1,120));
        A.adicionar(new Prenda("Tenis","Cuero","Celeste",123,15,90));
        A.mostrar();
        System.out.println("");
        
        
        PilaOb B=new PilaOb();
        B.adicionar(new Venta(777, 2, "19/10/19"));
        B.adicionar(new Venta(109, 3, "26/05/20"));
        B.adicionar(new Venta(245, 4, "04/04/16"));
        B.adicionar(new Venta(010, 6, "21/05/21"));
        B.adicionar(new Venta(123, 6, "30/12/22"));
        B.mostrar();
        System.out.println("");
        totalVenta(A,B);
        System.out.println("");
        // 3. Determinar prendas con mayor venta
        prendasMayorVenta(A, B);
    }
    public static void totalVenta(ColaCircularP a, PilaOb b) {
        int n = a.nroelem();
        PilaOb bb=new PilaOb();
        for (int i = 1; i <= n; i++) {
            Prenda p= a.eliminar();
            System.out.print(p.getNombre());
            int c=0;
            while(!b.esVacia()){
                Venta v=b.eliminar();
                if(v.getCodigo()==p.getCodigo()){
                    c=c+v.getCantidad();
                }
                bb.adicionar(v);
            }
            System.out.println(" ---> "+c);
            b.vaciar(bb);
            a.adicionar(p);
        }
    }
    
    public static void prendasMayorVenta(ColaCircularP a, PilaOb b) {
        int n = a.nroelem();
        PilaOb bb = new PilaOb();
        int maxVentas = 0;
        for (int i = 1; i <= n; i++) {
            Prenda p = a.eliminar();
            int c = 0;
            while (!b.esVacia()) {
                Venta v = b.eliminar();
                if (v.getCodigo() == p.getCodigo()) {
                    c = c + v.getCantidad();
                }
                bb.adicionar(v);
            }
            b.vaciar(bb);
            if (c > maxVentas) {
                maxVentas = c;
            }
            a.adicionar(p);
        }

        System.out.println("Prendas con mayor venta: ");
        if (maxVentas == 0) {
            System.out.println("No se registraron ventas.");
        } else {
            System.out.println("Cantidad maxima vendida: "+maxVentas+" unidades");
            for (int i=1; i<=n;i++) {
                Prenda p = a.eliminar();
                int c = 0;
                while (!b.esVacia()) {
                    Venta v = b.eliminar();
                    if (v.getCodigo()==p.getCodigo()) {
                        c = c + v.getCantidad();
                    }
                    bb.adicionar(v);
                }
                b.vaciar(bb);
                if (c==maxVentas) {
                    System.out.println("- " + p.getNombre() + " (Codigo: " + p.getCodigo() + ")");
                }
                a.adicionar(p);
            }
        }
    }
    
}
