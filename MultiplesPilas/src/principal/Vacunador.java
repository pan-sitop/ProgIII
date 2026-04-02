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
public class Vacunador {
    private String nombre, fecha;
    Vacunador(String n, String f){
        nombre=n;
        fecha=f;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    void mostrar(){
        System.out.println("Vacunador: "+nombre+" "+fecha);
    }
}
