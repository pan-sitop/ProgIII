/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.stackestudiantes;

/**
 *
 * @author Jhon Emison Rojas L
 */
import java.util.*;
public class StackEstudiantes {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Stack<Materia> A = new Stack<Materia>();
        A.push(new Materia("INF-131", "PROGRAMACION III", 3));
        A.push(new Materia("INF-111", "PROGRAMACION I", 1));
        A.push(new Materia("INF-121", "PROGRAMACION II", 2));
        A.push(new Materia("INF-122", "FISICA", 2));
        mostrar(A);
        System.out.println("-------------------------------------");
        System.out.println("Ordenar las materias por semestre");
        ordenar(A);
        mostrar(A);
        //4.crear un stack de estudiante(ci,nombre), otro stack de las notas en las materias(ci,sigla,nota);
        //Mostrar el nombre de estudiantes aprobados en cada materia
        Stack<Estudiante> B = new Stack<Estudiante>();
        B.push(new Estudiante(111,"Juan"));
        B.push(new Estudiante(222,"Maria"));
        B.push(new Estudiante(123,"Ana"));
        Stack<Nota> C = new Stack<Nota>();
        C.push(new Nota(222,"INF-121",70));
        C.push(new Nota(123,"INF-111",35));
        C.push(new Nota(222,"INF-111",56));
        C.push(new Nota(111,"INF-131",76));
        C.push(new Nota(123,"INF-122",45));
        C.push(new Nota(222,"INF-131",34));
        C.push(new Nota(111,"INF-111",60));
        mostrarAprob(A,B,C);
    }
    
    public static void mostrar(Stack<Materia> a){
        Stack<Materia> aux=new Stack<Materia>();
        while(!a.empty()){
            Materia m=a.pop();
            m.mostrar();
            aux.push(m);
        }
        vaciar(aux,a);
        
    }
    
    public static void ordenar(Stack<Materia> a){
        Stack<Materia> r=new Stack<Materia>();
        Stack<Materia> aux=new Stack<Materia>();
        
        Materia may=a.pop();
        while (!a.empty()){
            Materia m=a.pop();
            if(m.getSemestre()>may.getSemestre()){
                aux.push(may);
                may=m;
            }else
                aux.push(m);
        }
        r.push(may);
        vaciar(aux,a);
    
    
    }
    
    public static void mostrarAprob(Stack<Materia> m,Stack<Estudiante> e,Stack<Nota> n) {
        Stack<Materia> auxm = new Stack<Materia>();
        Stack<Estudiante> auxe = new Stack<Estudiante>();
        Stack<Nota> auxn = new Stack<Nota>();
        while (!m.empty()) {
            Materia mx = m.pop();
            System.out.println("Aprobados de: "+mx.getNombre());
            while (!n.empty()) {
                Nota nx=n.pop();
                if(nx.getMateria().equals(mx.getSigla())){
                    while (!e.empty()) {
                        Estudiante ex=e.pop();
                        if((ex.getCi()==nx.getCi()) && (nx.getNota()>=51)){
                            System.out.println(ex.getNombre());
                        }
                        auxe.push(ex);
                    }
                }
                auxn.push(nx);
                vaciar(auxe,e);
            }
            auxm.push(mx);
            vaciar(auxn,n);
        }
    }
    
    public static void vaciar(Stack z, Stack w)
     {
         while(!z.empty())
             w.push(z.pop());
     }
}
