/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2;

/**
 *
 * @author Arturo
 */
public class Calzado {
    private int nro;
    private String color;
    private String material;
    private String tipo;
    public Calzado(int nro, String color, String material, String tipo) {
        this.nro = nro;
        this.color = color;
        this.material = material;
        this.tipo = tipo;
    }
    public int getNro(){ 
        return nro;
    }
    public String getColor(){ 
        return color; 
    }
    public String getTipo(){ 
        return tipo; 
    }
    public void mostrar(){
        System.out.println(nro + " " + color + " " + material + " " + tipo);
    }
}
