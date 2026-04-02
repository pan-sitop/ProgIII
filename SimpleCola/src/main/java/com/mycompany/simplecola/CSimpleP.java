/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.simplecola;

/**
 *
 * @author Jhon Emison Rojas L
 */
public class CSimpleP {
    private int max=50;
    private Persona v[]=new Persona[max+1];
    private int ini,fin;
    
    CSimpleP()
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
        CSimpleP aux=new CSimpleP();
        
        while(!esvacia())
        {
            Persona px=eliminar();
            px.mostrar();
            aux.adicionar(px);
        }
        vaciar(aux);
    }
    void vaciar(CSimpleP z)
    {
        while(!z.esvacia())
            adicionar(z.eliminar());
    }

    
}