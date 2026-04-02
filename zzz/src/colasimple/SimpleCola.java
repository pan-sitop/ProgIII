/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colasimple;

/**
 *
 * @author estudiante
 */
public class SimpleCola {

   public static void main(String[] args) {
        // TODO code application logic here
        CSimpleP A=new CSimpleP();
        CSimpleP B=new CSimpleP();
        A.adicionar(new Persona("Luisa","femenino",18,153));
        A.adicionar(new Persona("Gabo","masculino",15,165));
        A.adicionar(new Persona("Laura","femenino",28,157));
        A.adicionar(new Persona("Pepe","masculino",7,160));
        A.adicionar(new Persona("Ramiro","masculino",9,145));
        
        B.adicionar(new Persona("Carla","femenino",8,145));
        B.adicionar(new Persona("Jose","masculino",5,125));
        B.adicionar(new Persona("Jhoselin","femenino",21,187));
        B.adicionar(new Persona("Moises","masculino",31,160));
        B.adicionar(new Persona("Pedro","masculino",12,145));
        A.mostrar();
        System.out.println("");
        B.mostrar();
        System.out.println("");
        System.out.println("Problema 1: colocar los menores de 12 años arriba:");
        System.out.println("");
        problema1(A);
        A.mostrar();
        System.out.println("");
        
        System.out.println("Problema 2: colocar en el iesimo la segunda pila:");
        System.out.println("");
        Problema2(A,B,4);
        A.mostrar();
       
    }
   
   public static void problema1(CSimpleP A){
        CSimpleP B =new CSimpleP();
        CSimpleP C =new CSimpleP();
        while(!A.esvacia()){
            Persona t = A.eliminar();
            if(t.getEdad()<=12)
                B.adicionar(t);
            else 
                C.adicionar(t);
        }
        A.vaciar(B);
        A.vaciar(C);
    }
   
   public static void Problema2(CSimpleP A,CSimpleP B,int i){
        CSimpleP aux = new CSimpleP();
        if(i<=A.nroelem()){
            for(int j=1; j<=i;j++)
                aux.adicionar(A.eliminar());
            aux.vaciar(B);
            aux.vaciar(A);
            A.vaciar(aux);
        }
    } 
}