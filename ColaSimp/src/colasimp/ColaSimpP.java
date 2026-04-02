/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colasimp;

/**
 *
 * @author estudiante
 */
public class ColaSimpP {
    private int max=50;
    private Persona v[]=new Persona[max+1];
    private int ini,fin;
    
    ColaSimpP()
    {
        ini=fin=0;
    }
    boolean esvacia()
    {
        if(ini==0 && fin==0)
            return true;
        return false;
    }
    boolean esllena()
    {
        if(fin==max)
            return true;
        return false;
    }
    int nroelem()
    {
        return fin-ini;
    }
    void adicionar(Persona elem)
    {
        if(!esllena())
        {
            v[fin+1]=elem;
            fin=fin+1;
        }
        else
            System.out.println("Cola llena...");
    }
    Persona eliminar()
    {
        Persona elem=null;
        if(!esvacia())
        {
            elem=v[ini+1];
            ini=ini+1;
            if(ini==fin)
                ini=fin=0;
        }
        else
            System.out.println("Cola Vacia...");
        return elem;
    }
    void mostrar()
    {
        ColaSimpP aux=new ColaSimpP();
        
        while(!esvacia())
        {
            Persona px=eliminar();
            px.mostrar();
            aux.adicionar(px);
        }
        vaciar(aux);
    }
    void vaciar(ColaSimpP z)
    {
        while(!z.esvacia())
            adicionar(z.eliminar());
    }
}
