/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pilaob;

/**
 *
 * @author estudiante
 */
public class PilaOb {

    public static void main(String[] args) {
        PilaOb pilaEmpleados = new PilaOb();

        PaisOb.adicionar(new Pais(105, "Juan", "Gerente", 10000, 2018));
        PaisOb.adicionar(new Pais(102, "Ana", "Cajero", 4000, 2022));
        PaisOb.adicionar(new Pais(108, "Luis", "Cajero", 4000, 2015));
        PaisOb.adicionar(new Pais(101, "Marta", "Sistemas", 6000, 2023));

        System.out.println("--- PILA ORIGINAL ---");
        pilaEmpleados.mostrar();

        System.out.println("\n--- a) Subir sueldo a > 5 años ---");
        subirSueldo(pilaEmpleados, 2026);
        pilaEmpleados.mostrar();

        System.out.println("\n--- b) Reducir sueldo a cajeros ---");
        reducirSueldoCargo(pilaEmpleados, "Cajero");
        pilaEmpleados.mostrar();

        System.out.println("\n--- c) Eliminar empleado con ID 108 ---");
        eliminarId(pilaEmpleados, 108);
        pilaEmpleados.mostrar();

        System.out.println("\n--- d) Ordenar por ID ascendente ---");
        ordenarAscendente(pilaEmpleados);
        pilaEmpleados.mostrar();
    }

    public static void subirSueldo(PilaE P, int anioActual) {
        PilaOb aux = new PilaE();
        while (!P.esVacia()) {
            Empleado elem = P.eliminar();
            if ((anioActual - elem.getAnioEntrada()) > 5) {
                elem.setSueldo(elem.getSueldo() * 1.5);
            }
            aux.adicionar(elem);
        }
        P.vaciar(aux);
    }

    public static void reducirSueldoCargo(PilaE P, String cargoX) {
        PilaE aux = new PilaE();
        while (!P.esVacia()) {
            Empleado elem = P.eliminar();
            if (elem.getCargo().equals(cargoX)) {
                elem.setSueldo(elem.getSueldo() / 2);
            }
            aux.adicionar(elem);
        }
        P.vaciar(aux);
    }

    public static void eliminarId(PilaE P, int idX) {
        PilaE aux = new PilaE();
        while (!P.esVacia()) {
            Empleado elem = P.eliminar();
            if (elem.getId() != idX) {
                aux.adicionar(elem);
            }
        }
        P.vaciar(aux);
    }

    public static void ordenarAscendente(PilaE P) {
        PilaE aux = new PilaE();
        
        while (!P.esVacia()) {
            Empleado sujeto = P.eliminar();
            boolean sw = false;
            
            while (!aux.esVacia() && sw == false) {
                Empleado topeAux = aux.eliminar();
                if (topeAux.getId() > sujeto.getId()) {
                    P.adicionar(topeAux);
                } else {
                    aux.adicionar(topeAux);
                    sw = true;
                }
            }
            aux.adicionar(sujeto);
        }
        P.vaciar(aux);
    }
}
