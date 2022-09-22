package Something.Java;

import java.util.*;

public class Something {
    public static void main(String[] args){
        System.out.println("Something in the way, she moves n.1");
        System.out.println();

        try (Scanner sc = new Scanner(System.in)){
            System.out.print("Give me number: ");
            int pp = sc.nextInt();
            System.out.println();

            while(pp > 0){
                pp--;
                System.out.print("*");
            }
        }
    }
}    