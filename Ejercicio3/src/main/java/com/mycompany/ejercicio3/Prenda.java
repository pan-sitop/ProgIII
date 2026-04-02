/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio3;

/**
 *
 * @author Arturo
 */
public class Prenda {
    private String nombre,material,color;
    private int codigo,stock,precio;
    
    Prenda(String a, String b, String c, int d, int e, int f)
    {
        nombre=a;
        material=b;
        color=c;
        codigo=d;
        stock=e;
        precio=f;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    public void mostrar()
    {
        System.out.println("<"+codigo+" "+nombre+" "+material+" "+ color+" "+stock+" "+precio+"> ");
    }
    
}
