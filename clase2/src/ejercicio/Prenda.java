/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio;

/**
 *
 * @author estudiante
 */
public class Prenda {
    private String nombre, material, color;
    private int codigo, stock, precio;
    
    public Prenda(String nombre,String material,String color,int codigo,int stock,int precio){
        this.nombre=nombre;
        this.material=material;
        this.color=color;
        this.codigo=codigo;
        this.stock=stock;
        this.precio=precio;
    }
    public void mostrar(){
        System.out.println(nombre+" || "+material+" || "+ color+ " || "+ codigo+" || "+stock+" || "+precio);
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
}
