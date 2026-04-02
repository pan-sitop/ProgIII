/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

/**
 *
 * @author estudiante
 */
public class PilaP {
    private int max=100;
    private Propietario v[]=new Propietario[max+1];
    private int tope;
    
    public PilaP()
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
    void adicionar(Propietario elem)
    {
        if(!esllena())
        {
            v[tope+1]=elem;
            tope++;
        }
        else
            System.out.println("Pila llena");
    }
    Propietario eliminar()
    {
        Propietario elem=null;
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
        PilaP aux=new PilaP();
        while(!esvacia())
        {
            Propietario vx=eliminar();
            vx.mostrar();
            aux.adicionar(vx);
        }
        vaciar(aux);
    }
    void vaciar(PilaP z)
    {
        while(!z.esvacia())
           adicionar(z.eliminar());
    }
    
}