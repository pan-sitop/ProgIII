/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colasimp;

/**
 *
 * @author estudiante
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

    public void setNombre(String nom) {
        nombre=nom;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sex) {
        sexo=sex;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int ed) {
        edad=ed;
    }

    public int getEstatura() {
        return estatura;
    }

    public void setEstatura(int est) {
        estatura=est;
    }
    public void mostrar()
    {
        System.out.println(nombre+" "+sexo+" "+edad+" "+estatura);
    }
}
