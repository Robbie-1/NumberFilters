package ac.uk.reigate.RM13030;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Robbie
 * @since 25-09-2015
 */
public class StretchAndChallenge {
    
    static ArrayList<Integer> numList = new ArrayList();
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter a number:");
        int num = s.nextInt();
        System.out.println("Would you like to print odd (O), even (E), or sequential (S) numbers?");
        String resp = s.next();
        
        if (resp.equalsIgnoreCase("O")) {
            for (int i = (num - 1); i > -1; i--) {
                if (isOdd((num - i))) {
                    numList.add((num - i));
                    System.out.println(numList.toString());
                }
            }
            
            for (int i = (numList.size() - 1); i > 0; i--) {
                numList.remove(i);
                System.out.println(numList.toString());
            }
        }
        
        else if (resp.equalsIgnoreCase("E")) {
            for (int i = (num - 1); i > -1; i--) {
                if (!isOdd((num - i))) {
                    numList.add((num - i));
                    System.out.println(numList.toString());
                }
            }
            
            for (int i = (numList.size() - 1); i > 0; i--) {
                numList.remove(i);
                System.out.println(numList.toString());
            }
        }
        
        else if (resp.equalsIgnoreCase("S") || resp.equals("")){
            for (int i = (num - 1); i > -1; i--) {
                numList.add((num - i));
                System.out.println(numList.toString());
            }
        
            for (int i = (numList.size() - 1); i > 0; i--) {
                numList.remove(i);
                System.out.println(numList.toString());
            }
        }
    }
    
    public static boolean isOdd(int num) {
        return (num % 2 != 0);
    }

}
