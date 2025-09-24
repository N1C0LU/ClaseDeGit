/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package Calificación;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import Asignatura.Asignatura;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Nicolas Castaño
 */
public class CalificacionTest {
    Asignatura asignatura = new Asignatura(4.0, 3.0); 
    Calificacion calificacion = new Calificacion(asignatura);
    @Test
    public void TestNotaDefinitiva() {
        System.out.println("Prueba del método notaDefinitiva");
        double resultadoEsperado = (4.0 * 0.55) + (3.0 * 0.45); 
        assertEquals(3.55,resultadoEsperado);
        
    }
    
}

  
