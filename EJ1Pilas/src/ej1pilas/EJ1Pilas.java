/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej1pilas;

/**
 *
 * @author Arturo
 */
public class EJ1Pilas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PilaM p1=new PilaM();
        p1.adicionar(new Mueble(1,"silla","madera","rojo"));
        p1.adicionar(new Mueble(2,"mesa","pino","cafe"));
        p1.adicionar(new Mueble(3,"silla","plastico","blanco"));

        System.out.println("Pila de Muebles:");
        p1.mostrar();

        System.out.println("--- Inciso a ---");
        contarSillas(p1);
        System.out.println("--- Inciso b ---");
        verificarPino(p1);
        System.out.println("--- Inciso c ---");
        mostrarColorX(p1,"blanco");
    }

    public static void contarSillas(PilaM p) {
        int c=0;
        PilaM aux=new PilaM();
        while(!p.esvacia()) {
            Mueble m=p.eliminar();
            if(m.getNombre().equalsIgnoreCase("silla")) {
                c=c+1;
            }
            aux.adicionar(m);
        }
        p.vaciar(aux);
        System.out.println("Cantidad de sillas:"+c);
    }

    public static void verificarPino(PilaM p) {
        boolean sw=false;
        PilaM aux=new PilaM();
        while(!p.esvacia()) {
            Mueble m=p.eliminar();
            if(m.getMaterial().equalsIgnoreCase("pino")) {
                sw=true;
            }
            aux.adicionar(m);
        }
        p.vaciar(aux);
        if(sw) {
            System.out.println("Existe mueble de pino");
        }else {
            System.out.println("No existe mueble de pino");
        }
    }

    public static void mostrarColorX(PilaM p,String x) {
        PilaM aux=new PilaM();
        while(!p.esvacia()) {
            Mueble m=p.eliminar();
            if(m.getColor().equalsIgnoreCase(x)) {
                m.mostrar();
            }
            aux.adicionar(m);
        }
        p.vaciar(aux);
    }
}