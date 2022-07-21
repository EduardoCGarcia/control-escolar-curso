/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;

/**
 *
 * @author Gonzalo CH
 */
public class Alumno implements Serializable{

    private String nombre;
    private int edad;
    private String numCuenta;
    private String correo;
    private Direccion direccion;

    public Alumno() {
    }
    
    public Alumno(String nombre, int edad, String numCuenta, String correo, Direccion direccion) throws Exception {
        this.setNombre(nombre);
        this.edad = edad;
        this.numCuenta = numCuenta;
        this.setCorreo(correo);
        this.direccion = direccion;
    }
    
    public Alumno(String nombre, int edad, String numCuenta, String correo) throws Exception {
        this.setNombre(nombre);
        this.edad = edad;
        this.numCuenta = numCuenta;
        this.setCorreo(correo);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) throws Exception {
        if(nombre.isBlank() || nombre.isEmpty()){
            Exception e = new Exception("El nombre no ha sido escrito");
            throw e;
        }
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(String numCuenta) {
        this.numCuenta = numCuenta;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) throws Exception {
        if(!correo.matches("[a-z0-9+_.-]+@(alumno.uaemex.mx|profesor.uaemex.mx|admin.uaemex.mx)$")){
            Exception e = new Exception("El correo no es valido");
            throw e;
        }
        this.correo = correo;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return String.format("Nombre: %s\nEdad: %d\nNo.Cuenta: %s\nCorreo: %s\n%s", nombre, edad, numCuenta, correo, direccion.toString());
    }

}
