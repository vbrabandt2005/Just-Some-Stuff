package piao.Java;

/**
 * name: xue hua piao piao
 * 
 * description:
 * It asks the user if "xue hua piao piao" is the most beautiful song ever. If the user answers "yes",
 * it opens the song in the default browser. If the user answers "no", it opens the song in the default
 * browser in a loop. If the user answers anything else, it opens "Never Gonna Give You Up" in
 * the default browser.
 * 
 * it's also kind of a virus too but yeah
 * author: @TheGoogleRider
 * version: 1
 * date: 28/09/2022
 */


import java.util.*;
import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class piao {
    public static void main(String[] args) throws IOException, InterruptedException{
        
        try (Scanner sc = new Scanner(System.in)){
            System.out.println("Is 'xue hua piao piao' the most beutiful song ever? Yes or No");
            System.out.println("If you say no YOU WILL BE PUNISH!!");
            String ans = sc.nextLine();
            if (ans.equals("yes") || ans.equals("Yes") || ans.equals("YES")){
                Desktop desktop = java.awt.Desktop.getDesktop();
                    try {
                        URI oURL = new URI("https://www.youtube.com/watch?v=VKq2flvS7dw");
            	        desktop.browse(oURL);
                    }   
                    catch (URISyntaxException e){
                    e.printStackTrace();
                    }
            }
            else if (ans.equals("no") || ans.equals("No") || ans.equals("NO")){
                while (true){
                    Desktop desktop = java.awt.Desktop.getDesktop();
                    try{
                        URI oURL = new URI("https://www.youtube.com/watch?v=VKq2flvS7dw");
            	        desktop.browse(oURL);
                        Thread.sleep(120);
                    }   
                    catch (URISyntaxException e){
                    e.printStackTrace();
                    }
                }
            }
            else{
                Desktop desktop = java.awt.Desktop.getDesktop();
                try{
                    URI oURL1 = new URI("https://www.youtube.com/watch?v=dQw4w9WgXcQ");
                    desktop.browse(oURL1);
                }
                catch (URISyntaxException e){
                    e.printStackTrace();
                }
            }
        }
    }    
}

//By TheGoogleRider