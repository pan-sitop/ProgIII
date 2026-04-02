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
public class ColaP {
    private int max=50;
    private Prenda v[]=new Prenda[max+1];
    private int ini,fin;
    
    ColaP()
    {
        ini=fin=0;
    }
    int nroelem()
    {
        if(ini==0 && fin==0)
            return 0;
        else
            if(fin>ini)
                return fin-ini;
            else
                return max-ini+fin;
    }
    boolean esvacia()
    {
        return nroelem()==0;
    }
    boolean esllena()
    {
        return nroelem()==max;
    }
    void adicionar(Prenda elem)
    {
        if(!esllena())
        {
            if(fin==max)
                fin=1;
            else
                fin++;
            v[fin]=elem;
        }
        else
            System.out.println("Cola llena");
    }
    Prenda eliminar()
    {
        Prenda elem=null;
        if(!esvacia())
        {
            elem=v[ini+1];
            ini++;
            if(ini==max)
                ini=0;
            
            if(ini==fin)
                ini=fin=0;
        }
        else
            System.out.println("Cola vacia");
        return elem;
    }
    void mostrar()
    {
        int n=nroelem();
        for(int i=1;i<=n;i++)
        {
            Prenda a=eliminar();
            a.mostrar();
            adicionar(a);
                    
        }
    }
    void vaciar(ColaP z)
    {
        while(!z.esvacia())
            adicionar(z.eliminar());
    }
}
