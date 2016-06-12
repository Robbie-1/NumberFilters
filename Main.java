package ac.uk.reigate.RM13030;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Robbie
 * @since 25-09-2015
 */

public class Main {
    
    static ArrayList<Integer> numList = new ArrayList();
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter a number:");
        int num = s.nextInt();
        
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
