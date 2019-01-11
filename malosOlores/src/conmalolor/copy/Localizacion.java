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
public class Localizacion {

    String direccion;
    String provincia;
    String ciudad;
    String pais;

    public Localizacion() {
    }

    
    
    public Localizacion(String direccion, String provincia, String ciudad, String pais) {
        this.direccion = direccion;
        this.provincia = provincia;
        this.ciudad = ciudad;
        this.pais = pais;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
    
    public String mostrarLocation(){
        String dir = pais + " - " + provincia + " - " + ciudad;
        return  dir+ "\n" + direccion;
    }
    
    
    
    
    
}
