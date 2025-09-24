/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Estudiante;

import Asignatura.Asignatura;
import Calificación.Calificacion;

/**
 *
 * @author Nicolas Castaño
 */
public class Estudiante {
    private String nombre;
    private int codigo;
    private Asignatura asignatura;
    private Calificacion calificacion;

    public Estudiante(String nombre, int codigo, Asignatura asignatura, Calificacion calificacion) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.asignatura = asignatura;
        this.calificacion = calificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Asignatura getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(Asignatura asignatura) {
        this.asignatura = asignatura;
    }

    public Calificacion getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(Calificacion calificacion) {
        this.calificacion = calificacion;
    }

    public double obtenerDefinitiva() {
        return calificacion.notaDefinitiva();
    }

   public String toString() {
    double definitiva = obtenerDefinitiva();
    double definitivaTrunc = ((int)(definitiva * 100)) / 100.0;

    String estado = calificacion.aprobacion(definitiva) ? "SI APRUEBA" : "NO APRUEBA";

    return "Nombre: " + nombre
         + " | Código: " + codigo
         + " | Desarrollo: " + asignatura.getNotaDesarrollo()
         + " | Matemática: " + asignatura.getNotaMatematica()
         + " | Definitiva: " + definitivaTrunc
         + " | " + estado;
}
}

