/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conmalolor.copy;

import conmalolor.*;


public class Cliente extends Persona {
    
    private String telefono;
    
    public Cliente(String Nombre, String Apellido, String Cedula) {
        super(Nombre,Apellido,Cedula);
    }

    

    public Localizacion getLocalizacion() {
        return localizacion;
    }
    
    public void setLocation(String nuevoPais, String ciudadnueva, String provinciaNueva, String direccionNueva){
       localizacion = new Localizacion(direccionNueva,provinciaNueva,ciudadnueva,nuevoPais);
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    
}
