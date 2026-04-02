/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stack1;

/**
 *
 * @author estudiante
 */
public class Nota {
    private int ci;
    private String sigla;
    private int nota;

    // Constructor
    public Nota(int ci, String sigla, int nota) {
        this.ci = ci;
        this.sigla = sigla;
        this.nota = nota;
    }

    // Getters
    public int getCi() {
        return ci;
    }

    public String getSigla() {
        return sigla;
    }

    public int getNota() {
        return nota;
    }

    // Setters
    public void setCi(int ci) {
        this.ci = ci;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    // Método para mostrar la nota
    public void mostrar() {
        System.out.println("CI: " + ci + " | Sigla: " + sigla + " | Nota: " + nota);
    }
}