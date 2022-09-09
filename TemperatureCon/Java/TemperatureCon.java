package TemperatureCon.Java;
import java.util.*;

/**
 * name: TemperatureCon
 * description:
 * Simple Temperature Converter in Java
 * 
 * author: @TheGoogleRider
 * version: (1.0)
 * date: 09/09/2022
**/


public class TemperatureCon{
    public static void main(String[] args){
        System.out.println("TemperatureCon_1.0-Java");
        System.out.println();
        
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter '1' for Celsius");
            System.out.println("Enter '2' for Fahrenheit");
            System.out.println("Enter '3' for Kelvin");
            System.out.println();
            System.out.print("Enter the unit you want to convert: ");
            int unit = sc.nextInt();
            System.out.println();

            boolean ChooseOption = false;
            while(ChooseOption){
                
                if(unit==1){ //Celcius Input
                    System.out.print("Input Celcius: ");
                    double c = sc.nextDouble();
                    System.out.println();
                    
                    double f = c * 9/5 + 32;
                    System.out.println("Fahrenheit = "+f);
                    double k = c + 273.15;
                    System.out.println("Kelvin = "+k);

                    ChooseOption = false;
                }
            
                else if(unit==2){ //Fahrenheit Input
                    System.out.print("Input Fahrenheit: ");
                    double f = sc.nextDouble();
                    System.out.println();

                    double c = (f - 32) * 5/9;
                    System.out.println("Celcius = "+c);
                    double k = (f - 32) * 5/9 + 273.15;
                    System.out.println("Kelvin = "+k);

                    ChooseOption = true;
                }

                else if(unit==3){ //Kelvin Input
                    System.out.print("Input Kelvin: ");
                    double k = sc.nextDouble();
                    System.out.println();

                    double c = k - 273.15;
                    System.out.println("Celcius = "+c);
                    double f = (k - 273.15) * 9/5 + 32;
                    System.out.println("Fahrenheit = "+f);

                    ChooseOption = false;
                }
            
                else{
                    System.out.println("Please enter a proper Unit");

                    ChooseOption = false;
                }
            }
        }
    }
}    