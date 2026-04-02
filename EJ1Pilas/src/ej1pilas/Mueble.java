/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej1pilas;

/**
 *
 * @author Arturo
 */
import java.util.Scanner;

public class Mueble {
    private int codigo;
    private String nombre;
    private String material;
    private String color;

    public Mueble(int cod,String nom,String mat,String col) {
        codigo=cod;
        nombre=nom;
        material=mat;
        color=col;
    }

    public Mueble() {}

    public void leer() {
        Scanner sc=new Scanner(System.in);
        codigo=sc.nextInt();
        nombre=sc.next();
        material=sc.next();
        color=sc.next();
    }

    public void mostrar() {
        System.out.println("Codigo:"+codigo+" Nombre:"+nombre+" Material:"+material+" Color:"+color);
    }

    public String getNombre() {return nombre;}
    public String getMaterial() {return material;}
    public String getColor() {return color;}
}