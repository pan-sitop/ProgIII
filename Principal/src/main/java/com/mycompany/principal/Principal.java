package com.mycompany.principal;
//Estudiante: Arturo Espinoza
public class Principal {

    public static void main(String[] args) {
        LSimpleE A=new LSimpleE();
        A.adiprincipio(12640052,"Jhon","Rojas","Limachi");
        A.adiprincipio(18768769,"Klever","Colque","Paucara");
        A.adiprincipio(987989,"Gael","Cruz","Apaza");
        A.adiprincipio(12640053,"Jhojan","Osco","Castaño");
        A.adiprincipio(12640054,"Gerson","Mamani","Colmena");
        A.adiprincipio(12640055,"Arturo","Espinoza","Carita");
        
        System.out.println("--- LISTA DE ESTUDIANTES ---");
        A.mostrar();

        LDobleC B=new LDobleC();
        B.adiprincipio(12640052,"20/04/26","Colas",18);
        B.adiprincipio(12640053,"30/02/26","Pilas",65);
        B.adiprincipio(12640054,"04/04/25","Pilas",89);
        B.adiprincipio(12640055,"20/03/25","Listas",12);
        
        System.out.println("--- CONTROL DE ASISTENCIA ---");
        B.mostrar();
        
        System.out.println("--- EJERCICIOS ---");
        System.out.println("--- D) ELIMINAR ASISTENCIAS ---");
        solucionD(A,B,"Jhon");
        B.mostrar();
        System.out.println();

        System.out.println("--- E) ELIMINAR ESTUDIANTES Y ASISTENCIAS CON < 5 ASISTENCIAS ---");
        solucionE(A,B);
        A.mostrar();
        B.mostrar();
        System.out.println();

        System.out.println("--- F) INSERTAR ORDENADO POR APELLIDO PATERNO Y AÑADIR K ASISTENCIAS ---");
        solucionF(A,B,111222,"Ana","Alvarez","Gomez",3);
        A.mostrar();
        B.mostrar();
        System.out.println();

        System.out.println("--- G) ELIMINAR I-ESIMO ESTUDIANTE Y SUS ASISTENCIAS ---");
        solucionG(A,B,2);
        A.mostrar();
        B.mostrar();
        System.out.println();

        System.out.println("--- H) ORDENAR ASISTENCIAS POR NRO DE FIRMAS ---");
        solucionH(B);
        B.mostrar();
        System.out.println();
    }

    public static void eliminarAsistenciasCI(LDobleC b, int ci) {
        NodoDC r=b.getP();
        while(r!=null){
            NodoDC auxSig=r.getSig();
            if(r.getCi()==ci){
                if(r==b.getP()){
                    b.setP(r.getSig());
                    if(b.getP()!=null){
                        b.getP().setAnt(null);
                    }
                }else{
                    NodoDC ant=r.getAnt();
                    NodoDC sig=r.getSig();
                    ant.setSig(sig);
                    if(sig!=null){
                        sig.setAnt(ant);
                    }
                }
            }
            r=auxSig;
        }
    }

    public static void solucionD(LSimpleE a, LDobleC b, String x) {
        NodoE r=a.getP();
        while(r!=null){
            if(r.getNombre().equalsIgnoreCase(x)){
                eliminarAsistenciasCI(b,r.getCi());
            }
            r=r.getSig();
        }
    }

    public static void solucionE(LSimpleE a, LDobleC b) {
        NodoE r=a.getP();
        NodoE antE=null;
        
        while(r!=null){
            int cont=0;
            NodoDC w=b.getP();
            
            while(w!=null){
                if(w.getCi()==r.getCi()){
                    cont++;
                }
                w=w.getSig();
            }

            if(cont<5){
                eliminarAsistenciasCI(b,r.getCi());
                
                if(r==a.getP()){
                    a.setP(r.getSig());
                    r=a.getP();
                }else{
                    antE.setSig(r.getSig());
                    r=r.getSig();
                }
            }else{
                antE=r;
                r=r.getSig();
            }
        }
    }

    public static void solucionF(LSimpleE a, LDobleC b, int ci, String nom, String pat, String mat, int k) {
        NodoE nue=new NodoE();
        nue.setCi(ci);
        nue.setNombre(nom);
        nue.setPaterno(pat);
        nue.setMaterno(mat);

        if(a.esVacia()||pat.compareToIgnoreCase(a.getP().getPaterno())<0){
            nue.setSig(a.getP());
            a.setP(nue);
        }else{
            NodoE r=a.getP();
            while(r.getSig()!=null&&pat.compareToIgnoreCase(r.getSig().getPaterno())>=0){
                r=r.getSig();
            }
            nue.setSig(r.getSig());
            r.setSig(nue);
        }

        int j=1;
        while(j<=k){
            b.adifinal(ci,"06/05/26","Tema Extra "+j,1);
            j++;
        }
    }

    public static void solucionG(LSimpleE a, LDobleC b, int i) {
        if(a.esVacia()) return;
        
        NodoE r=a.getP();
        NodoE antE=null;
        int pos=1;
        
        while(r!=null&&pos<i){
            antE=r;
            r=r.getSig();
            pos++;
        }
        
        if(r!=null){
            eliminarAsistenciasCI(b,r.getCi());
            
            if(r==a.getP()){
                a.setP(r.getSig());
            }else{
                antE.setSig(r.getSig());
            }
        }
    }

    public static void solucionH(LDobleC b) {
        if(b.esVacia()) return;
        boolean movio=true;
        
        while(movio){
            movio=false;
            NodoDC r=b.getP();
            while(r.getSig()!=null){
                if(r.getNroFirmas()>r.getSig().getNroFirmas()){
                    int tempCi=r.getCi();
                    int tempFirmas=r.getNroFirmas();
                    String tempF=r.getFecha();
                    String tempT=r.getTema();

                    r.setCi(r.getSig().getCi());
                    r.setNroFirmas(r.getSig().getNroFirmas());
                    r.setFecha(r.getSig().getFecha());
                    r.setTema(r.getSig().getTema());

                    r.getSig().setCi(tempCi);
                    r.getSig().setNroFirmas(tempFirmas);
                    r.getSig().setFecha(tempF);
                    r.getSig().setTema(tempT);

                    movio=true;
                }
                r=r.getSig();
            }
        }
    }
}