/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lproductos;

/**
 *
 * @author Jhon Emison Rojas L
 */
public class LProductos {

    public static void main(String[] args) {
        ListaDobleP a=new ListaDobleP();
        a.adifinal(new Producto("papa","aa",23));
        a.adifinal(new Producto("tomate","aa",33));
        a.adifinal(new Producto("zanahoria","aa",53));
        a.adifinal(new Producto("queso","aa",29));
        a.adifinal(new Producto("cilantro","aa",54));
        a.mostrar();
        System.out.println("-------------------------------------------------");
        Problema1(a,23);
        System.out.println("-------------------------------------------------");
        Problema2(a);
    }
    
   public static void Problema1(ListaDobleP a,int x){
       int c=0;
       NodoDP r=a.getP();
       while(r!=null){
           if(r.getDato().getPrecio()==x)
               c++;
           r=r.getSig();
       }
       System.out.println(c);
   }
   
   public static void Problema2(ListaDobleP a){
       NodoDP w=a.getP();
       while(w.getSig()!=null)
           w=w.getSig();
       NodoDP q=w.getAnt();
       q.getDato().mostrar();
   }
}
