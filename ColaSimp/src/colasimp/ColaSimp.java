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
public class ColaSimp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ColaSimpP A=new ColaSimpP();
        A.adicionar(new Persona("Yonti","masculino",18,180));
        A.adicionar(new Persona("Abel","masculino",21,150));
        A.adicionar(new Persona("Jessica","femenino",15,130));
        A.adicionar(new Persona("Pan","masculino",25,155));
        A.adicionar(new Persona("Cait","femenino",10,100));
        A.mostrar();
        System.out.println("----- problema 1 -----");
        solucion1(A);
        A.mostrar();
        System.out.println("----- problema 2 -----");
        ColaSimpP B=new ColaSimpP();
        B.adicionar(new Persona("goku","masculino",18,80));
        B.adicionar(new Persona("black","masculino",21,150));
        B.adicionar(new Persona("milk","femenino",15,170));
        solucion2(A,B,4);
        A.mostrar();
    }
    public static void solucion1(ColaSimpP A ){
        ColaSimpP B =new ColaSimpP();
        ColaSimpP C =new ColaSimpP();
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
    public static void solucion2(ColaSimpP A,ColaSimpP B,int i){
        ColaSimpP aux = new ColaSimpP();
        if(i<=A.nroelem()){
            for(int j=1; j<=i;j++)
                aux.adicionar(A.eliminar());
            aux.vaciar(B);
            aux.vaciar(A);
            A.vaciar(aux);
            
        }
    }
}
