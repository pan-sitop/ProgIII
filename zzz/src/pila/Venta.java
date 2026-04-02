package pila;
/**
 *
 * @author Arturo
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
