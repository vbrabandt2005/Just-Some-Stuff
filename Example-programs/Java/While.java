/**
 * name: While Loop example program
 * 
 * It asks the user if they want to repeat the program, and if they say yes, it repeats, and if they say no, it stops
 */
import java.util.*;

public class While {
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            boolean Continue = true;
            while(Continue == true){
                
                System.out.println("Repeat, yes or no?");
                String input = sc.nextLine();

                if (input.equals("yes") || input.equals("Yes") || input.equals("YES")){
                    System.out.println("Ok");
                    Continue = true;
                }
                else if (input.equals("no") || input.equals("No") || input.equals("NO")){
                    System.out.println("Ok");
                    Continue = false;
                }
            }
        }
    }
}

//By TheGoogleRider