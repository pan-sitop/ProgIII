/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1;
//Nombre: Arturo Saul Espinoza Carita
/**
 *
 * @author Arturo
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PilaC A = new PilaC();
        A.adicionar('a');
        A.adicionar('b');
        A.adicionar('e');
        A.adicionar('x');
        A.adicionar('z');

        System.out.println("Pila:");
        A.mostrar();
        
        System.out.println("----- SOLUCION (A) -----");
        System.out.println("Cant. Vocales: " +contarVocales(A));
        System.out.println("----- SOLUCION (B) -----");
        compVocCons(A);
        System.out.println("----- SOLUCION (C) -----");        
        System.out.println("Pila con vocales al final:");
        vocFinal(A);
        A.mostrar();
        System.out.println("----- SOLUCION (D) -----");        
        eliminarLetra(A, 'x');        
        A.mostrar();
    }

    public static int contarVocales(PilaC p) {
        int c=0;
        PilaC aux= new PilaC();
        while (!p.esVacia()) {
            char d=p.eliminar();
            if (esVocal(d)) 
                c++;
            aux.adicionar(d);
        }
        p.vaciar(aux);
        return c;
    }

    public static void compVocCons(PilaC p) {
        int v=0, c= 0;
        PilaC aux=new PilaC();
        while (!p.esVacia()) {
            char d=p.eliminar();
            if (esVocal(d)) 
                v++;
            else 
                c++;
            aux.adicionar(d);
        }
        p.vaciar(aux);
        if (v>c) 
            System.out.println("Existen mas vocales");
        else if 
                (c>v) System.out.println("Existen mas consonantes");
            else 
                System.out.println("Cantidades Iguales");
    }

    public static void vocFinal(PilaC p) {
        PilaC voc= new PilaC();
        PilaC cons=new PilaC();
        while (!p.esVacia()) {
            char d=p.eliminar();
            if (esVocal(d)) {
                voc.adicionar(d);
            }else{
                cons.adicionar(d);
            }
        }
        p.vaciar(cons);
        p.vaciar(voc);
    }

    public static void eliminarLetra(PilaC p, char x) {
        PilaC aux=new PilaC();
        while (!p.esVacia()) {
            char d=p.eliminar();
            if (d!=x) 
                aux.adicionar(d);
        }
        p.vaciar(aux);
    }

    public static boolean esVocal(char c) {
        c=Character.toLowerCase(c);
        return c=='a' || c=='e' || c=='i' || c=='o' || c=='u';
    }
}
