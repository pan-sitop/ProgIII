/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication43;

/**
 *
 * @author estudiante
 */
public class Pilav {
    private int max=100;
    private Venta v[]=new Venta[max+1];
    private int tope;

    public Pilav() {
        tope=0;
    }
    boolean esvacia(){
        return tope==0;
    }
    boolean esllena(){
        return tope==max;
    }
    void adicionar(Venta xd){
        if (!esllena()) {
            v[tope+1]=xd;
            tope++;
            
        }
        else{
            System.out.println("Pila llena xd");
        }
    }
    Venta eliminar(){
        Venta aux=null;
        if(!esvacia()){
            aux=v[tope];
            tope--;
        }else{
               System.out.println("La pila esta vacia");
        }
        
        return aux;
        }
    void mostrar(){
        Pilav aux=new Pilav();
        while(!esvacia()){
            Venta x=eliminar();
            x.mostrar();
            aux.adicionar(x);
        }
        vaciar(aux);
    }
    void vaciar(Pilav d){
        while(!d.esvacia()){
            adicionar(d.eliminar());
        }
    }
    }
