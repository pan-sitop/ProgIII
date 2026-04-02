/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stack1;

/**
 *
 * @author estudiante
 */
import java.util.*;
public class StackObjetos {
    public static void main(String[] args) {
 
        
        Stack<Estudiante> estudiantes = new Stack<>();
        estudiantes.push(new Estudiante(111, "Jose"));
        estudiantes.push(new Estudiante(222, "LUCY"));
        estudiantes.push(new Estudiante(123, "Jamachi"));

        Stack<Nota> notas = new Stack<>();
        notas.push(new Nota(222, "INF-121", 70));
        notas.push(new Nota(123, "INF-111", 65));
        notas.push(new Nota(222, "INF-111", 46));
        notas.push(new Nota(111, "INF-131", 76));
        notas.push(new Nota(123, "INF-122", 45));

        mostrarAprobados(estudiantes, notas);
    }
    public static void mostrar(Stack<Materia> a) {
        Stack<Materia> aux=new Stack<Materia>();
        while(!a.empty()){
            Materia m=a.pop();
            m.mostrar();
            aux.push(m);
        }
        vaciar(aux,a);
    }
    public static void vaciar(Stack<Materia> z,Stack<Materia> w) {
        while(!z.empty()){
            w.push(z.pop());
        }
    }
    public static void ordenar(Stack<Materia> a) {
        Stack<Materia> r=new Stack<Materia>();
        Stack<Materia> aux=new Stack<Materia>();
        while(!a.empty()){
            Materia may=a.pop();
            while(!a.empty()){
                Materia m=a.pop();
                if((m.getSemestre()>may.getSemestre())){
                    aux.push(may);
                    may=m;
                }else
                    aux.push(m);
            }
                r.push(may);
                vaciar(aux,a);
            }
        vaciar(r,a);
        }
    
    public static void mostrarAprobados(Stack<Estudiante> estudiantes, Stack<Nota> notas) {
        Stack<Nota> auxNotas = new Stack<>();
        Stack<Estudiante> auxEstudiantes = new Stack<>();
        

        while (!notas.empty()) {
            Nota notaActual = notas.pop();
            auxNotas.push(notaActual);

            if (notaActual.getNota() >= 51) {
                String nombreAprobado = "Desconocido";
                
                while (!estudiantes.empty()) {
                    Estudiante est = estudiantes.pop();
                    auxEstudiantes.push(est);
                    if (est.getCi() == notaActual.getCi()) { 
                        nombreAprobado = est.getNombre();
                    }
                }
                
                while (!auxEstudiantes.empty()) {
                    estudiantes.push(auxEstudiantes.pop());
                }

                System.out.println(" " + notaActual.getSigla() + "   " + nombreAprobado + "   " + notaActual.getNota());
            }
        }
        
        while (!auxNotas.empty()) {
            notas.push(auxNotas.pop());
        }
    }
}
