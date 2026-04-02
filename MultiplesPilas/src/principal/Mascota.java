/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

/**
 *
 * @author estudiante
 */
public class Mascota {
    private String especie,nombre,raza;
    private int edad;

    public Mascota(String a, String b,String c, int e){
        especie=a;
        nombre=b;
        raza=c;
        edad=e;
    }
    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    void mostrar(){
        System.out.println("Mascota: "+especie+" "+nombre+" "+raza);
    }
}
