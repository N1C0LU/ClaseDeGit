/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Asignatura;

/**
 *
 * @author Nicolas Castaño
 */
public class Asignatura {
    private double notaMatematica;
    private double notaDesarrollo;

    public Asignatura(double notaMatematica, double notaDesarrollo) {
        this.notaMatematica = notaMatematica;
        this.notaDesarrollo = notaDesarrollo;
    }

    public double getNotaMatematica() {
        return notaMatematica;
    }

    public void setNotaMatematica(double notaMatematica) {
        this.notaMatematica = notaMatematica;
    }

    public double getNotaDesarrollo() {
        return notaDesarrollo;
    }

    public void setNotaDesarrollo(double notaDesarrollo) {
        this.notaDesarrollo = notaDesarrollo;
    }
}


