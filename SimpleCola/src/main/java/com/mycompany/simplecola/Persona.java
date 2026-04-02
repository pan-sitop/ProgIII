/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.simplecola;

/**
 *
 * @author Jhon Emison Rojas L
 */
public class Persona {
    private String nombre,sexo;
    private int edad, estatura;
    
    Persona(String a, String b, int c, int d)
    {
        nombre=a;
        sexo=b;
        edad=c;
        estatura=d;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getEstatura() {
        return estatura;
    }

    public void setEstatura(int estatura) {
        this.estatura = estatura;
    }
    public void mostrar()
    {
        System.out.println(nombre+" "+sexo+" "+edad+" "+estatura);
    }
    
}

