/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import Utilerias.Archivos;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import modelo.Alumno;
import vista.app;

/**
 *
 * @author eduar
 */
public class CambiarController {
    static Alumno alu;
    public static void preCambioLlenado(int exist, JTextField txtNombre, JSpinner spnEdad, JTextField txtNumeroDeCuenta, JTextField txtCorreo, JTextField txtCalle, JTextField txtCodigoPostal, JTextField txtNumero) {
        if (exist!=-1) {
            alu = app.alumnos.get(exist);
            txtNombre.setText(alu.getNombre());
            spnEdad.setValue(alu.getEdad());
            txtNumeroDeCuenta.setText(alu.getNumCuenta());
            txtCorreo.setText(alu.getCorreo());
            txtCalle.setText(alu.getDireccion().getCalle());
            txtCodigoPostal.setText(alu.getDireccion().getCp());
            txtNumero.setText(String.format("%S", alu.getDireccion().getNumero()));
        } else {
            JOptionPane.showMessageDialog(null, "No se ha encotrado a un alumno");
        }
            
    }
    public static void preCambioBorrado(JTextField txtNombre, JSpinner spnEdad, JTextField txtNumeroDeCuenta, JTextField txtCorreo, JTextField txtCalle, JTextField txtCodigoPostal, JTextField txtNumero) {

        txtNombre.setText("");
        spnEdad.setValue(0);
        txtNumeroDeCuenta.setText("");
        txtCorreo.setText("");
        txtCalle.setText("");
        txtCodigoPostal.setText("");
        txtNumero.setText("");
    }
    
    public static void cambiarDato(int indice,Alumno alumnoNuevo){
        if(JOptionPane.showConfirmDialog(app.m, "¿Segiuro que deseas eliminar al alumno?")== 0){
            app.alumnos.set(indice, alumnoNuevo);
            Archivos.guardarArchivo("alumnos.dat", app.alumnos);
            JOptionPane.showMessageDialog(null, "Se han actualizado los datos del alumno");
        }
    }
}
