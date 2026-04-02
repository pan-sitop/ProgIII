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
public class Venta {
    private int codigo,cantidad;
    private String fecha;
    
    Venta(int a, String b, int c)
    {
        codigo=a;
        fecha=b;
        cantidad=c;
        
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    public void mostrar()
    {
        System.out.println("["+codigo+" "+fecha+" "+cantidad+"] ");
    }
    
}
