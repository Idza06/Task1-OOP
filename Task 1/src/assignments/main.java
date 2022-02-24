/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package assignments;
import java.util.Scanner;
/**
 *
 * @author Qibran Idza L (123200141)
 */
public class main {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        int loop = 1;
        
        System.out.println("+--------------------------------------+");
        System.out.println("| Water Temperature Conversion Program |");
        System.out.println("+--------------------------------------+");
        System.out.println("Data entry");
        System.out.println("----------");
        System.out.print("Temperature in celcius : ");
        convert cvrs = new convert();
        
        double input = Input.nextDouble();
        cvrs.temperature = input;

        while(loop != 3){ 
            
            System.out.println("\nOption");
            System.out.println("1. View conversion data");
            System.out.println("2. Edit conversion data");
            System.out.println("3. Exit");
            System.out.print("Choose : ");
            loop = Input.nextInt();
            
            switch(loop){     
                case 1:
                    cvrs.conversion();
                    break;
                case 2:
                    System.out.println("\nData entry");
                    System.out.println("------------");
                    System.out.print("\nTemperature in celcius :");
                    double input2 = Input.nextDouble();
                    cvrs.temperature = input2;
                    break;
                case 3:
                   break; 
                default:
                    System.out.println("\nOption does not exist. Please enter the options correctly!");
                    break;
            }
        }
    }
}
