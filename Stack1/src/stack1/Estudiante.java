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


public class Estudiante {
    private int ci;
    private String nombre;

    // Constructor
    public Estudiante(int ci, String nombre) {
        this.ci = ci;
        this.nombre = nombre;
    }

    // Getters
    public int getCi() {
        return ci;
    }

    public String getNombre() {
        return nombre;
    }

    // Setters (opcionales, por si necesitas modificar datos después)
    public void setCi(int ci) {
        this.ci = ci;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Método para mostrar los datos del estudiante (útil para depurar)
    public void mostrar() {
        System.out.println("CI: " + ci + " | Nombre: " + nombre);
    }
}