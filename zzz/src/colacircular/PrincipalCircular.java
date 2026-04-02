/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colacircular;
/**
 *
 * @author estudiante
 */

// 

public class PrincipalCircular {

    public static void main(String[] args) {
        ColaCircularP Q = new ColaCircularP();
        Q.adicionar(new Persona("Pepe", 18));
        Q.adicionar(new Persona("Ana", 15));
        Q.adicionar(new Persona("Lucy", 11));
        Q.adicionar(new Persona("Maria", 9));
        Q.adicionar(new Persona("Jorge", 19));

        System.out.println("--- Cola Original ---");
        Q.mostrar();
 // mostrar el iesimo adelante 
 // ordenar por edades
        System.out.println("//ORDENAR");
        ordena(Q);
        Q.mostrar();
        
        System.out.println("Mover el 3er elemento adelante:");
        moverIesimoAdelante(Q, 3);
        System.out.println("Cola resultante:");
        Q.mostrar();

        System.out.println("Ordenar por edades:");
        ordenarPorEdad(Q);
        Q.mostrar();
    }

    public static void ordena(ColaCircularP q) {
        ColaCircularP r = new ColaCircularP();
        while (!q.esvacia()) {
            Persona may = q.eliminar();
            int n = q.nroelem();
            for (int i = 1; i <= n; i++) {
                Persona x = q.eliminar();
                if (x.getEdad() > may.getEdad()) {
                    q.adicionar(may);
                    may = x;
                } else {
                    q.adicionar(x);
                }
            }
            r.adicionar(may);
        }
        q.vaciar(r);
    }
    
    public static void moverIesimoAdelante(ColaCircularP q, int i) {
        int n = q.nroelem();
        if (i > 0 && i <= n) {
            ColaCircularP aux = new ColaCircularP();
            Persona iesimo = null;
            for (int k = 1; k <= n; k++) {
                Persona x = q.eliminar();
                if (k == i) {
                    iesimo = x;
                } else {
                    aux.adicionar(x);
                }
            }
            if (iesimo != null) {
                System.out.println("Elemento en la posición " + i + " encontrado:");
                iesimo.mostrar();
                q.adicionar(iesimo);
            }
            q.vaciar(aux);
        } else {
            System.out.println("La posición ingresada es inválida.");
        }
    }
    
    public static void ordenarPorEdad(ColaCircularP q) {
        ColaCircularP r = new ColaCircularP();
        while (!q.esvacia()) {
            Persona may = q.eliminar();
            int n = q.nroelem();
            for (int j = 1; j <= n; j++) {
                Persona x = q.eliminar();
                if (x.getEdad() > may.getEdad()) {
                    q.adicionar(may);
                    may = x;
                } else {
                    q.adicionar(x);
                }
            }
            r.adicionar(may);
        }
        q.vaciar(r);
    }
}