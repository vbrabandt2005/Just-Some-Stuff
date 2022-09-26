package Minidic.Java;

import java.util.Scanner;

public class Minidic {
    public static void main(String[] args){
        System.out.println("Minidic_v.1");
        System.out.println();
        System.out.print("Start, Yes?"); //1 is yes currently
        try (Scanner sc = new Scanner(System.in)){
            System.out.println();
            int start = sc.nextInt();
            System.out.println();

            if (start == 1){ //Game Start
                double Savings = 100;
                System.out.println("Your current savings is "+Savings+" Euro");
                System.out.println("Do you wish to bet?"); //1 is yes currently
                int choice1 = sc.nextInt();
                System.out.println();

                if (choice1 == 1){ //wants to bet
                    System.out.println("Single or Double?");
                    int choice2 = sc.nextInt();
                    System.out.println();

                    if (choice2 == 1){ //single
                        System.out.println("How much do you wanna bet?");
                        double bet = sc.nextDouble();
                        System.out.println();

                        if (bet <= Savings){
                            System.out.println("choose 1 to 6");
                            int guess = sc.nextInt();
                            System.out.println();

                            int Dice1 = (int) (Math.random() * 6+1);
                            System.out.println("Dice = "+Dice1);

                            if (guess == Dice1){
                                System.out.println("You WON!!");
                                System.out.println();
                                System.out.println("Dice = "+Dice1);
                            }
                            

                        }
                        else{
                            System.out.println("GET SOME MONEY YOU CHEATER!!!");
                        }
                    }

                    if (choice2 == 2){ //double

                    }
                }
            }
        }
    }
}



//int Dice1 = (int) (Math.random() * 6+1);
//int Dice2 = (int) (Math.random() * 6+1);


