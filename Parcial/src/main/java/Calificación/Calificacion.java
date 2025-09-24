/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Calificación;

import Asignatura.Asignatura;

/**
 *
 * @author Nicolas Castaño
 */
public class Calificacion {
     private Asignatura asignatura;

    public Calificacion(Asignatura asignatura) {
        this.asignatura = asignatura;
    }

    public double notaDefinitiva() {
        return (asignatura.getNotaDesarrollo() * 0.55) + (asignatura.getNotaMatematica() * 0.45);
    }

    public boolean aprobacion(double notaDefinitiva) {
        return notaDefinitiva >= 3.5;
    }
}

