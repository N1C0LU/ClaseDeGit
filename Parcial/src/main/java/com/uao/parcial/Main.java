/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.uao.parcial;

import Asignatura.Asignatura;
import Calificación.Calificacion;
import Curso.Curso;
import Estudiante.Estudiante;
import javax.swing.JOptionPane;

/**
 *
 * @author Nicolas Castaño
 */
public class Main {

        private Curso curso;

    public Main(Curso curso) {
        this.curso = curso;
    }

    public void mostrarInfo(Estudiante[] estudiantes, int n) {
        String texto = "Ordenados por definitiva \n\n";
        for (int i = 0; i < n; i++) {
            texto += estudiantes[i].toString() + "\n";
        }
        JOptionPane.showMessageDialog(null, texto);
    }

    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de estudiantes:"));
        Curso curso = new Curso(n);
        Main app = new Main(curso);

        for (int i = 0; i < n; i++) {
            String nombre = JOptionPane.showInputDialog("Nombre del estudiante: " + (i + 1) + ":");

            int codigo;
            do {
                codigo = Integer.parseInt(JOptionPane.showInputDialog("Código estudiante (mayor a 21000):"));
            } while (codigo <= 21000);

            double notaDesarrollo = Double.parseDouble(JOptionPane.showInputDialog("Nota Desarrollo:"));
            double notaMatematica = Double.parseDouble(JOptionPane.showInputDialog("Nota Matemática:"));

            Asignatura asignatura = new Asignatura(notaMatematica, notaDesarrollo);
            Calificacion calificacion = new Calificacion(asignatura);
            Estudiante estudiante = new Estudiante(nombre, codigo, asignatura, calificacion);

            curso.agregarEstudiantes(estudiante);
        }

        curso.ordenarDefinitiva();
        app.mostrarInfo(curso.getEstudiantes(), n);
    }
}
    

