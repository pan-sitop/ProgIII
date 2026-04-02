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

public class Persona {
    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() { 
        return nombre; 
    }
    public int getEdad() { 
        return edad; 
    }

    public void mostrar() {
        System.out.println(nombre + " || " + edad);
    }
}