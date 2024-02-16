
package labactivity;

import java.util.Scanner;


public class Labactivity {

   static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter message: ");
    String message = scan.nextLine();
    
    String [] letters = message.split("\\s+");
    int upper = 0;
    
    for (String letter : letters){
        if (!letter.isEmpty()){
            letter = letter.substring(1);
            
            for (char j : letter.toCharArray()){
                if (j >= 'A' && j <= 'Z') {
                    upper++;
                    break;
                }
            }
        }
    }
    
    if (upper > 0){
        System.out.println("Jeje!");
    } else {
        System.out.println("uWu!");
    }
    }
    
}
