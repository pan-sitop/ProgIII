/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1;

/**
 *
 * @author Arturo
 */
public class PilaC {
    private int max=100;
    private char[] v=new char[max + 1];
    private int tope;

    public PilaC(){
        tope=0;
    }

    public boolean esVacia(){
        if (tope==0) 
            return true;
        return false;
    }

    public boolean esLlena(){
        if (tope==max) 
            return true;
        return false;
    }

    public void adicionar(char elem){
        if (!esLlena()){
            v[tope + 1]=elem;
            tope =tope+ 1;
        }else{
            System.out.println("Pila Llena");
        }
    }

    public char eliminar(){
        char elem=' ';
        if (!esVacia()){
            elem=v[tope];
            tope=tope - 1;
        }else{
            System.out.println("Pila Vacia");
        }
        return elem;
    }

    public void mostrar(){
        PilaC aux=new PilaC();
        while (!esVacia()){
            char elem=eliminar();
            System.out.println(elem);
            aux.adicionar(elem);
        }
        vaciar(aux);
    }

    public void vaciar(PilaC z){
        while (!z.esVacia()){
            adicionar(z.eliminar());
        }
    }
}
