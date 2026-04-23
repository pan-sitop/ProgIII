/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.listabuses;

/**
 *
 * @author Jhon Emison Rojas L
 */
public class ListaBuses {

    public static void main(String[] args) {
        LSimpleB B=new LSimpleB();
        B.adifinal(new Bus("ug878g",23,"Luis"));
        B.adifinal(new Bus("u844bg",24,"Klever"));
        B.adifinal(new Bus("8gh878g",25,"Gaby"));
        B.mostrar();
        
        System.out.println("------------------Pasajeros--------------------");
        ListaDobleP P=new ListaDobleP();
        P.adiprincipio(new Pasajero("ug878g","Jhon",23));
        P.adiprincipio(new Pasajero("u844bg","Jhojan",19));
        P.adiprincipio(new Pasajero("8gh878g","Gael",20));
        P.mostrar();
        System.out.println("-----------------------S2-------------------------");
        solucion2(B,P);
        System.out.println("-----------------------S3-------------------------");
        solucion3(B,P,23);
        System.out.println("-----------------------S4-------------------------");
        solucion4(B,P,"Jhon");
        System.out.println("-----------------------S5-------------------------");
        solucion5(B, P);
        
        
    }
    
    public static void solucion2(LSimpleB a , ListaDobleP b){
        NodoB q=a.getP();
        while(q!=null){
            System.out.println("Bus: "+ q.getBus().getPlaca()+" "+q.getBus().getConductor());
            NodoDP z=b.getP();
            int c=0;
            while(z!=null){
                if(q.getBus().getPlaca().equals(z.getDato().getPlaca())){
                    System.out.println("    "+ z.getDato().getNombre());
                    c++;
                }
                z=z.getSig();
            }
            System.out.println("Total pasajeros: "+c);
            q=q.getSig();
        }
    }
    
    
    public static void solucion3(LSimpleB a, ListaDobleP b, int x){
        NodoB q=a.getP();
        while(q!=null){
            String j = q.getBus().getPlaca();
            if(verifica(b,x,j)){
                System.out.println("BUS: "+q.getBus().getPlaca());
            }
            q =q.getSig();
        }
    }    
    public static boolean verifica(ListaDobleP bb, int x, String j){
        boolean sw = false;
        NodoDP w = bb.getP();
        while(w!=null){
            if(w.getDato().getEdad()==x && w.getDato().getPlaca().equalsIgnoreCase(j))
                sw = true;
            w = w.getSig();
        }
        return sw;
    }
    
    
    public static void solucion4(LSimpleB a, ListaDobleP b, String x){
        NodoB q=a.getP();
        while(q!=null){
            String j = q.getBus().getPlaca();
            if(verifica2(b,x,j)){
                System.out.println("BUS: "+q.getBus().getPlaca());
            }
            q =q.getSig();
        }
    } 
    public static boolean verifica2(ListaDobleP bb, String x,String j){
        boolean sw = false;
        NodoDP w = bb.getP();
        while(w!=null){
            if(w.getDato().getNombre().equalsIgnoreCase(x)&& w.getDato().getPlaca().equalsIgnoreCase(j))
                sw = true;
            w = w.getSig();
        }
        return sw;
    }
    
    
    
    public static void solucion5(LSimpleB a, ListaDobleP b){
        NodoB q=a.getP();
        while(q!=null){
            String j = q.getBus().getPlaca();
            System.out.println(q.getBus().getPlaca());
            menor(b,j);
            q =q.getSig();
        }
    } 
    public static void menor(ListaDobleP bb, String l){
        NodoDP w = bb.getP();
        int j = 9999999;
        while(w!=null){
            String a = w.getDato().getPlaca();
            int k2 = w.getDato().getEdad();
            if(k2<j &&w.getDato().getPlaca().equalsIgnoreCase(l)){
                j=k2;
            }
            w = w.getSig();
        }
        NodoDP J1 = bb.getP();
        while(J1!=null){
            int k4=J1.getDato().getEdad();
            if(k4==j && J1.getDato().getPlaca().equalsIgnoreCase(l))
                System.out.println("Pasajero: "+J1.getDato().getNombre() +" edad "+J1.getDato().getEdad());
            J1=J1.getSig();
        }
    }
}
