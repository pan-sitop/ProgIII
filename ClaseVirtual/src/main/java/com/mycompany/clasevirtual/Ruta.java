package com.mycompany.clasevirtual;
/**
 *
 * @author Arturo
 */
public class Ruta {
    private String origen,destino,horaS;
    public Ruta(String a, String b, String c){
        origen=a;
        destino=b;
        horaS=c;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getHoraS() {
        return horaS;
    }

    public void setHoraS(String horaS) {
        this.horaS = horaS;
    }
    void mostrar(){
        System.out.println("Ruta: "+origen+" "+destino+" "+horaS);
    }
}
