/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import Utilerias.Archivos;
import javax.swing.JOptionPane;
import modelo.Alumno;
import vista.app;

/**
 *
 * @author eduar
 */
public class AltasController {
    public static Alumno a;
    
    public static void altaAlumno(){
        app.alumnos.add(a);
        Archivos.guardarArchivo("alumnos.dat", app.alumnos);
        JOptionPane.showMessageDialog(null, "***Alumno guardado***");
    }
    
    
}
