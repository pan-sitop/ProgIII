/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2;

/**
 *
 * @author Arturo
 */
public class PilaObj {
    private int max=100;
    private Calzado[] v=new Calzado[max + 1];
    private int tope;
    public PilaObj() {
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
    public void adicionar(Calzado elem)
    {
        if (!esLlena()){
            v[tope+1]=elem;
            tope=tope+ 1;
        }else{
            System.out.println("Pila Llena");
        }
    }
    public Calzado eliminar() {
        Calzado elem=null;
        if (!esVacia()){
            elem=v[tope];
            tope=tope - 1;
        }else{
            System.out.println("Pila Vacia");
        }
        return elem;
    }
    public void mostrar() {
        PilaObj aux=new PilaObj();
        while (!esVacia()){
            Calzado elem=eliminar();
            elem.mostrar();
            aux.adicionar(elem);
        }
        vaciar(aux);
    }
    public void vaciar(PilaObj z) {
        while (!z.esVacia()){
            adicionar(z.eliminar());
        }
    }
}
