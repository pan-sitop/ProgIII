package com.mycompany.clasevirtual;
/*Estudiante: Arturo Saul Espinoza Carita */
/**
 *
 * @author Arturo
 */
public class ClaseVirtual {

    public static void main(String[] args) {
        CCircularP p1=new CCircularP ();
        p1.adicionar(new Pasajero(111,"Daniel","Docente"));
        p1.adicionar(new Pasajero(112,"Jhon","Docente"));
        p1.adicionar(new Pasajero(113,"Arturo","Estudiante"));
        p1.adicionar(new Pasajero(114,"Ronald","Estudiante"));
        p1.adicionar(new Pasajero(115,"Cristhian","Administrativo"));    
        
        CCircularP p2=new CCircularP ();
        p2.adicionar(new Pasajero(121,"Pepito","Estudiante"));
        p2.adicionar(new Pasajero(112,"Marco","Estudiante"));
        p2.adicionar(new Pasajero(113,"Sergio","Estudiante"));
        p2.adicionar(new Pasajero(114,"Dan","Estudiante"));
        p2.adicionar(new Pasajero(115,"Ivan","Estudiante")); 
        
        CCircularB A=new CCircularB();
        Conductor c1=new Conductor("Rod", 999, "C");
        Ruta r1=new Ruta("Monoblock","Ceja","18:00");        
        A.adicionar(new Bus("ABC123", 10,c1,r1,p1 ));
        A.adicionar(new Bus("XYZ867", 20, new Conductor("Pepito",777,"A"), new Ruta("Mallasa", "Miraflores", "20:00"), p2));
        A.mostrar();
        solucion1(A);
        System.out.println("---- se encuentra x ----");
        solucion2(A, "Arturo");
        solucion2(A, "Ivan");      
        System.out.println("---- nombre iguales ----");
        solucion3(A);
    }

    public static void solucion1(CCircularB a) {
        int n=a.nroelem();
        for (int i=1; i<=n; i++){
            Bus bx=a.eliminar();
            System.out.println("Bus: "+bx.getPlaca());
            contar(bx.getP());
            a.adicionar(bx);
        }
    }
    public static void contar(CCircularP z){
        int ce=0;
        int cd=0;
        int ca=0;
        CCircularP aux=new CCircularP();
        while(!z.esvacia()){
            Pasajero px=z.eliminar();
            if (px.getTipo().equals("Estudiante")){
                ce++;
            }
            if (px.getTipo().equals("Administrativo")){
                ca++;
            }
            if (px.getTipo().equals("Docente")){
                cd++;
            }
            aux.adicionar(px);
        }
        z.vaciar(aux);
        System.out.println("Estudiantes: "+ce);
        System.out.println("Administrativo: "+ca);
        System.out.println("Docente: "+cd);       
    }
    public static void solucion2(CCircularB a, String x){
        int n=a.nroelem();
        for (int i=1; i<=n; i++){
            Bus bx=a.eliminar();
            CCircularP aux=new CCircularP();
            CCircularP z = bx.getP();
            boolean sw=false;
            while(!z.esvacia()){
                Pasajero px=z.eliminar();
                if (px.getNombre().equals(x)){
                    sw=true;
                }              
                aux.adicionar(px);
            }
            z.vaciar(aux);
            if(sw){
                System.out.println("Bus: "+bx.getPlaca());
            }
            a.adicionar(bx);
        }
    }
    public static void solucion3(CCircularB a){
        int n=a.nroelem();
        for(int i=1;i<=n;i++){
            Bus bx=a.eliminar();
            CCircularP z=bx.getP();
            CCircularP aux=new CCircularP();
            boolean sw=false;
            while(!z.esvacia()){
                Pasajero px=z.eliminar();
                if(bx.getC().getNombre().equals(px.getNombre())){
                    sw=true;
                }
                aux.adicionar(px);
            }
            z.vaciar(aux);
            if(sw){
                System.out.println("existe");
            }
            a.adicionar(bx);
        }
    }  
}
