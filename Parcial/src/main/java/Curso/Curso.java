/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Curso;

import Estudiante.Estudiante;

/**
 *
 * @author Nicolas Castaño
 */
public class Curso {
    private Estudiante[] estudiantes;
    private int cantidad;

    public Curso(int n) {
        estudiantes = new Estudiante[n];
        cantidad = 0;
    }

    public void agregarEstudiantes(Estudiante estudiante) {
        estudiantes[cantidad] = estudiante;
        cantidad++;
    }

    public Estudiante[] getEstudiantes() {
        return estudiantes;
    }

    public void ordenarDefinitiva() {
        for (int i = 0; i < cantidad - 1; i++) {
            for (int s = 0; s < cantidad - i - 1; s++) {
                if (estudiantes[s].obtenerDefinitiva() > estudiantes[s + 1].obtenerDefinitiva()) {
                    Estudiante position = estudiantes[s];
                    estudiantes[s] = estudiantes[s + 1];
                    estudiantes[s + 1] = position;
                }
            }
        }
    }
}

