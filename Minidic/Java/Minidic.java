package Minidic.Java;

/**
 * name: MiniDic
 * 
 * 
 * A simple dice game.
 */

import java.util.Scanner;
import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class Minidic {

    public static void main(String[] args) throws IOException{
        System.out.println("Minidic_v.1");
        System.out.println();
        System.out.print("Start, Yes or No?"); //1 is yes currently
        try (Scanner sc = new Scanner(System.in)){
            System.out.println();
            String start = sc.next();
            System.out.println();

            if (start.equals("yes") || start.equals("Yes") || start.equals("YES")){ //Game Start
                double savings = 100;
                System.out.println("Your current savings is "+savings+" Euro");
                System.out.println("Do you wish to bet? Yes or No");
                String choice1 = sc.next();
                System.out.println();

                if (choice1.equals("yes") || choice1.equals("Yes") || choice1.equals("YES")){ //wants to bet
                    System.out.println("Single or Double?");
                    String choice2 = sc.next();
                    System.out.println();

                    if (choice2.equals("Single") || choice2.equals("single")){ //single
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
                                else{
                                    System.out.println("wait, how the hell did you win?");
                                }
                                System.out.println();
                                savings = savings + bet*3;
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
                                savings = savings + bet*4;
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
                    else if (choice2.equals("Double") || choice2.equals("double")){ //field
                        System.out.println("How much do you wanna bet?");
                        double bet = sc.nextDouble();
                        System.out.println();
                        System.out.println(bet+" has been taken from your savings");
                        System.out.println("Your current savings is "+savings);

                        if (bet <= savings){
                            System.out.println("choose 2 to 12");
                            int guess = sc.nextInt();
                            System.out.println();

                            int Dice1 = (int) (Math.random() * 6+1); 
                            int Dice2 = (int) (Math.random() * 6+1);

                            int Dicsum = Dice1 + Dice2;

                            if (guess == Dicsum){
                                System.out.println("You have WON!!");
                                System.out.println();
                                System.out.println("Dice Sum = "+Dicsum);
                                System.out.println("1st Dice = "+Dice1);
                                System.out.println("2nd Dice = "+Dice2);
                                System.out.println();
                                savings = savings + bet*3;
                                System.out.println(bet+" has been added to your savings");
                                System.out.println("Your current savings is "+savings);
                            }
                            else if (guess != Dicsum){
                                System.out.println("You have lost");
                                System.out.println();
                                System.out.println("Dice Sum = "+Dicsum);
                                System.out.println("1st Dice = "+Dice1);
                                System.out.println("2nd Dice = "+Dice2);
                                System.out.println();
                                System.out.println("Your current savings is "+savings);
                            }

                        }
                        else{
                            System.out.println("GET SOME MONEY YOU CHEATER!!!");
                        }
                    }
                }
                else if (choice1.equals("no") || choice1.equals("No") || choice1.equals("NO")){
                    System.out.println("Are you sure?");
                    String sure2 = sc.next();
                    System.out.println();
                    if (sure2.equals("yes") || sure2.equals("Yes") || sure2.equals("YES")){
                        System.out.println("You decided to live a happy stable life");
                        System.out.println("You have worked your arse off to become a millionaire");
                        System.out.println();
                        savings = 100000000;
                        System.out.println("You have gained "+savings);
                        System.out.println("Gambling is bad kids");
                    }
                    else{
                        System.out.println("PP");
                    }
                }
                else{
                    System.out.println("Please Write Properly");
                }
            }
            else{
                Desktop desktop = java.awt.Desktop.getDesktop();
		        try {
			        URI oURL = new URI("https://www.youtube.com/watch?v=dQw4w9WgXcQ");
                    URI oURL2 = new URI("https://www.youtube.com/watch?v=VKq2flvS7dw");
			        desktop.browse(oURL);
                    desktop.browse(oURL2);
                }   
                catch (URISyntaxException e) {
			        e.printStackTrace();
		        }
            }    
        }
    }
}
