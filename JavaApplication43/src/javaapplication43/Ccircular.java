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
public class Ccircular {
    private int max=50;
    private Prenda v[]=new  Prenda[max+1];
    private int ini ,fin;

    public Ccircular() {
        ini=fin=0;
    }
    boolean esvacia(){
        if(nroelem()==0){
            return true;
        }
        return false;
    }
    boolean esllena(){
        if(nroelem()==max){
            return true;
        }
        return false;
    }
    int nroelem(){
        if(ini==0 && fin==0){
            return 0;
        }
        else if(fin>ini){
            return fin -ini;
        }
        else{
            return max-ini+fin;
        }
    }
    void adicionar(Prenda elem){
        if(!esllena()){
            if(ini==fin)
            {
                fin=1;
            }else{
                fin++;
            }
            v[fin]=elem;
        }
        else{
            System.out.println("Cola llena");
        }
    }
    Prenda eliminar(){
        Prenda elem=null;
        if(!esvacia()){
            ini++;
            elem=v[ini];
            if(ini==max){
                ini=0;
                
            }
            if(ini==fin)
                {
                    ini=fin=0;
                }
        }else{
            System.out.println("cola vacia");
        }
        
        return elem;
    }
    void vaciar(Ccircular z){
        while(!z.esvacia()){
            adicionar(z.eliminar());
        }
    }
    void mostrar(){
        int n=nroelem();
        for (int i=1;i<=n;i++){
            Prenda x=eliminar();
            x.mostrar();
            adicionar(x);
            
        }
    }
    
}
