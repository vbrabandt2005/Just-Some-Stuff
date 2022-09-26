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
                double savings = 100;
                System.out.println("Your current savings is "+savings+" Euro");
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

                        System.out.println(bet+" has been taken from your savings");
                        savings = savings - bet;
                        System.out.println("Your current savings is "+savings);

                        if (bet <= savings){
                            System.out.println("choose 1 to 6");
                            int guess = sc.nextInt();
                            System.out.println();
                            
                            int Dice1 = (int) (Math.random() * 6+1); 
                            int Dice2 = (int) (Math.random() * 6+1);
                            
                            if (guess == Dice1 || guess == Dice2){ //Simple bet win
                                System.out.println("You Won!!");
                                System.out.println();
                                if (guess == Dice1){
                                    System.out.println("1st Dice = "+Dice1);
                                    System.out.println("2nd Dice = "+Dice2);
                                }
                                else if (guess == Dice2){
                                    System.out.println("2nd Dice = "+Dice2);
                                    System.out.println("1st Dice = "+Dice1);
                                }
                                System.out.println();
                                savings = bet*2 + savings;
                                System.out.println(bet+" has been added to your savings");
                                System.out.println("Your current savings is "+savings);

                            }
                            else if (guess == Dice1 && guess == Dice2){ //bigger bet win
                                System.out.println("YOU WON EVEN MORE!!!");
                                System.out.println();
                                System.out.println("Your Guess = "+guess);
                                System.out.println("1st Dice = "+Dice1);
                                System.out.println("2nd Dice = "+Dice2);
                                System.out.println();
                                savings = bet*3 + savings;
                                System.out.println(bet+" has been added to your savings");
                                System.out.println("Your current savings is "+savings);

                            }
                            else if (guess != Dice1 && guess != Dice2){ //lost
                                System.out.println("You Lost");
                                System.out.println();
                                System.out.println("Your guess was "+guess);
                                System.out.println("1st Dice = "+Dice1);
                                System.out.println("2nd Dice = "+Dice2);
                                System.out.println();
                                savings = bet - savings;
                                System.out.println("Your savings has been decreased by "+bet);
                                System.out.println("Your current savings is "+savings);
                            }
                            else{
                                System.out.println("Please Choose a number from 1 to 6");
                            }
                        }
                        else{
                            System.out.println("GET SOME MONEY YOU CHEATER!!!");
                        }
                    }
                    if (choice2 == 2){ //field

                    }
                }
            }
        }
    }
}

