package Utilerias;

import java.util.ArrayList;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import modelo.Alumno;
import vista.app;

/**
 *
 * @author EduardoCGarcia
 */
public class GUITools {

    public static void panelIntoPanel(JPanel padre, JPanel hijo) {
        hijo.setBounds(0, 0, padre.getWidth(), padre.getHeight());//definir tamaño y posicion del hijo
        //hijo.setBackground(Color.red);
        padre.removeAll();
        padre.add(hijo);
        padre.revalidate();
        padre.repaint();
    }

    public static void panelIntoPanel(JPanel padre, JPanel hijo, int x, int y, int width, int height) {
        hijo.setBounds(x, y, width, height);//definir tamaño y posicion del hijo
        //hijo.setLocation(x, y);
        //hijo.setBackground(Color.red);
        //padre.removeAll();
        padre.add(hijo);
        padre.revalidate();
        padre.repaint();
    }
    
    public static DefaultTableModel setTable(){
        DefaultTableModel modelo =  setColumnsTable();
        
        for (Alumno a : app.alumnos) {
            String filas[]={
                String.format("%s",a.getNombre()),
                String.format("%d", a.getEdad()),
                String.format("%s", a.getNumCuenta()),
                String.format("%s", a.getCorreo()),
                String.format("%s", a.getDireccion())
                
            };
            modelo.addRow(filas);
        }
        return modelo;
    }
    
    public static DefaultTableModel setColumnsTable(){
        DefaultTableModel modelo =  new DefaultTableModel();
        /*Establecemos las columnas*/
        ArrayList<String> columnas = new ArrayList<String> ();
        columnas.add("Nombre");
        columnas.add("Edad");
        columnas.add("Numero de Cuenta");
        columnas.add("Correo");
        columnas.add("Dirección");
        
        for(Object col:columnas){
            modelo.addColumn(col);
        }
        return modelo;
    }
}
