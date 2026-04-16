/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author estudiante
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ListaSimple A= new ListaSimple();
        A.adiprincipio("La Paz","La Paz");
        A.adiprincipio("Pando","Cobija");
        A.adiprincipio("Chuquisaca","Sucre");
        A.adiprincipio("Beni","Trinidad");
        System.out.println("-------- DEPARTAMENTOS --------");
        A.mostrar();
        System.out.println("-------------------------------");
        verifica(A, "La Paz");System.out.println();        
        System.out.println(contar(A));
        
        ListaSimpleP B=new ListaSimpleP();
        B.adiprincipio(new Provincia("La Paz","Murillo",2030));
        B.adiprincipio(new Provincia("Oruro","Cercado",65));
        B.adiprincipio(new Provincia("Pando","Manupiri",45));
        B.adiprincipio(new Provincia("Chuquisaca","Murillo",45));
        System.out.println("--------- PROVINCIAS ---------");
        B.mostrar();
        System.out.println("-------------------------------");
        solucion1P(B,"xd");
        System.out.println();
        contar2P(A,B);
        System.out.println();
        contar3P(A,B);
        
    }
    public static void solucion1P(ListaSimpleP a,String x){
        boolean sw=false;
        NodoP z=a.getP();
        while(z!=null){
            if(z.getOp().getNomProvincia().equals(x)){
                System.out.println(z.getOp().getNomDpto());
                sw=true;
            }
            z=z.getSig();
        }
        if(!sw){
            System.out.println("No existe");
        }
    }
    public static void verifica(ListaSimple a, String x){
        boolean sw=false;
        Nodo z=a.getP();
        while(z!=null){
            if(z.getNombre().equals(x)){
                sw=true;
            }
            z=z.getSig();
        }
        if(sw){
            System.out.println("Existe");
        }else{
            System.out.println("No existe");
        }            
    }
    public static int contar(ListaSimple a){
        int c=0;
        Nodo z=a.getP();
        while(z!=null){
            c++;
            z=z.getSig();
        }
        return c;
    }
    public static void contar2P(ListaSimple a, ListaSimpleP b){
        
        Nodo z=a.getP();
        while(z!=null){
            NodoP y=b.getP();
            System.out.println(z.getNombre());
            
            while(y!=null){
                if(z.getNombre().equals(y.getOp().getNomDpto())){
                    System.out.println(y.getOp().getNomProvincia());
                }
                y=y.getSig();
            }
            
            z=z.getSig();
        }
        
    }
    public static void contar3P(ListaSimple a, ListaSimpleP b){
        
        Nodo z=a.getP();
        while(z!=null){
            int c=0;
            NodoP y=b.getP();
            System.out.println(z.getNombre());
            
            while(y!=null){
                if(z.getNombre().equals(y.getOp().getNomDpto())){
                    c++;
                }
                y=y.getSig();
            }
            System.out.println(c);
            z=z.getSig();
        }
        
    }
}
