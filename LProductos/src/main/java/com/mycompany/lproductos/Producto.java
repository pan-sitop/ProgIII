/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lproductos;

/**
 *
 * @author Jhon Emison Rojas L
 */
public class Producto {
    private  String nombre,presStock;
    private  int precio;
    
    public Producto(String a, String b, int c){
        nombre=a;
        presStock=b;
        precio=c;
    }
    
    void mostrar(){
        System.out.println(nombre+" "+precio+" Bs");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPresStock() {
        return presStock;
    }

    public void setPresStock(String presStock) {
        this.presStock = presStock;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    
    
}
