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
public class PilaV {
    private int max=100;
    private Venta v[]=new Venta[max+1];
    private int tope;
    
    PilaV()
    {
        tope=0;
    }
    boolean esvacia()
    {
        return tope==0;
    }
    boolean esllena()
    {
        return tope==max;
    }
    void adicionar(Venta elem)
    {
        if(!esllena())
        {
            v[tope+1]=elem;
            tope++;
        }
        else
            System.out.println("Pila llena");
    }
    Venta eliminar()
    {
        Venta elem=null;
        if(!esvacia())
        {
            elem=v[tope];
            tope--;
        }
        else
            System.out.println("Pila vacia");
        return elem;
    }
    void mostrar()
    {
        PilaV aux=new PilaV();
        while(!esvacia())
        {
            Venta vx=eliminar();
            vx.mostrar();
            aux.adicionar(vx);
        }
        vaciar(aux);
    }
    void vaciar(PilaV z)
    {
        while(!z.esvacia())
           adicionar(z.eliminar());
    }
    
}
