/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conmalolor.copy;

public class Employee extends Persona implements BonusInterface
{
    private final float rmu = (float) 386.0;
    //salario del employee
    protected float salary;
    //porcentaje de bonus
    protected float bonusPercentage;

    //variable de tipo employeeType

    public Employee(float salary, float bonusPercentage)    
    {   
        this.salary = salary;        
        this.bonusPercentage = bonusPercentage;        
        this.Nombre = "Descconocido";
        this.Apellido = "Descconocido";
        this.Cedula = "0000000000";
        this.cambiarDireccion("Ecuador", "Gye", "Guayas", "ESPOL Prosperina");
    }
    
    
    public float calcularDecimo(float percent, int month)
    {
        float value = salary + (bonusPercentage * percent);
        return month%2==0?value:value + rmu/12*2;
    }
   
   
    public void cambiarDireccion(String nuevoPais, String ciudadnueva, String provinciaNueva, String direccionNueva){
        localizacion = new Localizacion(direccionNueva,provinciaNueva,ciudadnueva,nuevoPais);
    }

    @Override
    public float cs() {
       return this.cs();
    }

    @Override
    public float CalculateYearBonus() {
        return this.CalculateYearBonus();
    }
    @Override
    public String toString() {
        return "Empleado:"+
                "\nNombre: " + Nombre + 
                ", Apellido: " + Apellido + 
                ", con numero de cedula: " + Cedula+
               "\nDireccion: " + getLocalizacion().mostrarLocation()+
                "\n----------------------";
    }
}
