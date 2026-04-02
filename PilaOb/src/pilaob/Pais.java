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
public class Pais {
    private int id;
    private String nombre;
    private String cargo;
    private double sueldo;
    private int anioEntrada;

    public Pais(int id, String nombre, String cargo, double sueldo, int anioEntrada) {
        this.id = id;
        this.nombre = nombre;
        this.cargo = cargo;
        this.sueldo = sueldo;
        this.anioEntrada = anioEntrada;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public int getAnioEntrada() {
        return anioEntrada;
    }

    public void setAnioEntrada(int anioEntrada) {
        this.anioEntrada = anioEntrada;
    }

    public void mostrar() {
        System.out.println("[" + id + " - " + nombre + " - " + cargo + " - Bs." + sueldo + " - " + anioEntrada + "]");
    }
}