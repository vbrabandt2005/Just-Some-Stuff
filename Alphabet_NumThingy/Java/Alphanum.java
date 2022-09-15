package Alphabet_NumThingy.Java;
/**
 * name: Alphanum
 * description: Tell what where the letter is in the alphabet
 * 
 * author: @TheGoogleRider2
 * version: 1
 * date: 15/09/2022
**/

import java.util.*;

public class Alphanum{

    public static int findPosition(char inputletter){

        char in = Character.toLowerCase(inputletter);
        int ascii = (int)in;
        int position = ascii-96;
        return position;
    }
    public static void main(String[] Args){
        System.out.println("Alphanum v1");
        System.out.println();
        
        try (Scanner sc = new Scanner(System.in)){
            System.out.print("Give me letter: ");
            char letter = sc.next().charAt(0);
            System.out.println();
            
            int position = Alphanum.findPosition(letter);
            System.out.println("The Letter " + letter + " is the " + position + " Letter of the alphabet");  
        }
    }
}

//By TheGoogleRider