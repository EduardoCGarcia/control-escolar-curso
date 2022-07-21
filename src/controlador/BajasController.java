/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import Utilerias.Archivos;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import modelo.Alumno;
import vista.app;

/**
 *
 * @author eduar
 */
public class BajasController {
    
    
    public static void preEliminar(int exist,JTextArea txtDatosAlumno){
        if ( exist != -1) {
            Alumno alu = app.alumnos.get(exist);
            String cad = String.format("Cuenta: %s\nNombre: %s\nEdad: %d\nCorreo: %s\nDirección: %s\n", alu.getNumCuenta(),alu.getNombre(),alu.getEdad(),alu.getCorreo(),alu.getDireccion());
            txtDatosAlumno.setText(cad);
        }else{
            JOptionPane.showMessageDialog(null, "El alumno no ha sido encontrado");
        }
    }
    
    public static void eliminarAlumno(int exist){
        if(JOptionPane.showConfirmDialog(app.m, "¿Segiuro que deseas eliminar al alumno?")== 0){
            app.alumnos.remove(exist);
            Archivos.guardarArchivo("alumnos.dat", app.alumnos); 
            
        }
    }
}
