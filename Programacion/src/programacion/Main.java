/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacion;
/**
 *
 * @author estudiante
 */
public class Main {

    public static void main(String[] args) {
        LSimpleE E=new LSimpleE();
        E.adiprincipio(12640052, "Jhon", "Rojas ", "Limachi");
        E.adiprincipio(18768769, "Klever", "Colque ", "Paucara");
        E.adiprincipio(987989, "Gael", "Cruz", "Apaza");
        E.adiprincipio(12640053, "Jhojan", "Osco ", "Castaño");
        E.adiprincipio(12640054, "Gerson", "Mamani ", "Colmena");
        E.adiprincipio(12640055, "Arturo", "Espinoza", "Carita");
        E.mostrar();
        
        System.out.println("---------------------------");
        
        LDobleC C=new LDobleC();
        C.adiprincipio(12640052, "20/04/26", "Colas ", 18);
        C.adiprincipio(12640053, "30/02/26", "Pilas ", 65);
        C.adiprincipio(12640054, "04/04/25", "Pilas ", 89);
        C.adiprincipio(12640055, "20/03/25", "Listas", 12);
        C.mostrar();
        
        //eliminar a los studiatnes que n tienen asistencia en laboratorio
        System.out.println("--------------");
        solucion1(E,C);
        System.out.println("--------------");
        E.mostrar();
        System.out.println("--------------");
        solucion2(E,C,"Arturo");
        C.mostrar();
       
    }
    
    public static void solucion1(LSimpleE a, LDobleC b ){
        NodoE r = a.getP();
        while(r!=null){
            if(!verificar(b,r.getCi())){
                System.out.println("No existe: "+r.getNombre());
                if(r==a.getP()){
                    a.setP(r.getSig());
                    r=a.getP();
                }
                else{
                    NodoE r2=a.getP();
                    while(r2.getSig()!=r){
                        r2=r2.getSig();
                    }
                    r2.setSig(r.getSig());
                    r=r2.getSig();
                }
            }else{
                r=r.getSig();
            }
        }
    } 
    
    public static boolean verificar(LDobleC a, int c){
        NodoDC w = a.getP();
        while(w!=null){
            if(w.getCi()==c)
                return true;
            w=w.getSig();
        }
        return false;
    }
    
    public static void solucion2(LSimpleE a, LDobleC b, String x){
        NodoE r = a.getP();
        while(r!=null){
            if(r.getNombre().equalsIgnoreCase(x)){
                despuesP(b,r.getCi());
            }
            r = r.getSig();
        }
    }
    
    public static void despuesP(LDobleC b, int c){
    boolean sw = false;
    NodoDC r = b.getP();
    while(r != null && !sw){
        if(r.getCi() == c){
            sw = true;
            NodoDC nue = new NodoDC();
            nue.setCi(c);
            nue.setFecha("29/04/26");
            nue.setTema("Listas");
            nue.setNroFirmas(1);
            
            NodoDC z = r.getSig();
            
            nue.setSig(z);
            nue.setAnt(r);
            r.setSig(nue);
            
            if(z != null){
                z.setAnt(nue);
            }
        }
        r = r.getSig();
    }
}
}
