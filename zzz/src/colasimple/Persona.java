/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colasimple;

/**
 *
 * @author estudiante
 */
public class Persona {
    private String nombre,sexo;
    private int edad, estatura;
    
    Persona(String nom, String s, int e, int est)
    {
        nombre=nom;
        sexo=s;
        edad=e;
        estatura=est;
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
        System.out.println(nombre+" || "+sexo+" || "+edad+" || "+estatura+"cm");
    }
    
}

