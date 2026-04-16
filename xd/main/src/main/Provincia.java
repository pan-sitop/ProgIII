/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author estudiante
 */
public class Provincia {
    private String nomProvincia, nomDpto;
    private int nroHab;
    
    Provincia(String b, String a, int c){      
        nomDpto=b;
        nomProvincia=a;
        nroHab=c;
    }

    public String getNomProvincia() {
        return nomProvincia;
    }

    public void setNomProvincia(String nomProvincia) {
        this.nomProvincia = nomProvincia;
    }

    public String getNomDpto() {
        return nomDpto;
    }

    public void setNomDpto(String nomDpto) {
        this.nomDpto = nomDpto;
    }

    public int getNroHab() {
        return nroHab;
    }

    public void setNroHab(int nroHab) {
        this.nroHab = nroHab;
    }
    void mostrar(){        
        System.out.println("[" +nomDpto+ " - " + nomProvincia + " - " + nroHab + "]");
    }
}
