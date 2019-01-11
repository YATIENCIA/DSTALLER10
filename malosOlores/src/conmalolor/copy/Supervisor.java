/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conmalolor.copy;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

/**
 *
 * @author IYAC
 */
public class Supervisor extends Employee{

    public Supervisor(float salary, float bonusPercentage) {
        super(salary, bonusPercentage);
    }
    
    @Override
    public float cs()
    {
        Date date = new Date();
        //Obtiene la hora local
        LocalDate localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        //Obtiene el mes en forma de entero
        int month = localDate.getMonthValue();
        return calcularDecimo(0.5F, month);
    }
    
    @Override
    public float CalculateYearBonus() 
    {
        return salary + salary * 0.7F;
    }

}
