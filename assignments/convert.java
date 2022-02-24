/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignments;
/**
 *
 * @author Qibran Idza Lafandzi(123200141)
 */
public class convert {
    double temperature, reamur, fahrenheit, kelvin;
    
    convert(){
        this.temperature  = temperature;
}
   
    void conversion(){
    //formula of temperature    
    reamur = (4 * temperature)/5;
    fahrenheit = ((9 * temperature)/5) + 32;
    kelvin = temperature + 273.15;
    
        //result after conversion
        System.out.println("\nTemperature in Celcius : " + temperature + "°C");
        System.out.println("Temperature in Reamur : " + reamur + "°R");
        System.out.println("Temperature in Fahrenheit : " + fahrenheit + "°F");
        System.out.println("Temperature in Kelvin : " + kelvin + "°K");
    
        //condition of water
        if (temperature >0 && temperature <100){
            System.out.println("\nCondition : Normal");
        }else if(temperature <= 0){
            System.out.println("\nCondition : Frozen");
        }else if(temperature >= 100){
            System.out.println("\nCondition : Boiling");
        }
        System.out.println("----------------");
    }    
}