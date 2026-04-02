package com.mycompany.clasevirtual;
/**
 *
 * @author Arturo
 */
public class Bus {
    private String placa;
    private int capacidad;
    private Conductor c;
    private Ruta r;
    private CCircularP p;
    public Bus(String a, int b, Conductor d, Ruta e, CCircularP f){
        placa=a;
        capacidad=b;
        c=d;
        r=e;
        p=f;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public Conductor getC() {
        return c;
    }

    public void setC(Conductor c) {
        this.c = c;
    }

    public Ruta getR() {
        return r;
    }

    public void setR(Ruta r) {
        this.r = r;
    }

    public CCircularP getP() {
        return p;
    }

    public void setP(CCircularP p) {
        this.p = p;
    }
    void mostrar(){
        System.out.println("BUS: "+placa+" "+capacidad);
        c.mostrar();
        r.mostrar();
        p.mostrar();
    }
}
