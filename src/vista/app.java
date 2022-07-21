/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import Utilerias.Archivos;
import java.util.ArrayList;
import modelo.Alumno;
import vista.ventanas.Main;

/**
 *
 * @author eduar
 */
public class app {
    public static ArrayList<Alumno> alumnos =  Archivos.leerArchivo("alumnos.dat");
    public static int indice = -1;
    
    public static Main m  =  new Main();
    public static void main(String[] args) {
        
        m.setVisible(true);
        m.setLocationRelativeTo(null);
    }
}
