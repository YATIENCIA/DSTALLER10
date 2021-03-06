/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conmalolor.copy;

import conmalolor.*;
import java.util.ArrayList;
import java.util.List;




public class Empresa {
    
    public List<Cliente> clientes;
    public List<Employee> empleados;
    
    public Empresa(){
        clientes = new ArrayList<Cliente>();
        empleados = new ArrayList<Employee>();
    }
    
    
    
    public void GuardarCliente(String Nombre, String Apellido, String Cedula){
        validarInformacion(Nombre, Apellido, Cedula);
        Cliente cliente = new Cliente(Nombre, Apellido, Cedula);
        cliente.setLocation("Ecuador", "Guayaquil", "Guayas", "Alborada 3era etapa");
        this.clientes.add(cliente);
        System.out.println(Nombre +" " + Apellido + " ha sido agregado como nuevo cliente");
        
    }
    
    public void validarInformacion(String Nombre, String Apellido, String Cedula ){
        final boolean nameGood= Nombre.equals("") && Nombre.length()> 16;
        final boolean apellidoGood= Apellido.equals("") && Apellido.length()> 16;
        final boolean cedulaGood = !Cedula.equals("") && Cedula.length()< 10;
        
        
        if(nameGood){
            System.out.println("ingreso de nombre incorrecto");
        }else{
            System.out.println("ingreso de nombre correcto");
            
        }
        if(apellidoGood){
            System.out.println("ingreso de apellido incorrecto");
        }else{
            System.out.println("ingreso de apellido correcto");
            
        }
        if(cedulaGood){
            System.out.println("ingreso de cedula incorrecto");
        }else{
            System.out.println("ingreso de cedula correcto");
            
        }
        
    }
    
    public void mostrarTodo() {
        
        //Mostrar los clientes 
        for(Cliente cliente : this.clientes){
            System.out.println(cliente);;           
        }
        
        //Mostrar los empleados 
        for(Employee empleado : this.empleados){
            System.out.println(empleado);;           
        }
    }
    
    
}
