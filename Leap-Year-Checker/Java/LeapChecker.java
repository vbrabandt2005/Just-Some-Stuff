/**
 * name: Leap-Year-Checker
 * description:
 * Simple Leap year checker, enter a year and it will check it for you
 * 
 * author: @TheGoogleRider2
 * version: (V1.1)
 * date: 12/09/2022
**/ 

import java.util.*;

public class LeapChecker{
    public static void main(String[] args){
        System.out.println("Leap-Year-Checker_V.1.1");
        System.out.println();
        System.out.println("Please enter a year between 1582 - 3000");
        
        try (Scanner sc = new Scanner(System.in)) {
            
            System.out.print("Enter the year: ");
            int year = sc.nextInt();
            System.out.println();
            
            int a = 1582;
            int b = 3000;

            if (year >= a && b >= year){
                
                if ((year%4 == 0 && year%100 != 0) || (year%400 == 0)){
                    System.out.println(year+" is a leap year");
                }
                else {
                    System.out.println(year+" is not a leap year");
                }
            }

            else {
                System.out.print("Please Try AGAIN!!!");
            }
        }
    }
}
    
//By TheGoogleRider