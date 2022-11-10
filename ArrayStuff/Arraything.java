/**
 * It's supposed to print out a random card from a deck of cards.
 */

 
package ArrayStuff;

public class Arraything {
    public static void main(String[] args){
        System.out.println();
        int max = 0;
        int min = 8;

        String[] Kartenspiel = {"Placeholder","Seven", "Eight", "Nine", "Ten", "Bube", "Dame", "König", "Ass"};

        for (int i = 0; i < 7; i++){
            int Kartensnum = (int) Math.floor(Math.random()*(max-min+1)+min);
            System.out.println(Kartenspiel[Kartensnum]);
        }
        System.out.println();
    }
}
