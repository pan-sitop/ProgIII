/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej2stacks;

/**
 *
 * @author Arturo
 */
import java.util.Stack;

class Mueble {
    private int codigo;
    private String nombre;
    private String material;
    private String color;
    private double precio;

    public Mueble(int cod,String nom,String mat,String col,double pre) {
        codigo=cod;
        nombre=nom;
        material=mat;
        color=col;
        precio=pre;
    }

    public void mostrar() {
        System.out.println("Cod:"+codigo+" Nom:"+nombre+" Col:"+color+" Pre:"+precio);
    }

    public int getCodigo() {
        return codigo;
    }
    public String getNombre() {
        return nombre;
    }
    public String getColor() {
        return color;
    }
    public double getPrecio() {
        return precio;
    }
}
