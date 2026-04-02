/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.simplecola;

/**
 *
 * @author Jhon Emison Rojas L
 */
public class SimpleCola {

   public static void main(String[] args) {
        // TODO code application logic here
        CSimpleP A=new CSimpleP();
        A.adicionar(new Persona("Ana","femenino",17,75));
        A.adicionar(new Persona("Juan","masculino",15,175));
        A.adicionar(new Persona("Juana","femenino",17,157));
        A.adicionar(new Persona("Pedro","masculino",26,160));
        A.adicionar(new Persona("Rene","masculino",13,145));
        A.mostrar();
        //PROBLEMAS
        //1. cuantos damas y cuantos varones existe en la cola
        System.out.println("//2. llevar a las damas al principio de la cola");
        problema2(A);
        A.mostrar();
        
        //3. Determinar la mayor estatura
        System.out.println("//4. Mostrar los nombres de las personas con la mayor edad");
        problema4(A);
        //5. Ordenar la cola la estatura
        System.out.println("//6. intercambiar la primera con la ultima persona");
        problema6(A);
        A.mostrar();
    }
    public static void problema2(CSimpleP a)
    {
        CSimpleP b=new CSimpleP();//damas
        CSimpleP c=new CSimpleP();//varones
        while(!a.esvacia())
        {
            Persona x=a.eliminar();
            if(x.getSexo().equals("femenino"))
                b.adicionar(x);
            else
                c.adicionar(x);
        }
        a.vaciar(b);
        a.vaciar(c);
    }
    public static void problema4(CSimpleP a)
    {
        CSimpleP aux=new CSimpleP();
        int may=0;
        while(!a.esvacia())
        {
            Persona x=a.eliminar();
            if(x.getEdad()>may)
                may=x.getEdad();
            aux.adicionar(x);
        }
        while(!aux.esvacia())
        {
            Persona x=aux.eliminar();
            if(x.getEdad()==may)
                System.out.println(x.getNombre());
            a.adicionar(x);
        }
    }
    
    public static void problema6(CSimpleP a)
    {
        CSimpleP b=new CSimpleP();
        Persona x=a.eliminar();
        int n=a.nroelem();
        for(int i=1;i<n;i++)
            b.adicionar(a.eliminar());
        a.vaciar(b);
        a.adicionar(x);
        
    }
    
}