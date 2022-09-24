/**
 * name: BigSmall
 * description:
 * Input Upper Case text and you can choose to Lower case it and Stuff
 * 
 * author: @TheGoogleRider2
 * version: (V1)
 * date: 24/09/2022
**/ 

import java.util.*;

public class Bigsmall{
    public static void main(String[] args){

        System.out.println("BigSmall v1");
        System.out.println();

        try (Scanner sc = new Scanner(System.in)){
            System.out.print("Give me sentence: ");
            String sen = sc.nextLine();
            System.out.println("Upper = 1 & Lower = 2");
            System.out.print("Upper or Lower: ");
            int unit = sc.nextInt();
            System.out.println();

            if (unit == 1){
                System.out.println("Input: " + sen);
                System.out.println("Output: " + sen.toUpperCase());
            }
            else if (unit == 2){
                System.out.println("Input: " + sen);
                System.out.println("Output: " + sen.toLowerCase());
            }
            else{
                System.out.println("Please choose from the 2 choices!!");
            }
        }
    }
}

//By TheGoogleRider