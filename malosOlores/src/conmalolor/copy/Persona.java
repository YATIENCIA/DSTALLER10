/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conmalolor.copy;

/**
 *
 * @author Miguel Angel
 */
public class Persona {
    protected String Nombre;
    protected String Apellido;
    protected String Cedula;
    protected Localizacion localizacion;

    public Persona() {
    }

    
    
    public Persona(String Nombre, String Apellido, String Cedula) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Cedula = Cedula;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getCedula() {
        return Cedula;
    }

    public void setCedula(String Cedula) {
        this.Cedula = Cedula;
    }

    public Localizacion getLocalizacion() {
        return localizacion;
    }

    

    







}
