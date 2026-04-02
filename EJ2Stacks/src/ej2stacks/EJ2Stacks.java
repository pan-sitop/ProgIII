/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej2stacks;

/**
 *
 * @author Arturo
 */
import java.util.*;
public class EJ2Stacks {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Stack<Mueble> pm=new Stack<>();
        Stack<VentaM> pv=new Stack<>();

        pm.push(new Mueble(1,"Silla","madera","rojo",150));
        pm.push(new Mueble(2,"mesa","pino","verde",500));
        pm.push(new Mueble(3,"Estante","roble","cafe",800));

        pv.push(new VentaM(1,"2024-05-10",2));
        pv.push(new VentaM(1,"2024-05-11",3));
        pv.push(new VentaM(2,"2024-05-11",1));

        System.out.println("--- Inciso a ---");
        totalSillasVendidas(pm,pv);
        System.out.println("--- Inciso b ---");
        precioTotalVentasColorX(pm,pv,"rojo");
        System.out.println("--- Inciso c ---");
        mueblesNoVendidos(pm,pv);
        System.out.println("--- Inciso d ---");
        verificarVentaMesaFechaX(pm,pv,"2024-05-11");
    }

    public static void totalSillasVendidas(Stack<Mueble> pm,Stack<VentaM> pv) {
        int total=0;
        Stack<VentaM> auxV=new Stack<>();
        while(!pv.isEmpty()) {
            VentaM v=pv.pop();
            Stack<Mueble> auxM=new Stack<>();
            while(!pm.isEmpty()) {
                Mueble m=pm.pop();
                if(m.getCodigo()==v.getCodigo()&&m.getNombre().equalsIgnoreCase("Silla")) {
                    total=total+v.getCantidad();
                }
                auxM.push(m);
            }
            while(!auxM.isEmpty()) pm.push(auxM.pop());
            auxV.push(v);
        }
        while(!auxV.isEmpty()) pv.push(auxV.pop());
        System.out.println("Total sillas vendidas:"+total);
    }

    public static void precioTotalVentasColorX(Stack<Mueble> pm,Stack<VentaM> pv,String x) {
        double total=0;
        Stack<VentaM> auxV=new Stack<>();
        while(!pv.isEmpty()) {
            VentaM v=pv.pop();
            Stack<Mueble> auxM=new Stack<>();
            while(!pm.isEmpty()) {
                Mueble m=pm.pop();
                if(m.getCodigo()==v.getCodigo()&&m.getColor().equalsIgnoreCase(x)) {
                    total=total+(m.getPrecio()*v.getCantidad());
                }
                auxM.push(m);
            }
            while(!auxM.isEmpty()) pm.push(auxM.pop());
            auxV.push(v);
        }
        while(!auxV.isEmpty()) pv.push(auxV.pop());
        System.out.println("Precio total ventas color "+x+":"+total);
    }

    public static void mueblesNoVendidos(Stack<Mueble> pm,Stack<VentaM> pv) {
        Stack<Mueble> auxM=new Stack<>();
        while(!pm.isEmpty()) {
            Mueble m=pm.pop();
            boolean vendido=false;
            Stack<VentaM> auxV=new Stack<>();
            while(!pv.isEmpty()) {
                VentaM v=pv.pop();
                if(v.getCodigo()==m.getCodigo()) {
                    vendido=true;
                }
                auxV.push(v);
            }
            while(!auxV.isEmpty()) pv.push(auxV.pop());
            if(!vendido) {
                m.mostrar();
            }
            auxM.push(m);
        }
        while(!auxM.isEmpty()) pm.push(auxM.pop());
    }

    public static void verificarVentaMesaFechaX(Stack<Mueble> pm,Stack<VentaM> pv,String x) {
        boolean sw=false;
        Stack<VentaM> auxV=new Stack<>();
        while(!pv.isEmpty()) {
            VentaM v=pv.pop();
            if(v.getFecha().equals(x)) {
                Stack<Mueble> auxM=new Stack<>();
                while(!pm.isEmpty()) {
                    Mueble m=pm.pop();
                    if(m.getCodigo()==v.getCodigo()&&m.getNombre().equalsIgnoreCase("mesa")) {
                        sw=true;
                    }
                    auxM.push(m);
                }
                while(!auxM.isEmpty()) pm.push(auxM.pop());
            }
            auxV.push(v);
        }
        while(!auxV.isEmpty()) pv.push(auxV.pop());
        if(sw) System.out.println("Se vendio mesa en fecha "+x);
        else System.out.println("No se vendio mesa en fecha "+x);
    }
}
