/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pilas;

import java.util.Scanner;

/**
 *
 * @author estudiante
 */
public class Pilas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        PilaN A=new PilaN();
        A.adicionar("La Paz");
        A.adicionar("Oruro");
        A.adicionar("Pando");
        A.adicionar("Beni");
        A.mostrar();
        
        /*System.out.print("Ingresa el valor a verificar: ");
        String x = sc.next();
        
        boolean existe = verifica(A, x);
        System.out.println("¿Existe el elemento? " + existe);*/
        
        /*Primer deparatmento al ultimo*/
        System.out.println("------------------");
        problema1(A);
        System.out.println("------------------");
        
        /*Segundo: verifica si existe dep x*/
        System.out.println("------------------");
        System.out.println(verificaX(A, "Tarija"));
        System.out.println("------------------");
        
        /*Tercero: ultimo departamento al primero*/
        System.out.println("------------------");
        problema2(A);
        System.out.println("------------------");
        
    }
    public static void problema1(PilaN a){
        PilaN aa= new PilaN();
        aa.vaciar(a);
        String x=aa.eliminar();
        a.vaciar(aa);
        a.adicionar(x);
        a.mostrar();
    }
    public static boolean verificaX(PilaN a, String x) {
        PilaN b=new PilaN();
        boolean sw = false;
        while (!a.esVacia()) {
            String dx = a.eliminar();
            if (dx.equals(x)) {
                sw=true;
            }
            b.adicionar(dx);
        }
        a.vaciar(b);
        return sw;
    }
    public static void problema2(PilaN a){
        PilaN aa=new PilaN();
        String aux=a.eliminar();
        aa.vaciar(a);
        a.adicionar(aux);
        a.vaciar(aa);
        a.mostrar();
    }
}
