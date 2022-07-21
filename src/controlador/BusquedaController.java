/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import modelo.Alumno;
import vista.app;

/**
 *
 * @author eduar
 */
public class BusquedaController {
    public static int existAlumno(String numeroDeCuenta){
        int index = 0;
        for (Alumno alumno : app.alumnos) {
            if (alumno.getNumCuenta().equals(numeroDeCuenta)) {
                return index;
            }
            index++;
        }
        return -1;
    }
}
